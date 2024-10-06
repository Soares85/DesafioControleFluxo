import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = in.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int segundoNumero = in.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        } 
        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
   
    }

    static void contar(int x, int y) throws ParametrosInvalidosException{
        if (x >= y) {
            throw new ParametrosInvalidosException();
        }

        int totalInteracoes = y - x;

        for (int i = 1; i <= totalInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
