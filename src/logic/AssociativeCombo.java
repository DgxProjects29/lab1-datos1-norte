package logic;

import javax.swing.DefaultComboBoxModel;
import java.io.IOException;
import java.util.HashMap;

import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileReader;

public class AssociativeCombo implements FieldMapper{
    
    private PseudoFile pseudoFile;
    private String userField;
    private String keyField;
    private DefaultComboBoxModel<String> defaultComboBoxModel;
    private HashMap<String, String> keyValueMapper;

    public AssociativeCombo(PseudoFile pseudoFile, String keyField, 
        String userField) {

        this.pseudoFile = pseudoFile;
        this.userField = userField;
        this.keyField = keyField;
        
        defaultComboBoxModel = new DefaultComboBoxModel<>();
        keyValueMapper = new HashMap<>();

        fillModel();
    }

    private void fillModel(){

        try {
            PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);

            pseudoReader.readRegister();
            while (!pseudoReader.EFO()){
                String comboValue = pseudoReader.getField(keyField) + " - " +
                    pseudoReader.getField(userField);
                
                defaultComboBoxModel.addElement(comboValue);
                keyValueMapper.put(comboValue, pseudoReader.getField(keyField));

                pseudoReader.readRegister();
            }
            pseudoReader.close();
        } catch (IOException e) {
            defaultComboBoxModel.addElement("Error");
        }
    }

    public DefaultComboBoxModel<String> getComboModel(){
        return defaultComboBoxModel;
    }

    @Override
    public String getRealValue() {
        return keyValueMapper.get(defaultComboBoxModel.getSelectedItem());
    }
}
