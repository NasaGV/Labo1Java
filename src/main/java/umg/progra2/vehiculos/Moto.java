package umg.progra2.vehiculos;

public class Moto extends Vehiculos{
    boolean TieneSidecar;

    public Moto(String marca, String modelo, int ano, boolean TieneSidecar) {
        super(marca, modelo, ano);
        this.TieneSidecar = TieneSidecar;
    }

    public Boolean getTieneSidecar() {
        return TieneSidecar;
    }
    public void setTieneSidecar(Boolean tieneSidecar) {
        TieneSidecar = tieneSidecar;
    }

    @Override
    public void MostrarDetalles() {
        super.MostrarDetalles();
        System.out.println("Tiene Sicader: " + (TieneSidecar ? "Si": "No"));

    }

}
