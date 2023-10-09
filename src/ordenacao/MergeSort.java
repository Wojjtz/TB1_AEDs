/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacao;

/**
 *
 * @author rodol
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] vetor = {4, 1, 5, 7, 12, 51, 7, 2, 1};

        mergeSort(0, vetor.length, vetor);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    static void mergeSort(int inicio, int fim, int[] vetor) {
        System.out.println("Inicio: " + inicio + " - Fim: " + fim);
        if (inicio < fim - 1) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio, vetor);
            mergeSort(meio, fim, vetor);
            intercala(vetor, inicio, meio, fim);
        }
    }

    static void intercala(int[] vetor, int inicio, int meio, int fim) {
        int novoVetor[] = new int[fim - inicio];
        int i = inicio;
        int m = meio;
        int pos = 0;
        while (i < meio && m < fim) {
            if (vetor[i] <= vetor[m]) {
                novoVetor[pos] = vetor[i];
                pos = pos + 1;
                i = i + 1;
            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }
        while (i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }
        while (m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }
        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }
}
