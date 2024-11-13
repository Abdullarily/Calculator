import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine().replaceAll(" ", "");
        System.out.println(calc(equation));
    }
    public static String calc(String input) {
        if (input.length() > 3) {
            input = "ошибка";
        }
        String aa = String.valueOf(input.charAt(0));
        String b = String.valueOf(input.charAt(1));
        String cc = String.valueOf(input.charAt(2));
        int a = Integer.valueOf(aa);
        int c = Integer.valueOf(cc);
        int out = 0;

        switch (b) {
            case "+":
                out = a + c;
                break;
            case "-":
                out = a - c;
                break;
            case "*":
                out = a * c;
                break;
            case "/":
                out = a / c;
                break;
        }

        return String.valueOf(out);
    }
}