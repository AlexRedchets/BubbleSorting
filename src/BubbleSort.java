import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        Random random = new Random();

        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(99);
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sorted by BubbleSort : " + Arrays.toString(bubbleSort(array)));

    }

    private static int[] bubbleSort(int[] array){

        boolean swap;

        do {
            swap = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    Swap(array, i - 1, i);
                    swap = true;
                }
            }
        } while (swap);

        return array;
    }

    private static int[] Swap(int[] array, int firstIndex, int secondIndex){

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        return array;
    }

}
