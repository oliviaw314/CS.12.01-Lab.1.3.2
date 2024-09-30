import java.util.ArrayList;
import java.util.Arrays;

public class Sort {

    public static int[] bubbleSort(int[] array) {
       int rounds = 0;
        while (rounds<array.length-1) {
            for (int i=0; i<array.length-1; i++) {
                if (array[i]>array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            rounds++;
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {
        int rounds = 0;
        while (rounds<array.length-1) {
            for (int i=0; i<array.length-1; i++) {

                if (array[i].compareToIgnoreCase(array[i+1])>0) {
                    // if array[i] is alphabetically larger than array[i+1]
                    // ignoreCase ensures that it doesn't check for upper case
                   String temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            rounds++;
        }
        return array;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        int rounds = 0;
        while (rounds<list.size()-1) {
            for (int i=0; i<list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i+1))>0) {
                    int temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                }
            }
            rounds++;
        }
        return list;
    }

    public static int[] selectionSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            int minNumber = array[i];
            int minIndex = i;

            // finding the smallest number remaining in the array
            for (int j=i; j<array.length; j++) {
                if (array[j]<minNumber) {
                    minNumber = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {
        for (int i=0; i<array.length; i++) {
            String minString = array[i];
            int minIndex = i;

            // finding alphabetically smallest string remaining in the array
            for (int j=i; j<array.length; j++) {
                if (minString.compareToIgnoreCase(array[j])>0) {
                    minString = array[j];
                    minIndex = j;
                }
            }
            String temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for (int i=0; i<list.size(); i++) {
            String minString = list.get(i);
            int minIndex = i;

            // finding alphabetically smallest string remaining in the list
            for (int j=i; j<list.size(); j++) {
                if (minString.compareToIgnoreCase(list.get(j))>0) {
                    minString = list.get(j);
                    minIndex = j;
                }
            }
            String temp = list.get(i);
            list.set(i, minString);
            list.set(minIndex, temp);
        }
        return list;
    }

}
