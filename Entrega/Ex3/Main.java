package ex_3;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Operadora op = new Operadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número de 1 a 100 ");
        int n = sc.nextInt();

        while (n <= 0 || n>= 101)
        {
            System.out.println("Insira um número de 1 a 100 ");
            n = sc.nextInt();
        }
        int[] vet = new int[n];
        for (int i = 0; i<vet.length; i++)
        {
            System.out.println("Insira o valor");
            vet[i] = sc.nextInt();
        }
        op.funcao(vet);
    }
}