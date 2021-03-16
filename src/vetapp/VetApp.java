package vetapp;

import views.authviews.GeneralAuthView;
import com.formdev.flatlaf.FlatLightLaf;

public class VetApp {
    
    public static void main(String[] args) {
        
        FlatLightLaf.install();
        
        GeneralAuthView authView = new GeneralAuthView();
        authView.setVisible(true);
      
    }
}
