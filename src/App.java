public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, world!");
        
        Auto auto= new Auto("Toyota", "Corolla", 2020, 15000, 5);
        Camion camion= new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        System.out.println("Informacion del Auto: ");
        auto.mostrarInfo();

        double costoporKm = 10.00;
        int kmrecorridos= 6000;

        double CalCostMantenimiento = auto.CalCostMantenimiento(costoporKm, kmrecorridos);
        System.out.println("El costo para mantener el auto sera de: "+ CalCostMantenimiento);


        System.out.println("\nInformacion del Camion: ");
        Camion.mostrarInfo();


    }
}
