import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        double distancia, X1, X2, Y1, Y2;
        String[] linha1;
        String[] linha2;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            //quebra string em várias substrings a partir de um caracter
            linha1 = scan.nextLine().split(" ");
            linha2 = scan.nextLine().split(" ");


            X1 = Double.parseDouble(linha1[0]);
            Y1 = Double.parseDouble(linha1[1]);
            X2 = Double.parseDouble(linha2[0]);
            Y2 = Double.parseDouble(linha2[1]);

//        //System.out.println("Entre com a coordenada X1: ");
//        double X1 = scan.nextDouble();
//        //System.out.println("Entre com a coordenada Y1: ");
//        double Y1 = scan.nextDouble();
//        //System.out.println("Entre com a coordenada X2: ");
//        double X2 = scan.nextDouble();
//        //System.out.println("Entre com a coordenada Y2: ");
//        double Y2 = scan.nextDouble();

            distancia = Math.sqrt(((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1)));

            System.out.printf("%.4f", distancia);
            return;
        }
    }
}
