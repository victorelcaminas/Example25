import java.util.Scanner;

public class Example25 {
    public static void main(String[] args){
        int num, multi = 1, i;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter a number:");
        num = inputValue.nextInt();

        for (i = 1; i <= 10; i++) {
           multi = num * i;
            System.out.println(num + " x " + i+ " = " +multi);
        }
    }
}
