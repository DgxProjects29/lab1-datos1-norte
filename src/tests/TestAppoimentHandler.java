package tests;

import java.io.File;
import java.util.ArrayList;
import logic.AppointmentHandler;
import models.Appointment;
import pseudofiles.PseudoFile;

public class TestAppoimentHandler {
    
    public static void main(String[] args) {
        
        PseudoFile pseudoFile = new PseudoFile(
            new File("data/citas_pendientes.csv"),
            Appointment.getColumns()
        );

        AppointmentHandler apo = new AppointmentHandler();
        apo.generateDates();
        apo.filterDates(pseudoFile, "2001514832");
        
        ArrayList<String> dates = apo.getAvaliableDates();
        for (String string : dates) {
            System.out.println(string);
        }
    }
}
