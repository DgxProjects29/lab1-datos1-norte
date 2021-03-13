package registerforms;

import forms.Form;
import forms.ValidationError;
import models.Producto;

public class RegisterProducto implements Form {

    private String codigo;
    private String name;
    private String detalles;
    private String preciodecompra;
    private String stock;
    private String proveedorcod;

    private Producto producto;
    private boolean isDataValid;
    private String errorMessage;

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
            checkSizeName();

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }

    }

    private void validateDataTypes() throws ValidationError {

        try {
            producto = new Producto();
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
        String namer = name;
        if (namer.length() >= 14 && namer.length() <= 30) {
            int i = 1, sw = 0, seg = 0;
            while (i < namer.length()) {

                if (namer.substring(i, i + 1).equals(" ") && seg >= 3) {
                    sw += 1;

                }

                if (!(namer.substring(i, i + 1).equals(" "))) {
                    seg += 1;

                } else {

                    seg = 0;

                }

            }
            //si sw < 2 eso quiere decir que hay menos de dos especios entre tres caracteres consecutivos 
            if (sw < 2) {
                throw new ValidationError("Nombre invalido");
            }
        } else {

            throw new ValidationError("Nombre invalido");

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
