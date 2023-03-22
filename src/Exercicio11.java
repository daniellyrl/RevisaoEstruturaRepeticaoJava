import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu salário? ");
        double salario = sc.nextDouble();

        if (salario <= 280){
            double aumento = (salario * 1.20);
            System.out.println("Você receberá um aumento de 20%, seu salário passará a ser: " + aumento);
        } else if (salario > 280 && salario <= 700) {
            double aumento = (salario * 1.15);
            System.out.println("Você receberá um aumento de 15%, seu salário passará a ser: " + aumento);
        } else if (salario > 700 && salario <= 1500) {
            double aumento = (salario * 1.10);
            System.out.println("Você receberá um aumento de 10%, seu salário passará a ser: " + aumento);
        }else {
            double aumento = (salario * 1.05);
            System.out.println("Você receberá um aumento de 5%, seu salário passará a ser: " + aumento);
        }
    }
}
