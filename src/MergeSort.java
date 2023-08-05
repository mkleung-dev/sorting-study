import java.util.Arrays;

public class MergeSort extends Sort {

    private void mergeSort(int[] input, int start, int end) {
        if (start + 1 >= end) return;
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        int[] slicedArray1 = Arrays.copyOfRange(input, start, mid);
        int[] slicedArray2 = Arrays.copyOfRange(input, mid, end);
        int list1Curr = 0;
        int list2Curr = 0;
        int list1Length = slicedArray1.length;
        int list2Length = slicedArray2.length;
        while (list1Curr < list1Length && list2Curr < list2Length) {
            if (this.compare.compare(slicedArray1[list1Curr], slicedArray2[list2Curr]) < 0) {
                input[start++] = slicedArray1[list1Curr++];
            } else {
                input[start++] = slicedArray2[list2Curr++];
            }
        }
        while (list1Curr < list1Length) {
            input[start++] = slicedArray1[list1Curr++];
        }
        while (list2Curr < list2Length) {
            input[start++] = slicedArray2[list2Curr++];
        }
    }
    @Override
    protected int[] sortImplement(int[] input) {
        int[] output = input.clone();
        mergeSort(output, 0, output.length);
        return output;
    }
}
