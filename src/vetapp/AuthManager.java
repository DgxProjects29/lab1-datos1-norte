package vetapp;

import java.util.HashMap;
import pseudofiles.PseudoFile;


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
    
}
