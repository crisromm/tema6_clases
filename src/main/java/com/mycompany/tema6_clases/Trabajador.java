
package com.mycompany.tema6_clases;

/**
 *
 * @author Cristina Romero de los Ángeles
 */
public class Trabajador extends Persona{
    int edad;
    String cargoEmpresa;
    Direccion direccionEmpresa;

    public Trabajador(int edad, String cargoEmpresa, Direccion direccionEmpresa, String nombre, String apellido, String sexo, Direccion dir) {
        super(nombre, apellido, sexo, dir);
        this.edad = edad;
        this.cargoEmpresa = cargoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
    }

    
    
    
    
    
}
