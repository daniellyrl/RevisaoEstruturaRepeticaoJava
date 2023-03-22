import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = sc.next();
/*
        //Usando if, if-else
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("A letra " + letra + " é uma vogal");
        }else{
            System.out.println("A letra" + letra + " é uma cosoante");
        }
 */
        //Usando Switch
        switch (letra){
            case "a":
                System.out.println("Vogal");
                break;
            case "e":
                System.out.println("Vogal");
                break;
            case "i":
                System.out.println("Vogal");
                break;
            case "o":
                System.out.println("Vogal");
                break;
            case "u":
                System.out.println("Vogal");
            default: //Tem a mesma função de um else
                System.out.println("Cosoante");
        }
    }
}
