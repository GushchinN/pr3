import java.util.Random;
import java.util.Arrays;

public class MRcd1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int rndn = rand.nextInt(1,10);
        double[] arr = new double[rndn];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        System.out.println("Не отсортированный массив (Math.random): "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив (Math.random): "+Arrays.toString(arr));

        double[] arr2 = new double[rndn];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextDouble();
        }
        System.out.println("\nНе отсортированный массив (Random): "+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Отсортированный массив (Random): "+Arrays.toString(arr2));

    }
}