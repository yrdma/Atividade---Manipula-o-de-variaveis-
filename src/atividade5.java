import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        System.out.println("Digite o primeiro nome: ");
        nomes[0] = sc.nextLine();
        System.out.println("Digite o segundo nome: ");
        nomes[1] = sc.nextLine();
        System.out.println("Digite o terceiro nome: ");
        nomes[2] = sc.nextLine();
        System.out.println("Os 3 nomes inseridos foram:" + nomes[0] + "," + nomes[1] + "," + nomes[2]);

    }
}