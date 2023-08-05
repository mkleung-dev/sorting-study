import java.awt.datatransfer.SystemFlavorMap;
import java.util.Random;

public class Main {

//    private final static int testCount = 10;
//    private final static int arrayLength = 20;
    private final static int testCount = 60;
    private final static int arrayLength = 100000;
    private final static int intMax = arrayLength * 100;

    static void dumpIntArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[][] intArray = new int[testCount][arrayLength];
        for (int listIndex = 0; listIndex < intArray.length; listIndex++) {
            for (int i = 0; i < intArray[listIndex].length; i++) {
                intArray[listIndex][i] = random.nextInt(intMax);
            }
        }

        // dumpIntArray(intArray);
        SortHandler sortHandler = new SortHandler(intArray);

        sortHandler.test(new BubbleSort());
        System.out.println("Bubble Sort:   \t" + (sortHandler.isLastCorrect() ? "Correct" : "Wrong") + "\tTime [ms]:\t" + sortHandler.getLastElapsed());

        sortHandler.test(new QuickSort());
        System.out.println("Quick Sort:    \t" + (sortHandler.isLastCorrect() ? "Correct" : "Wrong") + "\tTime [ms]:\t" + sortHandler.getLastElapsed());

        sortHandler.test(new SelectionSort());
        System.out.println("Selection Sort:\t" + (sortHandler.isLastCorrect() ? "Correct" : "Wrong") + "\tTime [ms]:\t" + sortHandler.getLastElapsed());

        sortHandler.test(new InsertionSort());
        System.out.println("Insertion Sort:\t" + (sortHandler.isLastCorrect() ? "Correct" : "Wrong") + "\tTime [ms]:\t" + sortHandler.getLastElapsed());

        sortHandler.test(new MergeSort());
        System.out.println("Merge Sort:    \t" + (sortHandler.isLastCorrect() ? "Correct" : "Wrong") + "\tTime [ms]:\t" + sortHandler.getLastElapsed());

        sortHandler.test(new HeapSort());
        System.out.println("Heap Sort:    \t" + (sortHandler.isLastCorrect() ? "Correct" : "Wrong") + "\tTime [ms]:\t" + sortHandler.getLastElapsed());

    }
}