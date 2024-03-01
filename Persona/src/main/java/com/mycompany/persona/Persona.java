/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author HP
 */
public class Persona {

    public static void main(String[] args) {
        ClasePersona P = new ClasePersona();
        
        P.setNombre("Carlos");
        System.out.println(P.getNombre());
        
        P.setApellido("Ortiz");
        System.out.println(P.getApellido());
        
        P.setCorreo("Carlos@edu.co");
        System.out.println(P.getCorreo());
        
        P.setCedula("1043647839");
        System.out.println(P.getCedula());
        
        
    }
}
