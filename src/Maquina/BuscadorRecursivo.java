/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maquina;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class BuscadorRecursivo{
     
     public int busquedaBinariaRecursiva(Stack examinar, int busqueda, int izquierda, int derecha){
 
        // Si izquierda es mayor que derecha significa que no encontramos nada
        if(izquierda > derecha){
            return -1;
        }
 
        // Calculamos las mitades...
        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
        int elementoDelMedio = (int) examinar.get(indiceDelElementoDelMedio);
 
        // Ver si está en la mitad
        if(elementoDelMedio == busqueda){
            return indiceDelElementoDelMedio;
        }
        
        // Si no, entonces vemos si está a la izquierda o derecha
        if(busqueda < elementoDelMedio){
            derecha = indiceDelElementoDelMedio - 1;
            return busquedaBinariaRecursiva(examinar, busqueda, izquierda, derecha);
        }else{
            izquierda = indiceDelElementoDelMedio + 1;
            return busquedaBinariaRecursiva(examinar, busqueda, izquierda, derecha);
        }
    }
    
        public int busquedaBinariaRecursiva2(ArrayList examinar, int busqueda, int izquierda, int derecha){
        
        // Si izquierda es mayor que derecha significa que no encontramos nada
        if(izquierda > derecha){
            return -1;
        }
 
        // Calculamos las mitades...
        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
        int elementoDelMedio = (int) examinar.get(indiceDelElementoDelMedio);
 
        // Ver si está en la mitad
        if(elementoDelMedio == busqueda){
            return indiceDelElementoDelMedio;
        }
        
        // Si no, entonces vemos si está a la izquierda o derecha
        if(busqueda < elementoDelMedio){
            derecha = indiceDelElementoDelMedio - 1;
            return busquedaBinariaRecursiva2(examinar, busqueda, izquierda, derecha);
        }else{
            izquierda = indiceDelElementoDelMedio + 1;
            return busquedaBinariaRecursiva2(examinar, busqueda, izquierda, derecha);
        }
    }
}
