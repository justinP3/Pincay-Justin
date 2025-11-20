package jpProterozoico;

public abstract class jpAnimal {

    private String jpClase;

    public void SetJpclase(String clase) {
        this.jpClase = clase;
    }

    public String getJpClase() {
        return jpClase;
    }

    public jpAnimal(String clase) {
        this.jpClase = clase;
    }

    public void jpMostrarClase(String clase) {

        System.out.println(clase);
    }

}
