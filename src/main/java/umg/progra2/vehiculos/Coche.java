package umg.progra2.vehiculos;

public class Coche extends Vehiculos{
   private int NumeroDePuertas;

    public Coche(String marca, String modelo, int ano, int NumeroDePuertas) {
        super(marca, modelo, ano);
        this.NumeroDePuertas = NumeroDePuertas;
    }

    public int getNumeroPuertas() {
        return NumeroDePuertas;
    }

    public void setNumeroDePuertas(int NumeroDePuertas) {
        this.NumeroDePuertas = NumeroDePuertas;
    }

    @Override
    public void MostrarDetalles() {
        super.MostrarDetalles();
        System.out.println("Numero de Puertas: " + NumeroDePuertas);
    }

}
