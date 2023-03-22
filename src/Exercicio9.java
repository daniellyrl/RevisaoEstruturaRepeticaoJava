import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite um número: ");
        int n3 = sc.nextInt();
        //n1 < n2 < n3 (estrutura decrescente)

        if (n1 < n2 && n1 < n3 && n2 < n3) {
            System.out.println(n3 + "-" + n2 + "-" + n1);
        } else if (n1 < n2 && n1 < n3 && n3 < n2) {
            System.out.println(n2 + "-" + n3 + "-" + n1);
        } else if (n2 < n1 && n2 < n3 && n1 < n3) {
            System.out.println(n3 + "-" + n1 + "-" + n2);
        } else if (n2 < n1 && n2 < n3 && n3 < n1) {
            System.out.println(n1 + "-" + n3 + "-" + n2);
        } else if (n3 < n1 && n3 < n2 && n1 < n2) {
            System.out.println(n2 + "-" + n1 + "-" + n3);
        } else if (n3 < n1 && n3 < n2 && n2 < n1) {
            System.out.println(n1 + "-" + n2 + "-" + n3);
        }
    }
}