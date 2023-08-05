import java.util.Arrays;

public class HeapSort extends Sort {

    private void heapify(int[] input, int end, int index) {
        int leftIndex = 2 * index;
        int rightIndex = 2 * index + 1;
        int maxIndex = index;
        if (leftIndex < end && this.compare.compare(input[leftIndex], input[maxIndex]) > 0) {
            maxIndex = leftIndex;
        }
        if (rightIndex < end && this.compare.compare(input[rightIndex], input[maxIndex]) > 0) {
            maxIndex = rightIndex;
        }
        if (index != maxIndex) {
            int temp = input[index];
            input[index] = input[maxIndex];
            input[maxIndex] = temp;
            heapify(input, end, maxIndex);
        }
    }

    private void buildHeapTree(int[] input) {
        int length = input.length;
        int mid = length / 2;
        for (int i = mid; i >= 0; i--) {
            heapify(input, length, i);
        }
    }

    @Override
    protected int[] sortImplement(int[] input) {
        int[] output = input.clone();
        buildHeapTree(output);
        int length_1 = output.length - 1;
        for (int i = length_1; i > 0; i--) {
            int temp = output[0];
            output[0] = output[i];
            output[i] = temp;
            heapify(output, i, 0);
        }
        return output;
    }
}
