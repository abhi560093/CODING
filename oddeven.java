import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        System.out.println("Write a number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 <= 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
        System.out.println("Thank you for using");
    }
}
