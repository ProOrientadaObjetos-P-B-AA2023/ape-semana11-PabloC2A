package paquete2;

public abstract class Personaje {
    //Atributos
    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida;
    //Constructores
    public Personaje() {
    }

    public Personaje(String nombre, int nivel, int experiencia, int vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vida = vida;
    }
    // Metodos SET y GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getVida() {
        return vida;
    }
    //Metodos Abstractos
    public abstract int atacar();
    public abstract void defenderse();

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", vida=" + vida +
                '}';
    }
}