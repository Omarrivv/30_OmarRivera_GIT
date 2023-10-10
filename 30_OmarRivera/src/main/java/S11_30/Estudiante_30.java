/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_30;

/**
 *
 * @author Usuario
 */
public class Estudiante_30 extends Persona_30 {

    public Estudiante_30(String carrera, int numeroOrden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numeroOrden = numeroOrden;
        this.ciclo = ciclo;
    }
    
    String carrera;
    int numeroOrden;
    int ciclo;
    
    
    
}
