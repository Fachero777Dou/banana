/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.banana.datos;

/**
 *|
 * @author sergi
 */
public class dato {
    public String [] SepararComa (String oracion){
        String [] resultado1=oracion.split(",");
        return resultado1;
    }
    public String [] Separar (String oracion){
        String [] resultado2=oracion.split("\\s");
        return resultado2;
    }

}
