import java.util.Random;

public class QuickSort extends Sort {

    private void quickSort(int[] input, int start, int end) {
        if (start + 1 >= end) return;
        Random random = new Random();
        int pivot = random.nextInt(end - start) + start;
        int temp = input[pivot];
        input[pivot] = input[start];
        input[start] = temp;

        int l = start;
        int r = end - 1;
        while (l < r) {
            if (this.compare.compare(input[l], input[r]) < 0) {
                r--;
            } else {
                int left_plus_1 = l + 1;
                temp = input[l];
                input[l] = input[r];
                input[r] = input[left_plus_1];
                input[left_plus_1] = temp;
                l++;
            }
        }
        quickSort(input, start, l);
        quickSort(input, l + 1, end);
    }
    @Override
    protected int[] sortImplement(int[] input) {
        int[] output = input.clone();
        quickSort(output, 0, output.length);
        return output;
    }
}
