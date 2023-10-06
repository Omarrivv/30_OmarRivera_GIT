/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S10_30;

/**
 *
 * @author Usuario
 */
public class Main_S10_30 {
    public static void main(String[] args) {
        
        
        futbolista_30 futbolista1 = new futbolista_30(9, "arquero", 1, "paolo", "guerrero", 42);
        masajista_30 masajista1  = new masajista_30("si", 15, 2, "raul", "Martines", 50);
        entrenador_30 RicardoGareca = new entrenador_30("uno", 1, "Ricardo", "Gareca", 65);
        
        //ENTRESNAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();
    }
}
