/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_30_E01;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {

    public Estudiante(String materias, String universidad, int horasEstudio, int edad, String nombre) {
        super(edad, nombre);
        this.materias = materias;
        this.universidad = universidad;
        this.horasEstudio = horasEstudio;
    }
    
    String materias;
    String universidad;
    int horasEstudio;
    
    public void Tareas(){
        System.out.println("estoy haciendo tareas");
    }
    public void estudio(){
        System.out.println("estoy haciendo mis estudisos");
    }
}
