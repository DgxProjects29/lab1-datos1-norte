package forms;

import javax.swing.DefaultComboBoxModel;
import java.io.IOException;
import java.util.Vector;

import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileReader;

public class ComboFieldGetter {
    
    private PseudoFile pseudoFile;
    private String fieldName;

    public ComboFieldGetter(PseudoFile pseudoFile, String fieldName) {

        this.pseudoFile = pseudoFile;
        this.fieldName = fieldName;
    }

    public DefaultComboBoxModel<String> getComboModel(){
        Vector<String> fields = new Vector<>();
        try {
            PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);

            pseudoReader.readRegister();
            while (!pseudoReader.EFO()){
                fields.add(pseudoReader.getField(fieldName));
                pseudoReader.readRegister();
            }
            pseudoReader.close();
        } catch (IOException e) {
            fields.add("Error");
        }

        return new DefaultComboBoxModel<String>(fields);
    }

}
