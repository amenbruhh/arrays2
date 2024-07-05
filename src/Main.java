import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // задача 1

        int[] payments = new int[5];
        payments[0] = 12_000;
        payments[1] = 11_000;
        payments[2] = 11_500;
        payments[3] = 10_000;
        payments[4] = 10_500;

        int sum = 0;

        for (int element : payments) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        // задача 2

        int[] weeklyExpenses = new int[5];
        weeklyExpenses[0] = 2_000;
        weeklyExpenses[1] = 2_400;
        weeklyExpenses[2] = 2_100;
        weeklyExpenses[3] = 4_900;
        weeklyExpenses[4] = 1_010;

        int maxExpenses = -1;
        int minExpenses = 1_000_000;

        for (final int current : weeklyExpenses) {
            if (current < minExpenses) {
                minExpenses = current;
            }
        }

        for (final int current : weeklyExpenses) {
            if (current > maxExpenses) {
                maxExpenses = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей");
        System.out.println();

        // задача 3

        double[] monthlyExpenses = new double[5];
        monthlyExpenses[0] = 12_000;
        monthlyExpenses[1] = 13_000;
        monthlyExpenses[2] = 10_000;
        monthlyExpenses[3] = 9_000;
        monthlyExpenses[4] = 20_000;

        double average;

        for (double element : monthlyExpenses) {
            sum += element;
        }
        average = sum / monthlyExpenses.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();

        // задча 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i > 0){
                System.out.print("");
            }
        }
    }
}
