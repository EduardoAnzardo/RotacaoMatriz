import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner matriz = new Scanner(System.in);

        System.out.println("Digite sua Matriz original de 4 numeros de 0 a 9:");
        int numero1 = matriz.nextInt();
        int numero2 = matriz.nextInt();
        int numero3 = matriz.nextInt();
        int numero4 = matriz.nextInt();

        System.out.println("Matriz original");
        System.out.println("" +numero1+ " " +numero2+ "");
        System.out.println(""+numero3+" " +numero4+"" );

        System.out.println("Selecione um angulo que seja 0, 90, 180, 270 ou 360");
        int rotacao = matriz.nextInt();

        if (rotacao == 0) {
            System.out.println("" +numero1+ " " +numero2+ ""); 
            System.out.println("" +numero3+ " " +numero4+ ""); 
            } 
            else

        if (rotacao == 90) {
            System.out.println("" +numero3+ " " +numero1+ ""); 
            System.out.println("" +numero4+ " " +numero2+ ""); 
            } 
            else

        if (rotacao == 180) {
            System.out.println("" +numero4+ " " +numero3+ ""); 
            System.out.println("" +numero2+ " " +numero1+ ""); 
            } 
            else
        if (rotacao == 270) {
            System.out.println("" +numero2+ " " +numero4+ ""); 
            System.out.println("" +numero1+ " " +numero3+ ""); 
            } 
            else
        if (rotacao == 360) {
            System.out.println("" +numero1+ " " +numero2+ ""); 
            System.out.println("" +numero3+ " " +numero4+ ""); 
            } 
            else
        if (rotacao != +0+ +90+ +180+ +270+ +360){
            System.out.println("Esse angulo não foi aceito");
        }
    }
}
