package Alarmas;

import Fecha.Fecha;

public abstract class Alarma {

    boolean estado;
    int medida;
    int valorLimite;

    Fecha adquisicion;

    public Alarma(){
        estado = false;
        medida = 50;
        valorLimite = 100;
        adquisicion = new Fecha(1,1,2004);
    }
    public Alarma(boolean estado, int medida, int valorLimite, Fecha adquisicion) {
        this.estado = estado;
        this.medida = medida;
        this.valorLimite = valorLimite;
        this.adquisicion = adquisicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(int valorLimite) {
        this.valorLimite = valorLimite;
    }

    public Fecha getAdquisicion() {
        return adquisicion;
    }

    public void setAdquisicion(Fecha adquisicion) {
        this.adquisicion = adquisicion;
    }


    protected void verificar_medida() {

    }
}
