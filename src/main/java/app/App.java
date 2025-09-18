package app;

import model.*;

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("UQMari");
        Gato gato = new Gato("Rocky", 12);
        Perro perro = new Perro("Yahian", "Golden");
        Leon leon = new Leon("Leon de Juda", 34.2);
        Jirafa jirafa = new Jirafa("Mili", 18.4);
        Serpiente serpiente = new Serpiente("Susanita", 9);

        zoo.agregarAnimal(gato);
        zoo.agregarAnimal(perro);
        zoo.agregarAnimal(leon);
        zoo.agregarAnimal(jirafa);
        zoo.agregarAnimal(serpiente);

        zoo.hacerSonidoAnimales();
    }
}
