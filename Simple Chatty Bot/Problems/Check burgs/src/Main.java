import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String check = "burg";

        String cityName = scanner.nextLine();

        System.out.println(cityName.endsWith(check));

    }
}