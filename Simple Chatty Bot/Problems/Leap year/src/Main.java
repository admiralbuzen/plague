import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int check = year%4;
        int check2 = year%400;

        if ((year % 4 == 0 && year % 100 !=0) || year % 400 ==0 ){
            System.out.println("Leap");
        }
        else{
            System.out.println("Regular");
        }

    }
}