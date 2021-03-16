package vetapp;

import java.io.IOException;
import java.util.HashMap;
import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileReader;


public class AuthManager {
    
    private static AuthManager authManager = null;
    private HashMap<String, String> authData;
    private PseudoFile pseudoFile;
    
    public static AuthManager getAuth() {
        if (authManager == null) {
            authManager = new AuthManager();
        }
        return authManager;
    }
    
    private AuthManager() {
        
    }

    public void setAuthData(HashMap<String, String> authData) {
        this.authData = authData;
    }

    public HashMap<String, String> getAuthData() {
        return authData;
    }

    public PseudoFile getPseudoFile() {
        return pseudoFile;
    }

    public void setPseudoFile(PseudoFile pseudoFile) {
        this.pseudoFile = pseudoFile;
    }
    
    public boolean authenticate(PseudoFile pseudoFile, String ced, String password) {
        
        boolean isAuthenticated = false;
        try {

            PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);
            pseudoReader.readRegister();
            while (!pseudoReader.EFO() && !isAuthenticated) {
                if (((pseudoReader.getField("cedula")).equals(ced))
                        && ((pseudoReader.getField("contraseña")).equals(password))) {
                    isAuthenticated = true;
                    setAuthData(new HashMap<>(pseudoReader.getCurrRegister()));
                    setPseudoFile(pseudoFile);
                }
                pseudoReader.readRegister();
            }
            pseudoReader.close();
            
        } catch (IOException e) {
           
        } 
        return isAuthenticated;
    }
    
}
