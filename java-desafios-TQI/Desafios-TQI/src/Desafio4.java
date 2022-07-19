// TODO: complete os espaços em branco com sua solução para o problema
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;

public class Desafio4{

    public static void main(String[] args) {

        //a classe Scanner auxilia na leitura dos dados de entrada
        Scanner leitor = new Scanner(System.in);

        int QT = Integer.parseInt(leitor.nextLine());

        String[] linha1;
        String[] linha2;
        String nome1;
        String escolha1;
        String nome2;
        String escolha2;
        int N, M;

        for (int i = 0; i < QT; i++) {

            //quebra string em várias substrings a partir de um caracter
            linha1 = leitor.nextLine().split(" ");
            linha2 = leitor.nextLine().split(" ");


            N = Integer.parseInt(linha2[0]);
            M = Integer.parseInt(linha2[1]);

            nome1 = linha1[0];
            escolha1 = linha1[1];

            nome2 = linha1[2];
            escolha2 = linha1[3];


            if (((N + M) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) ||
                    ((N + M) % 2 != 0 && escolha1.equalsIgnoreCase("IMPAR"))) System.out.println(nome1);
            else if (((N + M) % 2 == 0 && escolha2.equalsIgnoreCase("PAR")) ||
                    ((N + M) % 2 != 0 && escolha2.equalsIgnoreCase("IMPAR"))) System.out.println(nome2);
        }
    }
}