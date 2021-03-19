package logic;

import javax.swing.DefaultComboBoxModel;

public interface FieldMapper {
    
    public DefaultComboBoxModel<String> getComboModel();

    public String getRealValue();
}
