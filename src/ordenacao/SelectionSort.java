/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacao;

import java.util.Random;

/**
 *
 * @author 0057149
 */
public class SelectionSort {
    public static void main(String[] args) {
        int menorI, aux;
        int[] vet = new int[10000];
        Random rnd = new Random(17);
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rnd.nextInt(99999);
        }
        
        long startTime = System.nanoTime();
        for (int i = 0; i < (vet.length - 1); i++) { //O9n)
            menorI = i;
            for (int j = (i + 1); j < vet.length; j++) {//O(n)
                if(vet[j] < vet[menorI]){
                    menorI = j;
                }
            }
            if(vet[i] != vet[menorI]){
                aux = vet[i];
                vet[i] = vet[menorI];
                vet[menorI] = aux;
            }
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        
        System.out.println(timeElapsed);
    }
}
