package forms.registerforms;

import forms.Form;
import forms.ValidationError;
import models.Product;

public class RegisterProducto implements Form {

    private String codigo;
    private String name;
    private String detalles;
    private String preciodecompra;
    private String stock;
    private String proveedorcod;

    private Product producto;
    private boolean isDataValid;
    private String errorMessage;
    private Validation validation = new Validation();

    public RegisterProducto(String codigo, String name, String detalles,
            String preciodecompra, String stock, String codigocod) {
        this.codigo = codigo;
        this.name = name;
        this.detalles = detalles;
        this.preciodecompra = preciodecompra;
        this.stock = stock;
        this.proveedorcod = codigocod;

        isDataValid = true;
        errorMessage = "";
    }

    @Override
    public void validate() {
        try {
            validateDataTypes();
            checkSizeCode();
            checkSizeName();
            checkSizeDetails();
            checkPrize();
            checkSizeStock();
            checkSizeProviderCode();

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }

    }

    private void validateDataTypes() throws ValidationError {

        try {
            producto = new Product();
            producto.setCodigo(codigo);
            producto.setName(name);
            producto.setDetalles(detalles);
            producto.setPrecioDeCompra(preciodecompra);
            producto.setStock(stock);
            producto.setProveedorCod(proveedorcod);

        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }

    }

    //validar nombre 
    private void checkSizeName() throws ValidationError {

        if (validation.validateCharField(name, 1, 50)) {

        } else {

            throw new ValidationError("Nombre invalido. Por favor, asegurese de "
                    + "que el nombre suministrado se encuentre entre 4 y 25 "
                    + "caracteres. Recuerda que debes ingresar tu nombre completo (nombre y apellidos)");

        }

    }

    //validar codigo
    private void checkSizeCode() throws ValidationError {

        if (validation.validateCharField(codigo, 1, 50)) {

        } else {

            throw new ValidationError("Codigo invalido. Por favor, asegurese de "
                    + "que el codigo suministrado se encuentre entre 1 y 50 caracteres. ");
        }

    }

    private void checkSizeDetails() throws ValidationError {

        if (validation.validateCharField(detalles, 1, 100)) {

        } else {

            throw new ValidationError("Detalles invalidos. Por favor, asegurese de "
                    + "que los detalles suministrados se encuentren entre 1 y 100 caracteres. ");
        }

    }
    
    
    private void checkPrize() throws ValidationError {

        int prize = Integer.parseInt(preciodecompra);

        if (prize > 0) {

        } else {

            throw new ValidationError("Precio invalido. Por favor, asegurese de "
                    + "que el estock suministrado sea mayor que 0. ");
        }
        
    }
    

    private void checkSizeStock() throws ValidationError {

        int stocker = Integer.parseInt(stock);

        if (stocker >= 0) {

        } else {

            throw new ValidationError("Stock invalido. Por favor, asegurese de "
                    + "que el estock suministrado sea mayor o igual que 0. ");
        }
        
    }

    private void checkSizeProviderCode() throws ValidationError {

        if (validation.validateCharField(proveedorcod, 1, 50)) {

        } else {

            throw new ValidationError("Codigo invalido. Por favor, asegurese de "
                    + "que el codigo suministrado se encuentre entre 1 y 50 caracteres. ");
        }
    }

    @Override
    public boolean isDataValid() {
        return isDataValid;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String[] getValidRegister() {
        return new String[]{codigo, name, detalles, preciodecompra,
            stock, proveedorcod};
    }

}
