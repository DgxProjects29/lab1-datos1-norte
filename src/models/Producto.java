package models;

public class Producto {

    private String codigo;
    private String name;
    private String detalles;
    private Double preciodecompra;
    private int stock;
    private String proveedorcod;

    public Producto(String codigo, String name, String detalles, 
        Double preciodecompra, int stock, String proveedorcod) {
        
        this.codigo = codigo;
        this.name = name;
        this.detalles = detalles;
        this.preciodecompra = preciodecompra;
        this.stock = stock;
        this.proveedorcod = proveedorcod;

    }

    public Producto() {

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setPrecioDeCompra(String preciodecompra) {
        this.preciodecompra = Double.parseDouble(preciodecompra);
    }

    public Double getPrecioDeCompra() {
        return preciodecompra;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = Integer.parseInt(stock);

    }

    public String getProveedorCod() {
        return proveedorcod;
    }

    public void setProveedorCod(String proveedorcod) {
        this.proveedorcod = proveedorcod;
    }

}
