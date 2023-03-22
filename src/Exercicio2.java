import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (n >= 0){
            System.out.println("O número " + n + " é positivo.");
        }else{
            System.out.println("O número " + n + " é negativo");
        }
    }
}
