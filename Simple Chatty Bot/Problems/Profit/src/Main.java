import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextDouble();
        double P = scanner.nextDouble();
        double K = scanner.nextDouble();
        int years = 0;
        while (K > M) {

            M = M * (1 + P / 100);

            years++;

        }
        System.out.println(years);

    }


}
