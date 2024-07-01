import java.util.Scanner;

public class Main {
    private static int[] numbers = new int[10];
    public static void main(String[] args) {
        fillArray();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("liczby ujemne nie są dozwolone");
        }
        return number;
    }
    public static void fillArray() {
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = readNumber();
            } catch (NegativeNumberException e) {
                numbers[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }
}
