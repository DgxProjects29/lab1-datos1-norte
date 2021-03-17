package tests;

import java.io.File;
import java.util.ArrayList;
import logic.AppointmentHandler;
import pseudofiles.PseudoFile;

public class TestAppoimentHandler {
    
    public static void main(String[] args) {
        
        PseudoFile pseudoFile = new PseudoFile(
            new File("src/tests/testdata/appotest.csv"),
            new String[]{"idCita", "empieza", "cedVet"}
        );

        AppointmentHandler apo = new AppointmentHandler();
        apo.generateDates();
        apo.filterDates(pseudoFile, "200");
        
        ArrayList<String> dates = apo.getAvaliableDates();
        for (String string : dates) {
            System.out.println(string);
        }
    }
}
