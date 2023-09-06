/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.banana.datos;
import java.util.Scanner;
import mx.itson.banana.datos.dato;
/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Escriba el enunciado a separar: ");
        
        Scanner scanner = new Scanner(System.in); 
        String enunciado = scanner.nextLine();
        
        String[] ola = new dato().SepararComa(enunciado);
         
        for(String ola1 : ola){
            String[] acomodo = new dato().Separar(ola1);
            System.out.println("id: "+acomodo[0]+" apellido: "+acomodo[1]+" nombre: "+acomodo[3]);
        }
    }
}
