import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner matriz = new Scanner(System.in);

        System.out.println("Matriz original:");
        System.out.println("{ { 1,2 } { 3,4} }");

        System.out.println("Selecione um angulo que seja 90, 180, 270 ou 360");
        int rotacao = matriz.nextInt();

        if (rotacao == 90) {
            System.out.println("{ { 4,1 } { 2,3} }") ; 
            } 
            else

        if (rotacao == 180) {
            System.out.println("{ { 3,4 } { 1,2} }") ;
            } 
            else
        if (rotacao == 270) {
            System.out.println("{ { 2,3 } { 4,1} }") ;
            } 
            else
        if (rotacao == 360) {
            System.out.println("{ { 4,1 } { 2,3} }") ;
            }
            
    }
}
