package br.com.fiap.main;

public class TesteBuscaSimples {
    public static void main(String[] args) {
        
        int[] vetor = {10, 20, 30, 40, 50}; // posições 0,1,2,3,4

        int alvo = 30; // Valor a ser encontrado

        int tamanhoVetor = 5; // Tamanho do vetor (número de elementos)

        // Loop para buscar o valor no vetor

        for(int i = 0; i < vetor.length; i++) {
            if(alvo == vetor[i]) {
                int posicao = tamanhoVetor - i;
                System.out.println("O Valor foi encontrado na posição " + posicao);
            }


        }






    }
}

