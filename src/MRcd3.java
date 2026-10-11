import java.util.Random;
import java.util.Arrays;

public class MRcd3 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10, 100);
        }
        System.out.println("Массив: "+Arrays.toString(arr));

        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                cnt++;
            }
        }

        if (cnt == 3) {
            System.out.println("Массив строго возрастающий");
        } else {
            System.out.println("Массив не является строго возрастающим");
        }
    }

}