package CursoJava.EX13;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int x = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int y = sc.nextInt();

        int[][] matrix = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + " linha: ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite um número a ser encontrado: ");

        int posicao = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == posicao) {
                    System.out.println("POSIÇÃO " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matrix[i][j - 1]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Direita: " + matrix[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Em cima: " + matrix[i - 1][j]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Em baixo: " + matrix[i + 1][j]);
                    }
                }
            }
        }
    }
}
