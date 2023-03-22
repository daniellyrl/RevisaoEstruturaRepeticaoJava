import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em qual turno você estuda? (M/V/N) ");
        String turno = (sc.next());

        /*
        //Utlizando if
        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido");
        }
         */
        switch (turno){
            case "M":
            case "m":
                System.out.println("Bom dia!");
                break;
            case "V":
            case "v":
                System.out.println("Boa tarde!");
                break;
            case "N":
            case "n":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}