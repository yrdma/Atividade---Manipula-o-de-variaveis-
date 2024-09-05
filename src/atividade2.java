import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma;
        int[] num = new int[4];
        num[0] = 3;
        num[1] = 6;
        num[2] = 9;
        num[3] = 12;
        soma = num[0] + num[3];
        System.out.println("A soma do primeiro e último elemento é: " + soma);
    }

}
