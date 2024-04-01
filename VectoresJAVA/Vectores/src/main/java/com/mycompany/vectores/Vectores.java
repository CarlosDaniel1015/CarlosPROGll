/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vectores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HP
 */
public class Vectores {

    public static void main(String[] args) {
        
        String [] lista1 = {};
        String [] lista2 = {"Carlos", "Daniel", "Ortiz", "Galvis", "18", "Casado", "Hombre"};
        
        int longitud1 = lista1.length;
            System.out.println("La longitud de la primera lista es: " +longitud1);
            
        int longitud2 = lista2.length;
            System.out.println("La longitud de la segunda lista es: " +longitud2);
            
        System.out.println("El primer elemento de la lista 2 es: " +lista2[0]);
        System.out.println("El elemento central de la lista 2 es: " +lista2[3]);
        System.out.println("El ultimo elemento de la lista 2 es: " +lista2[6]);
        
        
        List<String> Datos_personales = new ArrayList<>();
        Datos_personales.add("Nombre");
        Datos_personales.add("Edad");
        Datos_personales.add("Altura");
        Datos_personales.add("Estado");
        Datos_personales.add("Direccion");
        System.out.println("Los datos de la lista Datos Personales es:" +Datos_personales);
        
        List<String> it_companies = new ArrayList<>();
        it_companies.add("Facebook");
        it_companies.add("Google");
        it_companies.add("Microsoft");
        it_companies.add("Apple");
        it_companies.add("IBM");
        it_companies.add("Oracle");
        it_companies.add("Amazon");
        
        it_companies.add(2, "CocaCola");

        String empresaBuscada = "CocaCola";
        if (it_companies.contains(empresaBuscada)) {
            System.out.println("La empresa " + empresaBuscada + " se encuentra en la lista it_companies.");
        } else {
            System.out.println("La empresa " + empresaBuscada + " no se encuentra en la lista it_companies.");
        }
        
        Collections.sort(it_companies);
        System.out.println("La lista ordenada es: " +it_companies);
        
        Collections.reverse(it_companies);
        System.out.println("La lista inversa es: " +it_companies);
        
        it_companies.remove(0);
        System.out.println("La lista sin el priemr elemento es: " +it_companies);
        
        it_companies.clear();
        System.out.println("La lista vacia es: " +it_companies);
        
    }
}
