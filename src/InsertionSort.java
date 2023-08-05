public class InsertionSort extends Sort {

    @Override
    protected int[] sortImplement(int[] input) {
        int[] output = input.clone();
        int length = output.length;
        for (int currIndex = 1; currIndex < length; currIndex++) {
            int j = 0;
            int currValue = output[currIndex];
            for (; j < currIndex && this.compare.compare(output[j], currValue) < 0; j++) {}
            int insertIndex = j;
            for (int k = currIndex; k > insertIndex; k--) {
                output[k] = output[k-1];
            }
            output[insertIndex] = currValue;
        }
        return output;
    }
}
