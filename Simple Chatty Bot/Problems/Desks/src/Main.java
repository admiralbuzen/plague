import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        int tableFirstClass = (class1 + 1) / 2;
        int tableSecondClass = (class2 + 1) / 2;
        int tableThirdClass = (class3 + 1) / 2;

        int tablesCount = tableFirstClass + tableSecondClass + tableThirdClass;

        System.out.println(tablesCount);


    }
}