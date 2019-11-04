/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaExpendedora;

import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Reiniciador {
    
    public void Reiniciador(Stack tipo){
    
        int a = tipo.size();
        for(int i = 0; i < a; i++){
        tipo.pop();
        }
    }
    
    public void Reiniciador2(Queue tipo){
    
        int a = tipo.size();
        for(int i = 0; i < a; i++){
        tipo.poll();
        }
    }   
}
