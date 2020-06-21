import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = str.toUpperCase();

        System.out.println(str2.startsWith("J"));
    }
}