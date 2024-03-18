import java.util.Scanner;
public class Marks {
   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks for Java Programming:");
        int javaProgramming = scanner.nextInt();
        System.out.println("Enter marks for Networking:");
        int networking = scanner.nextInt();
        System.out.println("Enter marks for Maths:");
        int maths = scanner.nextInt();

        double average = (javaProgramming + networking + maths) / 3.0;

        System.out.println("Marks for Java Programming is: " + javaProgramming);
        System.out.println("Marks for Networking is: " + networking);
        System.out.println("Marks for Maths is: " + maths);
        System.out.println("The average is: " + average);

    }
    
}
