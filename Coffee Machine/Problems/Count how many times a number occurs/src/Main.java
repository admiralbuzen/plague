import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int counter = 0;
        int occurence = scanner.nextInt();
        for (int d : array) {
            if (d == occurence) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}