import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2)/2;

        if (media >= 7){
            System.out.println("Você passou por média, sua média foi, " + media);
        }else if (media < 7){
            System.out.println("Você foi reprovaodo, sua média foi, " + media);
        }else{
            System.out.println("Aprovado com distinção, pois sua média foi, " + media);
        }
    }
}
