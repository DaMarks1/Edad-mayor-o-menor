import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String mayor = "es mayor de edad";
        String menor = "es menor de edad";
        String resultado = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("ingrese su edad: ");
        int num = scan.nextInt();


        resultado = (num >= 18) ? mayor : menor;
        System.out.println(resultado);
    }

}