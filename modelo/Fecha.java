package modelo;

public class Fecha
{
    //
    // Atributos
    //
    private int dia;
    private int mes;
    private int anio;
    
    //
    // Métodos
    //
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }
    
    public void setDia(int pdia) {
        this.dia = pdia;
    }
    public void setMes(int pmes) {
        this.mes = pmes;
    }
    public void setAnio(int panio) {
        this.anio = panio;
    }

    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }
}