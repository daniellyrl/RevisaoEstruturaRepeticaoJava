import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu sexo (F/M):");
        String input = sc.next();

        if (input.equalsIgnoreCase("F")){
            System.out.println("Sexo Feminino");
        } else if (input.equalsIgnoreCase("M")){
            System.out.println("Sexo Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}
