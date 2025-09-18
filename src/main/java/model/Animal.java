package model;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void comer(String alimento) {
        System.out.println("El animal esta comiendo "+alimento);
    }
    public void reproducirse() {
        System.out.println("El animal esta reproduciendose");
    }
    public abstract void hacerSonido();
}
