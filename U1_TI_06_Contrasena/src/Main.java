import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioSeguro usuario = new UsuarioSeguro();

        System.out.print("Ingrese nombre de usuario: ");
        String nombre = sc.nextLine();
        usuario.setNombreUsuario(nombre);

        System.out.print("Ingrese contraseña: ");
        String pass = sc.nextLine();
        usuario.setPassword(pass);

        if (!usuario.estaInicializado()) {
            System.out.println("No se pudo crear el usuario. Intente nuevamente.");
            sc.close();
            return;
        }

        System.out.print("Ingrese nuevamente la contraseña para autenticar: ");
        String intento = sc.nextLine();

        if (usuario.autenticar(intento)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        sc.close();
    }
}