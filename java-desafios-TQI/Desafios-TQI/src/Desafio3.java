import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        double distancia = 0d;

        Scanner scan = new Scanner(System.in);

        //System.out.println("Entre com a coordenada X1: ");
        double X1 = scan.nextDouble();
        //System.out.println("Entre com a coordenada Y1: ");
        double Y1 = scan.nextDouble();
        //System.out.println("Entre com a coordenada X2: ");
        double X2 = scan.nextDouble();
        //System.out.println("Entre com a coordenada Y2: ");
        double Y2 = scan.nextDouble();

        distancia = Math.sqrt(((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1)));

        System.out.printf("%.4f", distancia);
    }
}
