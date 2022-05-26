package com.mycompany.tema6_clases;



/**
 *
 * @author Cristina Romero de los Ángeles
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion dir1 = new Direccion("Calle sol", 5, "Sevilla");
       
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "Hombre", dir1, "Informatica");
        Trabajador trabajador1 = new Trabajador(5, "Jefe", dir1, "Pedro", "Lopez", "Hombre", dir1);
        
        Persona[] persona1 = new Persona[2];
        
        persona1[0]= estudiante1;
        persona1[1]= trabajador1;
        
        for (int i = 0; i < persona1.length; i++) {
            if(persona1[i] instanceof Trabajador){
                System.out.println("El trabajador se llama: " + persona1[i].getNombre());
            } else {
                System.out.println("El estudiante se llama: " + persona1[i].getNombre());
            }
        }
//        persona1.insultar();
//        estudiante1.insultar();
        
        

    }

}
