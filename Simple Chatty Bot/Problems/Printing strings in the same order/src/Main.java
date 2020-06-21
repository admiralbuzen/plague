import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String text1 = "Hellow";
        String text2 = "Java";
        String text3 = "Future programmer";
        String text4 = "programmer ";
        Scanner scanner = new Scanner(System.in);
        text1 = scanner.nextLine();
        text2 = scanner.nextLine();
        text3 = scanner.next();
        text4 = scanner.next();

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

    }
}