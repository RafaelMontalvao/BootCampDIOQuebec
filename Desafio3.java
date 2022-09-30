import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int[] N= { };

        for(int i=0 ; i<1000  ; i++ ){
            for(int j=0;j<t ;j++){
                if(t > 1 && t< 51){
                    int x = t-1;
                    System.out.println("N[" + i  + "] = "+ j );
                i++;

            }
        }
    }
}
}
