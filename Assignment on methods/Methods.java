import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int num1=scanner.nextInt();
    int num2=scanner.nextInt();
    int num3=scanner.nextInt();
    
    int smallest=Math.min(num1,Math.min(num2,num3));
    int largest=Math.max(num1,Math.max(num2,num3));
  
    System.out.println("The smallest number:"+smallest);
    System.out.println("The largest number:"+largest);
    
    }
    
}
