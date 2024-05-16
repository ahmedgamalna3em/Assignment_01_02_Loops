package First_Assignment_2_2;
import java.util.Scanner;
public class How_Many_Digit {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        long num;
        int count = 0;
        System.out.print("Enter Complixed Number : ");
        num = input.nextLong();
        count = (String.valueOf(num).length());
        System.out.println("The Number For Digit Is : " + count);

    }
}