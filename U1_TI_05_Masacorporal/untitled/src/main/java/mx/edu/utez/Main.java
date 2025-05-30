package mx.edu.utez;

import java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Digite o nombre: ");
        String nombre = entrada.nextLine();
        persona.setNombre(nombre);

        System.out.println("Ingresa tu altura: ");
        double altura = entrada.nextDouble();
        persona.setAltura(altura);

        System.out.println("Ingresa tu peso: ");
        double peso = entrada.nextDouble();
        persona.setPeso(peso);

        double imc = persona.calcularIMC();
        String clasificacion = persona.clasificarIMC();

        System.out.printf("Hola %s, tu IMC es: %.2f\n", persona.getNombre(),imc);
        System.out.println("Clasificacion: " + clasificacion);

        entrada.close();
         
    }
}