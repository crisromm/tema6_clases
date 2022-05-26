
package com.mycompany.tema6_clases;

/**
 *
 * @author Cristina Romero de los Ángeles
 */
public class Estudiante extends Persona {
    protected String estudios;
    
    public Estudiante(String nombre, String apellido, String sexo, Direccion dir, String estudios) {
        super(nombre, apellido, sexo, dir);
        this.estudios=estudios;
    }
    /**
     * 
     * @return 
     */
    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        if(estudios.equals("Informatica") || estudios.equals("Botanica")){
            this.estudios = estudios;
        }else{
            System.out.println("No se ha actualizado la informacion porque el dato introducido no es valido");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }
    
}
