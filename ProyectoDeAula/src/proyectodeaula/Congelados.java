package proyectodeaula;


public class Congelados extends Producto{

    public Congelados() {
    }

    public Congelados(String nombreProducto, String cantidad, double precio, long codigo, Proveedor vendidoEn) {
        super(nombreProducto, cantidad, precio, codigo, vendidoEn);
    }
    
    @Override
    public boolean buscarProducto(long codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(long codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregar(long codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}