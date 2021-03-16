package vetapp;

import authviews.GeneralAuthView;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.File;
import pseudofiles.PseudoFile;

public class VetApp {
    
    public static void main(String[] args) {
        
        FlatLightLaf.install();
        
        AuthManager auth = AuthManager.getAuth();
        auth.setPseudoFile(new PseudoFile(new File("data/clientes.csv")));
        
        GeneralAuthView authView = new GeneralAuthView();
        authView.setVisible(true);
      
    }
}
