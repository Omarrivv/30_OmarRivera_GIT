/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S10_30;

/**
 *
 * @author Usuario
 */
public class seleccionFutbol_30 {
//CLASE PADRE
//Metodo constructor

    public seleccionFutbol_30(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    
    
//atributos
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
//metodos
    public void concentrarse() {
        System.out.println(getNombre() + " se esta concentrando ");
    }

    public void viajar() {
        System.out.println("El viaje comenzo " + getNombre());
    }
//GET and SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
