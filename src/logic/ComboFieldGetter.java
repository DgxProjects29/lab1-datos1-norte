package logic;

import javax.swing.DefaultComboBoxModel;
import java.io.IOException;

import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileReader;

public class ComboFieldGetter implements FieldMapper{
    
    private PseudoFile pseudoFile;
    private String fieldName;
    private DefaultComboBoxModel<String> defaultComboBoxModel;

    public ComboFieldGetter(PseudoFile pseudoFile, String fieldName) {

        this.pseudoFile = pseudoFile;
        this.fieldName = fieldName;

        fillModel();
    }

    private void fillModel(){

        try {
            PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);

            pseudoReader.readRegister();
            while (!pseudoReader.EFO()){
                defaultComboBoxModel.addElement(
                    pseudoReader.getField(fieldName)
                );
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
        return (String)defaultComboBoxModel.getSelectedItem();
    }

}
