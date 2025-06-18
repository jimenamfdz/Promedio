public class Main {

    public static void main(String[] args) {
       
        Garage garage= new Garage(4);

        Coche coche1 = new Coche("BFD987", "Nissan", 2);
        Coche coche2 = new Coche("SDF765", "Toyota", 4 );
        Motocicleta moto1 = new Motocicleta("MET123", "Yamaha", true );
        Motocicleta moto2 = new Motocicleta("MIT953", "Susuki", false);

        garage.estacionar(coche1);
        garage.estacionar(coche2);
        garage.estacionar(moto1);
        garage.estacionar(moto2);

        System.out.println("Se retiro vehículo con placa 'BFD987' ");
        boolean retirando = garage.retirar("BFD987");
        System.out.println("Retirado");

        System.out.println("Total de vehículo en el garage \n" + garage.contarVehiculos());

    }

    


}
