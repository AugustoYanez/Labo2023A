package Alarmas;

import Fecha.Fecha;

public class Detector_humo extends Alarma {
    public Detector_humo(boolean estado, int medida, int valorLimite, Fecha adquisicion) {
     super(estado,medida,valorLimite,adquisicion);
    }

    public void consultarMedida() {
        if (getMedida() > getValorLimite()) {
            System.out.println("Llamando a los bomberos...");
        }
    }
}
