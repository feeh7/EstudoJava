import java.util.Scanner;

public class ConditionSeven {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = key.nextInt();

        if (number > 10 && number < 50) {
            System.out.println("Dentro do intervalo");
        }
        else {
            System.out.println("Fora do intervalo");
        }

        /*
        O enunciado não especificou se os números 10 e 50
        são considerados "dentro do intervalo"
        se fossem apenas trocaria  a linha 11 por
        if (number >= 10 && number <= 50)
         */
    }
}
