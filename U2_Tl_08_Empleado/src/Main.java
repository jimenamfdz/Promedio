public class Main {
    public static void main(String[] args) {
        Empleado empCompleto = new EmpleadoTiempoCompleto("01", "Sofia", 22000.0, "Bonos");
        Empleado empPorHoras = new EmpleadoPorHoras("02", "Jose", 1000.0, 60);

        System.out.println("Salario de " + empCompleto.getNombre() + ": $" + empCompleto.calcularSalario());
        System.out.println("Salario de " + empPorHoras.getNombre() + ": $" + empPorHoras.calcularSalario());
    }
}

