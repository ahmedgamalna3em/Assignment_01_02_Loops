package First_Assignment_2_2;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 1;
        System.out.print("Enter Number To Make Factorial : ");
        num = input.nextInt();
        for(int i =1;i<=num;i++){
            sum *= i;
        }
        System.out.println("The Factorial Is = "+ sum);
    }
}
