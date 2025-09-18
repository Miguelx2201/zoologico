package model;

public class Leon extends Animal{
    private double peso;

    public Leon(String nombre, double peso) {
        super(nombre);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Grrrrrrr......grrrrrr");
    }
    public void comer(String alimento) {
        System.out.println("El leon esta comiendo "+alimento);
    }
    public void reproducirse() {
        System.out.println("El leon esta reproduciendose");
    }
}
