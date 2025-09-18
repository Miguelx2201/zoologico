package model;

public class Serpiente extends Animal{
    private double longitud;

    public Serpiente(String nombre, double longitud) {
        super(nombre);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public void comer(String alimento) {
        System.out.println("La serpiente esta comiendo "+alimento);
    }
    public void reproducirse() {
        System.out.println("El serpiente esta reproduciendose");
    }
    public void hacerSonido() {
        System.out.println("Pzzzzzz...pzzzzzz");
    }
}
