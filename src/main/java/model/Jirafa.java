package model;

public class Jirafa extends Animal{
    private double altura;

    public Jirafa(String nombre, double altura) {
        super(nombre);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Mmmmm....hmmmmm");
    }

    @Override
    public void reproducirse() {
        System.out.println("La jirafa se esta reproduciendo");
    }

    @Override
    public void comer(String alimento) {
        System.out.println("La jirafa esta comiendo "+alimento);
    }
}
