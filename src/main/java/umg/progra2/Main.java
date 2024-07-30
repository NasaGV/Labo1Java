package umg.progra2;

import Conductores.ConductorDeCoche;
import Conductores.ConductorDeMoto;
import umg.progra2.vehiculos.Coche;
import umg.progra2.vehiculos.Moto;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche("Toyota", "22R", 2024, 4);
       coche.MostrarDetalles();
        ConductorDeCoche c = new ConductorDeCoche("Simon", "45068461", 10);
        c.mostrarInformacion();

        System.out.println("\n");
       Moto moto = new Moto("Honda", "Motocross", 2024, false);
       moto.MostrarDetalles();
        ConductorDeMoto M = new ConductorDeMoto("Goku", "45026419", false);
        M.mostrarInformacion();
    }
}