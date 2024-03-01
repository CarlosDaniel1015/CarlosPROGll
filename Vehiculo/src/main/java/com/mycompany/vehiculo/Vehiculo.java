/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculo;

/**
 *
 * @author HP
 */
public class Vehiculo {

    public static void main(String[] args) {
        
        Carro C = new Carro();
        
        C.setMarca("Marca: Porsche");
        System.out.println(C.getMarca());
        
        C.setModelo("Modelo: 918 Spyder");
        System.out.println(C.getModelo());
        
        C.setCaballosDeFuerza("Caballos de fuerza: 887 ");
        System.out.println(C.getCaballosDeFuerza());
        
        C.setAño("Año: 2013");
        System.out.println(C.getAño());
        
    }
}
