import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um número: ");
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println("O número " + n1 + " é maior");
        } else if (n2 > n1) {
            System.out.println("O número " + n2 + " é maior");
        }
    }
}