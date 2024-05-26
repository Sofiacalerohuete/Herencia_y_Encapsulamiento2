public class VehiculoCarga extends Vehiculo{
    private int capacidadCarga;

    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga){
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga= capacidadCarga;

    }

    public int getCapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga=capacidadCarga;
    }
  
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.print("CapacidadC de carga: "+ capacidadCarga+ " kg");

    }
}

