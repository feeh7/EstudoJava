import java.util.Scanner;

public class CondicaoTesteQuinto {
    public static void main(String[] args) {

        Scanner keyandmouse = new Scanner(System.in);

        System.out.println("Hello! type your age, The program will tell you if you are older or underage!");

        System.out.println("How old are you?: ");
        int age = keyandmouse.nextInt();

        if (age > 18) {
            System.out.println("Woww you are só old");
        }
        else {
            System.out.println("You still have less than 18 baby....");
        }
    }
}
