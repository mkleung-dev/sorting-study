public class SelectionSort extends Sort {

    @Override
    protected int[] sortImplement(int[] input) {
        int[] output = input.clone();
        int length = output.length;
        int length_minus_1 = length - 1;
        for (int i = 0; i < length_minus_1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (this.compare.compare(output[i], output[j]) > 0) {
                    int temp = output[i];
                    output[i] = output[j];
                    output[j] = temp;
                }
            }
        }
        return output;
    }
}
