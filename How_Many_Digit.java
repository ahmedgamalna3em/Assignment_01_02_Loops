package First_Assignment_2_2;
import java.util.Scanner;
public class How_Many_Digit {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        System.out.print("Enter Your Number : "+num);
        int count = 0;
        for(int i=0;i<=count;i++){
          int digit = num %=10;
                num /= 10;
                count ++;

        }

        System.out.println("The Number For Digit = "+ count + " For This Number = ");
    }
}
