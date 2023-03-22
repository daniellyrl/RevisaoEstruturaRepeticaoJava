import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite um número: ");
        int n3 = sc.nextInt();

        if (n1>n2 && n1>n3){
            System.out.println("O número " + n1 + " é o maior.");
        } else if (n2>n1 && n2>n3) {
            System.out.println("O número " + n2 + " é o maior.");
        } else if (n3>n1 && n3>n2) {
            System.out.println("O número " + n3 + " é o maior.");
        }
    }
}
