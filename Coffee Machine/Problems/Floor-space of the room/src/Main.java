import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.next();
//        double a = scanner.nextInt();
//        double b = scanner.nextInt();
//        double c = scanner.nextInt();
        // double r = scanner.nextInt();

        switch (type) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double halfP = (a + b + c) / 2;
                double sum1 = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
                System.out.println(sum1);
                break;

            case "rectangle":
                double d = scanner.nextInt();
                double e = scanner.nextInt();
                double sum = d * e;


                System.out.println(sum);
                break;
            case "circle":
                double r = scanner.nextInt();

                System.out.println(3.14 * Math.pow(r, 2));
                break;

        }
    }
}