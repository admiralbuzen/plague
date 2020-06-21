import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        while (scanner.nextInt() != 0){
            numbers++;
        }
        System.out.println(numbers);

    }
}