import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int elements;
        int loop1 = sc.nextInt();
        if (loop1 < 30000) {
            for (int i = 0; i < loop1; i++) {
                elements = sc.nextInt();
                if (elements % 4 == 0 && elements < 1000) {
                    if (sum < elements) {
                        sum = elements;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

