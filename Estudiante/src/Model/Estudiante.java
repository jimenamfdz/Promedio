package Model;

public class Estudiante {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotas(int i) {
        return notas[i];
    }

    public void setNotas(int i, double nota) {
        this.notas[i] = nota;
    }

    public double calcularPromedio() {
        double suma = 0;
        for(int i = 0; i < notas.length ; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }
}