public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null && !nombreUsuario.isEmpty()) {
            this.nombreUsuario = nombreUsuario;
        } else {
            System.out.println("El nombre de usuario no puede ser nulo ni vacío.");
        }
    }

    public void setPassword(String password) {
        if (password == null) {
            System.out.println("La contraseña no puede ser nula.");
            return;
        }

        if (password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                tieneMayuscula = true;
            } else if (c >= 'a' && c <= 'z') {
                tieneMinuscula = true;
            } else if (c >= '0' && c <= '9') {
                tieneDigito = true;
            }
        }

        if (!tieneMayuscula) {
            System.out.println("La contraseña debe contener al menos una letra mayúscula.");
            return;
        }

        if (!tieneMinuscula) {
            System.out.println("La contraseña debe contener al menos una letra minúscula.");
            return;
        }

        if (!tieneDigito) {
            System.out.println("La contraseña debe contener al menos un dígito.");
            return;
        }

        this.password = password;
    }

    public boolean autenticar(String intentPassword) {
        return this.password != null && this.password.equals(intentPassword);
    }

    public boolean estaInicializado() {
        return nombreUsuario != null && password != null;
    }
}
