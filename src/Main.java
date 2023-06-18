import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int inputA = 0;
        int inputB = 0;
        String trash = "";

        System.out.print("Enter any integer you would like: \n");

        if (in.hasNextInt()) {
            inputA = in.nextInt();
            in.nextLine(); // clearing buffer
        } else {
            trash = in.nextLine();
            System.out.println("Error: put integers, not: " + trash);
            System.exit(0);
        }
        System.out.print("Now enter another integer: ");
        if (in.hasNextInt()) {
            inputB = in.nextInt();
            in.nextLine(); // clearing buffer
        } else {
            trash = in.nextLine();
            System.out.println("Error: put integers, not: " + trash);
            System.exit(0);
        }

        if (inputA == inputB) {
            System.out.println("Your two integers are equal");
        } else if (inputA > inputB) {
            System.out.println("Your first integer is greater than your second integer");
        } else { //meaning that inputB has to be greater than inputA
            System.out.println("Your first integer is less than your second integer");
        }
    }
}