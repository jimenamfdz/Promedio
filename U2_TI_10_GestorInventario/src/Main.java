public class Main {

    public static void main(String[] args) {
      
        Inventario inventario = new Inventario(3);

        Producto p1 = new Producto("01", "Peras", 5 );
        Producto p2 = new Producto("02", "Toronjas", 10);
        Producto p3 = new Producto("03", "Naranjas", 6);
        Producto p4 = new Producto("04", "Sandías", 9);


        System.out.println(inventario.agregarProducto(p1));
        System.out.println("Total items " + inventario.totalItems());
        System.out.println(inventario.agregarProducto(p4));

        Producto buscado = inventario.buscar("02");
        System.out.println(buscado != null ? buscado : "No encontrado");
        System.out.println(inventario.eliminarProducto("01"));
        System.out.println(inventario.agregarProducto(p4));

         System.out.println("Total final de ítems: " + inventario.totalItems());

    }

}
