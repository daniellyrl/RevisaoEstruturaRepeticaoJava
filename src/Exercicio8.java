import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro produto: ");
        int p1 = sc.nextInt();
        System.out.println("Digite o valor do segundo produto: ");
        int p2 = sc.nextInt();
        System.out.println("Digite o valor do terceiro produto: ");
        int p3 = sc.nextInt();

        if (p1 < p2 && p1 < p3) {
            System.out.println("O valor do primeiro produto é " + p1 + " , o mais barato. \n" +
                    "Compre o primeiro produto.");
        } else if (p2 < p1 && p2 < p3) {
            System.out.println("O valor do segundo produto é " + p2 + ", o mais barato. \n" +
                    "Compre o segundo produto.");
        } else if (p3 < p1 && p3 < p2) {
            System.out.println("O valor do terceiro produto é " + p3 + ", o mais barato. \n" +
                    "Compre o terceiro produto.");
        }
    }
}