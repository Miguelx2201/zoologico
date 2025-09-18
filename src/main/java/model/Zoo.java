package model;

import java.util.ArrayList;

public class Zoo {
    private String nombre;
    private ArrayList<Animal> listaAnimales;

    public Zoo(String nombre) {
        this.nombre = nombre;
        this.listaAnimales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public String agregarAnimal(Animal animal) {
        Animal buscado = buscarAnimal(animal.getNombre());
        if (buscado != null) {
            return "El animal ya se encuentra agregado";
        }
        listaAnimales.add(animal);
        return "El animal añadido satisfactoriamente";
    }
    public Animal buscarAnimal(String nombre) {
        return listaAnimales.stream().filter(animal -> animal.getNombre().equals(nombre)).findFirst().orElse(null);
    }
    public String eliminarAnimal(String nombre) {
        Animal buscado = buscarAnimal(nombre);
        if(buscado != null) {
            listaAnimales.remove(buscado);
            return "El animal eliminado satisfactoriamente";
        }
        return "El animal no ha sido encontrado";
    }
    public void hacerSonidoAnimales() {
        listaAnimales.forEach(Animal::hacerSonido);
    }
}
