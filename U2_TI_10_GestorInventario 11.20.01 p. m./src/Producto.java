public class Producto {

    private String codigo;
    private String nombre;
    private int cantidad;

    public Producto(String codigo, String nombre, int cantidad) {
        setCodigo(codigo);
        this.nombre = nombre;
       setCantidad(cantidad);
    }

    public void setCodigo(String codigo) {
        if(codigo != null) {
            this.codigo = codigo;
        }else {
            System.out.println("Error, El codigo no puede estar vacío ");
        }
    }

    public void setCantidad(int cantidad) {
        if(cantidad >= 0) {
          this.cantidad = cantidad;  
        }else {
            System.out.println("Error, La cantidad no puede ser negativa");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }


    @Override
    public String toString() {
        return codigo + " - " + nombre + "(Cantidad: " + cantidad + ")" ;
    }

    
}
