import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String formula = scanner.nextLine();
//        String[] splitedFormlula = formula.split("\\s+");
        long firstNumber = formula.charAt(0);
        String operation = String.valueOf(formula.charAt(1));
        long secondNumber = formula.charAt(2);




        switch (operation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println((firstNumber * secondNumber));
            case "/":
                if (secondNumber != 0) {
                    System.out.println(firstNumber / secondNumber);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            default:
                System.out.println("Unknown operator");
        }

    }
}