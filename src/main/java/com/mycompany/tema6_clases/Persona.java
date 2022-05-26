
package com.mycompany.tema6_clases;

/**
 *
 * @author Cristina Romero de los Ángeles
 */
public abstract class Persona {

    String nombre;
    String apellido;
    String sexo;
    Direccion dir;

    public Persona(String nombre, String apellido, String sexo, Direccion dir) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dir = dir;
    }
    
    public Persona(String nombre, String apellido, String sexo, String calle, int numero, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dir = new Direccion (calle, numero, provincia);
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
        if(sexo.equals("Mujer") || sexo.equals("Hombre")){
            this.sexo = sexo;
        }else{
            System.out.println("No has introducido un valor valido");
        }
        
    }
 
    public void insultar(){
        System.out.println(this.nombre + " es un idiota");
    
    }
    
    
//    public static Persona crearPersona(String nombre, String apellido, String sexo, Direccion dir){
//        if(sexo.equals("Mujer") || sexo.equals("Hombre")){
//            System.out.println("La persona se ha creado correctamente");
//            return new Persona(nombre,apellido,sexo,dir);
//        }else{
//            System.out.println("No se ha creado la persona ya que alguno de los datos es erroneo.");
//            return null;
//        }
//        
//    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", dir=" + dir + '}';
    }
}
