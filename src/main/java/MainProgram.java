
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);

    }

    public static int smallest(int[] array) {
        int s = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
            }
        }
        return s;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int s = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexS = startIndex;
        int s = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < s) {
                s = table[i];
                indexS = i;
            }
        }
        return indexS;
    }

    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;
    }

    public static void sort(int[] array) {
        int aux = 0;
        while (aux != array.length) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);

            }
            System.out.println();
            MainProgram.swap(array, aux, MainProgram.indexOfSmallestFrom(array, aux));
            aux++;
        }
    }

}
