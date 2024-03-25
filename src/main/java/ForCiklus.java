import java.util.Scanner;

public class ForCiklus {
    public static void main(String[] args) {
        // Креирање на Scanner објект за внес од тастатура
        Scanner input = new Scanner(System.in);
        // Внесување на вредност за n од тастатура
        System.out.print("Внесете го n: ");
        int n = input.nextInt();
        // Затворање на Scanner објектот за внес
        input.close();

        // Печатење на порака за броеви деливи со 5
        System.out.print("Броеви деливи со 5 до n-тиот број се: ");
        // Циклус за проверка на броеви деливи со 5 и нивно печатење
        for (int i = 1; i <= n; i++) {
            // Проверка дали бројот е делив со 5
            if (i % 5 == 0) {
                // Печатење на бројот
                System.out.print(i + " ");
                // Печатење на пораката за деливост со 5
                System.out.print("(бројот " + i + " е делив со 5) ");
            }
        }
    }
}

