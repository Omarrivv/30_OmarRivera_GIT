/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S10_30;

/**
 *
 * @author Usuario
 */
public class entrenador_30 extends seleccionFutbol_30{
    public entrenador_30(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
//atributos
    private String idFederacion;

//metodos
    public void dirigirPartido() {
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " es el entrenador");
    }
}
