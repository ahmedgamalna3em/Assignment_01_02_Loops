package First_Assignment_2_2;
import java.util.Scanner;
public class ReadPositiveNumber {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        float num;
        float count = 0;
        float sum_Positive = 0;
        float average = 0;
        for(int i=1;i>0;i++){
            num = input.nextInt();
            sum_Positive += num;
            count ++;
            if(num<0){
                count --;
                sum_Positive -=num;
                break;
            }

        }
        average = sum_Positive/count;
        System.out.println("The Sum For Positive Number = "+sum_Positive);
        System.out.println("The average For Positive This Number = "+average);

    }
}
