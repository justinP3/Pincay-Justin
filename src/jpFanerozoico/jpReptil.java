package jpFanerozoico;

import jpProterozoico.jpAmniota;

public abstract class jpReptil extends jpAmniota {

    private String jpnombre;
    private int jpfamiliares;

    public String getJpnombre() {
        return jpnombre;
    }

    public void setJpnombre(String nombre) {
        this.jpnombre = nombre;
    }

    public int getJpfamiliares() {
        return jpfamiliares;
    }

    public jpReptil() {
        super("Reptil");
        this.jpnombre = "";
        this.jpfamiliares = 6;
    }

    public void jpSaludar() {
        System.out.println(jpnombre + "saluda a todos");
    }

}
