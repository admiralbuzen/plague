import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstNumber = number / 10;

        System.out.println(firstNumber);
    }
}