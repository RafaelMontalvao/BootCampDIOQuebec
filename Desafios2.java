// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.io.IOException;
import java.util.Scanner;

public class Desafios2{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o coigo do produto 1 : ");
        int cod1 = leitor.nextInt();
        System.out.print("digite a quantidade de intes do produto "+ cod1 + " :");
        int n1 = leitor.nextInt();
        System.out.print("Digite o valor do produto" + cod1 + " :");
        double valor1 = leitor.nextDouble();
        System.out.print("Digite o coigo do produto 2 : ");
        int cod2 = leitor.nextInt();
        System.out.print("digite a quantidade de intes do produto"+ cod2 + " :");
        int n2 = leitor.nextInt();
        System.out.print("Digite o valor do produto" + cod2 + ":");
        double valor2 = leitor.nextDouble();


// TODO: Implemente um Cálculo Simples.
// Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:

        double total = (n1*valor1) + (n2*valor2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }

}
