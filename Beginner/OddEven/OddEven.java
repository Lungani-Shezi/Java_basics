import java.util.Scanner;
import java.util.ArrayList;

public class OddEven{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (input != -1){
            numbers.add(input);
            input = scanner.nextInt();
        }

        for (int in : numbers){
            if (in % 2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }

    }
}