public class VehiculosPasajeros extends Vehiculo{

    private int numPasajeros;

    public VehiculosPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros){
        super(marca, modelo, año, kilometraje);
        this.numPasajeros= numPasajeros;
    }

    public int getnumPasajeros(){
        return numPasajeros;
    }

    @Override
    public void mostrarInfo(){
     super.mostrarInfo();
     System.out.println("Numero de Pasajeros: "+numPasajeros);
    }

}
