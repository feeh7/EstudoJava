import java.util.Scanner;

public class CondicaoTesteQuatro {
    public static void main(String[] args) {

        Scanner keyandmouse = new Scanner(System.in);

        System.out.println("Hello type 3 math notes from your last quarter and I will calculate the average!");

        System.out.println("Enter the first note:");
        int note = keyandmouse.nextInt();

        System.out.println("Enter the second note: ");
        int noteTwo = keyandmouse.nextInt();

        System.out.println("Enter the third number: ");
        int noteThree = keyandmouse.nextInt();

        int sum = (note + noteTwo + noteThree);
        int equal = (sum / 3);

        if (sum > 6) {
            System.out.println("Congratulations, your average is "+equal+" and you have been approved!");
        }
        else {
            System.out.println("Wowww, your average is "+equal+" and you have failed ");
        }

    }
}
