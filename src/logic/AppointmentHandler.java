
package logic;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileReader;

import java.time.LocalDateTime;

public class AppointmentHandler {

    private LocalTime[] vetSchedule;
    private ArrayList<String> avaliableDates;
    private DateTimeFormatter formatter;

    public AppointmentHandler() {
        vetSchedule = new LocalTime[]{
            LocalTime.of(8, 0),
            LocalTime.of(9, 30),
            LocalTime.of(11, 0),
            LocalTime.of(14, 0),
            LocalTime.of(15, 30)
        };
        avaliableDates = new ArrayList<>();
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : HH:mm:ss");
    }


    public void generateDates(){

        /* Solo puedes agendar citas desde el dia siguiente hasta los 7 dias siguientes */
        
        LocalDate currDate = LocalDate.now();
            
        int maxScheduledays = 7;

        for (int i = 0; i < maxScheduledays; i++) {
            currDate = currDate.plusDays(1);
            DayOfWeek dayOfWeek = currDate.getDayOfWeek();
            if(dayOfWeek != DayOfWeek.SATURDAY 
                && dayOfWeek != DayOfWeek.SUNDAY){
                
                generateDaySchedule(currDate);
            }
        }

    }

    public void filterDates(PseudoFile appoimentFile, String vetCed){
        try {
            PseudoFileReader pseudoReader = new PseudoFileReader(appoimentFile);

            pseudoReader.readRegister();
            while (!pseudoReader.EFO()){
                
                if(pseudoReader.getField("cedVet").equals(vetCed)){
                    avaliableDates.removeIf(
                        s -> s.equals(pseudoReader.getField("empieza"))
                    );
                }

                pseudoReader.readRegister();
            }
            pseudoReader.close();
        } catch (IOException e) {
            
        }
    }

    private void generateDaySchedule(LocalDate currDate){

        for (LocalTime daySchedule : vetSchedule) {
            LocalDateTime startDate = LocalDateTime.of(
                currDate.getYear(), 
                currDate.getMonthValue(), 
                currDate.getDayOfMonth(), 
                daySchedule.getHour(), 
                daySchedule.getMinute(), 
                daySchedule.getSecond()
            );
            avaliableDates.add(startDate.format(formatter));
        }
    }

    public ArrayList<String> getAvaliableDates() {
        return avaliableDates;
    }

    public DefaultComboBoxModel<String> getComboModel(){
        String[] avalDates = new String[avaliableDates.size()]; 
        return new DefaultComboBoxModel<String>(
            avaliableDates.toArray(avalDates)
        );
    }
    
    
}
