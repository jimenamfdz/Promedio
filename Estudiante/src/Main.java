import Model.Estudiante;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Estudiante estudianteUno = new Estudiante();
        Estudiante estudianteDos = new Estudiante();
        Estudiante estudianteTres = new Estudiante();
        Estudiante estudianteCuatro = new Estudiante();
        Estudiante estudianteCinco = new Estudiante();

        double nota;
        String nombre, matricula;

        System.out.println();
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.next();
        estudianteUno.setNombre(nombre);
        System.out.println("Ingresa tu matricula: ");
        matricula = sc.next();
        estudianteUno.setMatricula(matricula);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            nota = sc.nextDouble();
            estudianteUno.setNotas(i, nota);
        }

        System.out.println();
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.next();
        estudianteDos.setNombre(nombre);
        System.out.println("Ingresa tu matricula: ");
        matricula = sc.next();
        estudianteDos.setMatricula(matricula);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            nota = sc.nextDouble();
            estudianteDos.setNotas(i, nota);
        }

        System.out.println();
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.next();
        estudianteTres.setNombre(nombre);
        System.out.println("Ingresa tu matricula: ");
        matricula = sc.next();
        estudianteTres.setMatricula(matricula);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            nota = sc.nextDouble();
            estudianteTres.setNotas(i, nota);
        }

        System.out.println();
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.next();
        estudianteCuatro.setNombre(nombre);
        System.out.println("Ingresa tu matricula: ");
        matricula = sc.next();
        estudianteCuatro.setMatricula(matricula);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            nota = sc.nextDouble();
            estudianteCuatro.setNotas(i, nota);
        }

        System.out.println();
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.next();
        estudianteCinco.setNombre(nombre);
        System.out.println("Ingresa tu matricula: ");
        matricula = sc.next();
        estudianteCinco.setMatricula(matricula);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            nota = sc.nextDouble();
            estudianteCinco.setNotas(i, nota);
        }

        System.out.println("Nombre: " + estudianteUno.getNombre());
        System.out.println("Promedio: " + estudianteUno.calcularPromedio());
        System.out.println("Aprobado: " + estudianteUno.aprobado());

        System.out.println("Nombre: " + estudianteDos.getNombre());
        System.out.println("Promedio: " + estudianteDos.calcularPromedio());
        System.out.println("Aprobado: " + estudianteDos.aprobado());

        System.out.println("Nombre: " + estudianteTres.getNombre());
        System.out.println("Promedio: " + estudianteTres.calcularPromedio());
        System.out.println("Aprobado: " + estudianteTres.aprobado());

        System.out.println("Nombre: " + estudianteCuatro.getNombre());
        System.out.println("Promedio: " + estudianteCuatro.calcularPromedio());
        System.out.println("Aprobado: " + estudianteCuatro.aprobado());

        System.out.println("Nombre: " + estudianteCinco.getNombre());
        System.out.println("Promedio: " + estudianteCinco.calcularPromedio());
        System.out.println("Aprobado: " + estudianteCinco.aprobado());

        sc.close();
    }
}