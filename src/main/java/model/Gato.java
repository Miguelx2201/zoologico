package model;

public class Gato extends Animal {
    private int numBigotes;

    public Gato(String nombre, int numBigotes) {
        super(nombre);
        this.numBigotes = numBigotes;
    }

    public int getNumBigotes() {
        return numBigotes;
    }

    public void setNumBigotes(int numBigotes) {
        this.numBigotes = numBigotes;
    }
    public void comer(String alimento) {
        System.out.println("El gato esta comiendo "+alimento);
    }
    public void hacerSonido() {
        System.out.println("Miauuu...Miauu...");
    }
    public void reproducirse() {
        System.out.println("El gato esta reproduciendose");
    }
}
