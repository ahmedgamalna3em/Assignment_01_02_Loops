package First_Assignment_2_2;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int num;
        int digit = 0;
        int sum = 0;
        System.out.print("Enter Your Number : ");
        num = input.nextInt();
        int n_digit = (String.valueOf(num).length());
        for(int i = 1;i<=n_digit;i++){
            digit = num%10;
            sum += digit;
            num /= 10;
        }
        System.out.println("The Sum For Digit For Your Number = "+sum);
    }
}
