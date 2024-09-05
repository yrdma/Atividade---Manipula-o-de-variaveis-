import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] vetor = new int[2];
    vetor[0] = 5;
    vetor[1] = 10;
    int troca = vetor[0];
    vetor[0] = vetor[1];
    vetor[1] = troca;
    System.out.println("Depois da troca Vetor 0: " + vetor[0] + " vetor 1: " + vetor[1]);
    }

}