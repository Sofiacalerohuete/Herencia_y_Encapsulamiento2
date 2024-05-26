public class Auto extends VehiculosPasajeros{
    private  int numPasajeros;

    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros){
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.numPasajeros= numPasajeros;
    }
    public int getnumPasajeros(){
        return numPasajeros;
    }

    public void setPasajeros(int numPasajeros){
        this.numPasajeros= numPasajeros;
    }


    @Override
    public void mostrarInfo(){
     super.mostrarInfo();
     System.out.println("Numero de Pasajeros: "+numPasajeros);
    }
}

