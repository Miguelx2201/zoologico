package model;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void comer(String alimento) {
        System.out.println("El perro esta comiendo "+alimento);
    }
    public void hacerSonido() {
        System.out.println("Guau...guau...");
    }

    @Override
    public void reproducirse() {
        System.out.println("El perro esta reproduciendose");
    }
}
