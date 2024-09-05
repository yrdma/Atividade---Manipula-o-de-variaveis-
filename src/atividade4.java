import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        double total = 0;
        System.out.println("Insira três números: ");
        System.out.println("primeiro:");
        num[0] = sc.nextInt();
        System.out.println("segundo:");
        num[1] = sc.nextInt();
        System.out.println("terceiro:");
        num[2] = sc.nextInt();
        total = num[0] + num[1] + num[2];
        System.out.println("Os números inseridos foram :" + num[0] + ", " + num[1] + ", " + num[2]);
        System.out.println("A média é :" + total / 3);
    }

}