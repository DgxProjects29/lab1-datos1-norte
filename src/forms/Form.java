package forms;

public interface Form {
    
    public void validate();

    public boolean isDataValid();

    public String getErrorMessage();

    public String[] getValidRegister();
    
}
