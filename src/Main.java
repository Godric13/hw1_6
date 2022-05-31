import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static <i> void main(String[] args) {
        int[] arr1 = generateRandomArray();
        int summ = 0;
        for (int i : arr1) {
            summ = summ + i;
        }

        System.out.println("Сумма трат за месяц составила " + summ + " рублей");
        // Задание 2

        int max = 0;
        for (int i : arr1) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);

        int min = max;
        for (int q : arr1) {
            if (q < min) {
                min = q;
            }
        }

        System.out.println(min);

        // Задание 3
        float mid = summ / 30F;
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей");

        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
    }
}



