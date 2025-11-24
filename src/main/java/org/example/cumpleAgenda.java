package org.example;

public class cumpleAgenda {

    private String Nombre;
    private int Dia;
    private int Mes;

    public cumpleAgenda(String nombre, int dia, int mes) {
        this.Nombre = nombre;
        this.Dia = dia;
        this.Mes = mes;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }
}
