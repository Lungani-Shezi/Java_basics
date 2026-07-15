import java.util.Scanner;

public class GCD {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i =0; i<=2*n; i++){
            if (i%2==0) {
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        return gcd(sumOdd, sumEven);
    }

    public int gcd(int num1, int num2){

        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        GCD gcdCalculator = new GCD();
        System.out.println(Integer.toString(gcdCalculator.gcdOfOddEvenSums(n)));
    }
}