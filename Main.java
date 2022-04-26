import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.lang.model.util.ElementScanner7;

public class Main {
    public static void main(String[] args) {
    
        Scanner matriz = new Scanner(System.in);

        System.out.println("Digite sua Matriz original de 4 numeros de 0 a 9:");
        int numero1 = matriz.nextInt();
        int numero2 = matriz.nextInt();
        int numero3 = matriz.nextInt();
        int numero4 = matriz.nextInt();

        System.out.println("Matriz original");
        System.out.println("" +numero1+ " " +numero2+ " "+numero3+" " +numero4+"" );

        System.out.println("Selecione um angulo que seja 0, 90, 180, 270 ou 360");
        int rotacao = matriz.nextInt();

        if (rotacao == 0) {
            System.out.println("" +numero1+ " " +numero2+ " "+numero3+" " +numero4+"" ); ; 
            } 
            else

        if (rotacao == 90) {
            System.out.println("" +numero4+ " " +numero1+ " "+numero2+" " +numero3+"" ); ; 
            } 
            else

        if (rotacao == 180) {
            System.out.println("" +numero3+ " " +numero4+ " "+numero1+" " +numero2+"" ); ;
            } 
            else
        if (rotacao == 270) {
            System.out.println("" +numero2+ " " +numero3+ " "+numero4+" " +numero1+"" );
            } 
            else
        if (rotacao == 360) {
            System.out.println("" +numero1+ " " +numero2+ " "+numero3+" " +numero4+"" ); 
            }
            else
        if (rotacao != +0+ +90+ +180+ +270+ +360){
            System.out.println("Esse angulo não existe");
        }
    }
}
