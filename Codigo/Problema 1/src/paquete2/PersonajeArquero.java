package paquete2;

import paquete3.Arma;

public class PersonajeArquero extends Personaje{
    //Atributos
    private double ataque;
    private double defensa;
    private Arma armaArquero;
    //Constructores
    public PersonajeArquero() {
    }

    public PersonajeArquero(String nombre, int nivel, int experiencia, int vida, double ataque, double defensa, Arma armaArquero) {
        super(nombre, nivel, experiencia, vida);
        this.ataque = ataque;
        this.defensa = defensa;
        this.armaArquero = armaArquero;
    }
    //Metodos SET y GET

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public void setArmaArquero(Arma armaArquero) {
        this.armaArquero = armaArquero;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public Arma getArmaArquero() {
        return armaArquero;
    }
    //Matodos Abstractos
    public int atacar(Personaje oponente) {
        this.ataque = this.ataque + this.ataque * this.armaGuerrero.getAumentoAtaque() / 100;
        return (int) ataque;
    }

    public void defenderse() {

    }

    @Override
    public String toString() {
        return "PersonajeArquero{" +
                "ataque=" + ataque +
                ", defensa=" + defensa +
                ", armaArquero=" + armaArquero +
                "} " + super.toString();
    }
}
