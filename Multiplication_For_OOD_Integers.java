package First_Assignment_2_2;

public class Multiplication_For_OOD_Integers {
    public static void main(String[] args) {
        int mul=1;
            for(int i=1;i<=15;i++){
                if(i%2!=0){
                    System.out.print(i+" , ");
                    mul *=i;
                }

            }
            System.out.println("\nThe Multiplicaion For Odd Number Between 1 --> 15 Is = "+ mul);

        }

    }

