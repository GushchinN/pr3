import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MRcd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = 0;
        while (n <= 0) {
            System.out.print("Введите натуральное число n: ");
            n = sc.nextInt();
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1);
        }
        System.out.println("Массив: " + Arrays.toString(arr));

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("Чётных элементов нет");
        } else {
            int[] even = new int[cnt];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    even[j] = arr[i];
                    j++;
                }
            }
            System.out.println("Чётные элементы: " + Arrays.toString(even));
        }
    }
}
