package First_Assignment_2_2;
import java.util.Scanner;
public class Complexity {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num;
        int count = 0;

        System.out.print("Enter Number : ");
        num = input.nextInt();
        int old_num = num;

        System.out.print("Your number : "+ num);
        for(int i = 1;i<num;i/=2){
            num/=2;
            count++;
            if(num/2==0){
                break;
            }
        }


        System.out.print(" and the Steps to make divide 2 is = "+ count);


    }
}
