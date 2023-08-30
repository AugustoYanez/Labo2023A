package Alarmas;

import Alarmas.Alarma;
import Fecha.Fecha;

import java.util.ArrayList;

public class Sensor_complejo extends Alarma {
    ArrayList<Alarma> alarmas;

    public Sensor_complejo(boolean estado, int medida, int valorLimite, Fecha adquisicion) {
        super(estado,medida,valorLimite,adquisicion);
        this.alarmas = new ArrayList<Alarma>();
    }

    public void agregarDispositivo(Alarma alarma1) {
        alarmas.add(alarma1);
    }

    public void valor_medio() {
        double valorMedio = 0;
        int cantidad = 0;
        for (Alarma x : alarmas) {
            if (x.isEstado()) {
                x.verificar_medida();
                valorMedio = valorMedio + x.getMedida();
                cantidad++;
            }
        }
        if (cantidad > 0 && valorMedio / cantidad > getValorLimite()) {
            System.out.println("¡Alarma de sensor compuesto activada!");
        }
    }
}
