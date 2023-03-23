import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese un primer numero");
        num1 = scanner.nextInt();

        System.out.println("Ingrese un segundo numero");
        num2 = scanner.nextInt();

        int suma= num1+num2;
        int resta=num1-num2;
        double div = num1/num2;
        int multi = num1*num2;

        System.out.println("La suma de los dos numeros es : "+ suma + " la resta es : " + resta +
                " la multiplicacion es: " + multi + " y la divicion es : " + div);
    }
}