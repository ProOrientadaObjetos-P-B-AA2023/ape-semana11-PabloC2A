package paquete3;

public class Arma {
    //Atributos
    private double aumentoAtaque;
    private double aumentoDefensa;
    private int durabilidad;
    //Constructoes
    public Arma() {
    }

    public Arma(double aumentoAtaque, double aumentoDefensa, int durabilidad) {
        this.aumentoAtaque = aumentoAtaque;
        this.aumentoDefensa = aumentoDefensa;
        this.durabilidad = durabilidad;
    }
    //Metodos SET y GET
    public void setAumentoAtaque(double aumentoAtaque) {
        this.aumentoAtaque = aumentoAtaque;
    }

    public void setAumentoDefensa(double aumentoDefensa) {
        this.aumentoDefensa = aumentoDefensa;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public double getAumentoAtaque() {
        return aumentoAtaque;
    }

    public double getAumentoDefensa() {
        return aumentoDefensa;
    }

    public int getDurabilidad() {
        return durabilidad;
    }
    //Metodos Abstractos
    public abstract void calcularDaño();
}
