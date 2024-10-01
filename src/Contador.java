import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o primeiro número inteiro: ");
        int param1 = scanner.nextInt();
        System.out.println("Insira o segundo número inteiro: ");
        int param2 = scanner.nextInt();

        try {
            contador(param1, param2);
            System.out.println("Contagem realizada. Foram impressos " + (param2-param1) + " números.");
        } catch (ParametrosInvalidosException e){
            System.err.println("Primeiro valor maior que o segundo. Tente novamente");
        }
    }

    static void contador (int p1, int p2) throws ParametrosInvalidosException {
        if (p1 > p2){
            throw new ParametrosInvalidosException();
        } else {
            for (int i = p1; i < p2+1; i++) {
                System.out.println("Imprimindo número: " + i + ".");
            }
        }
    }

}