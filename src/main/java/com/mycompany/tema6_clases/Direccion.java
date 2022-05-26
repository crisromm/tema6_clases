package com.mycompany.tema6_clases;

/**
 *
 * @author Cristina Romero de los Ángeles
 */
public class Direccion {

    String calle;
    int numero;
    String provincia;

    public Direccion(String calle, int numero, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}
