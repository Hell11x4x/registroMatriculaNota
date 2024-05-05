/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoscontructor;

/**
 *
 * @author Hell
 */
public class persona {
    String nombre;
    int edad;
    
    //Método constructor
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Métdo mostrarPersona
    public void mostrarPersona(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
    
}
