/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authviews;

import clientviews.ClientView;
import inevaup.dialogs.InfoDialog;
import java.io.IOException;
import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileReader;

/**
 *
 * @author usuario
 */
public class AuthLogic {

    public boolean autenticacion(PseudoFile file, String ced, String password) {
        boolean x=false;
        try {

            PseudoFileReader pseudoReader = new PseudoFileReader(file);
            pseudoReader.readRegister();
            while (!pseudoReader.EFO() && (x == false)) {
                if (((pseudoReader.getField("cedula")).equals(ced))
                        && ((pseudoReader.getField("contraseña")).equals(password))) {
                    x = true;
                }
                pseudoReader.readRegister();
            }
            pseudoReader.close();
            
        } catch (IOException e) {
            System.out.println(e);
        } return x;
    }
}
