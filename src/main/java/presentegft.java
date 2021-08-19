import java.util.Scanner;

public class presentegft {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Quantos ano de GFT voce está fazendo? ");
            String turno = scan.next();

            switch(turno) {
                case "1": System.out.println("VALE PRESENTE"); break;

                case "2": System.out.println("Smart Watch"); break;

                case "5 ": System.out.println("Fone Bluetooth"); break;

                case "10": System.out.println("Vale Jantar"); break;

                case "15": System.out.println("Vale Jantar TOP"); break;

                default: System.out.println("Voce não ganhara presente esse ano");
            }
        }

    }

}


