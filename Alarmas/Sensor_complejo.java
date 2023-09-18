package Alarmas;

import Alarmas.Alarma;
import Fecha.Fecha;

import java.util.ArrayList;

public class Sensor_complejo  {

    private int valorLimite;

    public int getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(int valorLimite) {
        this.valorLimite = valorLimite;
    }

    ArrayList<Alarma> alarmas;

    public Sensor_complejo() {
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
                x.verificarMedida();
                valorMedio = valorMedio + x.getMedida();
                cantidad++;
            }
        }
        if (cantidad > 0 && valorMedio / cantidad > getValorLimite()) {
            System.out.println("¡Alarma de sensor compuesto activada!");
        }
    }

    public void verMasInfo(int numeroSensor){
Alarma sensor = null;
try {
    sensor = alarmas.get(numeroSensor);
}catch (ArrayIndexOutOfBoundsException e){
    System.out.println(e);
}
    }
}
