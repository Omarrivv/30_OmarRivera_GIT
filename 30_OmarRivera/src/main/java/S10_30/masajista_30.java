/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S10_30;

/**
 *
 * @author Usuario
 */
public class masajista_30 extends seleccionFutbol_30 {
    public masajista_30(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

//atributos
    private String titulacion;
    private int aniosExperiencia;

   
//metodos

    public void darMasaje() {
        System.out.println(nombre + " da masajes");
    }
}
