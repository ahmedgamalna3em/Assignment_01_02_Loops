package First_Assignment_2_2;
import java.util.Scanner;
public class PowerForNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int base,power;
        int multiplication = 1;
        System.out.print("Enter Number For base : ");
        base = input.nextInt();
        System.out.print("Enter Number For Power : ");
        power = input.nextInt();
        for(int i=1;i<=power;i++){
            multiplication *=base;
        }
        System.out.println("The Number After Process = " + multiplication );
    }
}
