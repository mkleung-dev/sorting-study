public class BubbleSort extends Sort {

    @Override
    protected int[] sortImplement(int[] input) {
        int[] output = input.clone();
        boolean changed = true;
        int length_1 = output.length - 1;
        for (int i = 0; i < length_1 && changed; i++) {
            changed = false;
            int length_inner = output.length - 1 - i;
            for (int j = 0; j < length_inner; j++) {
                int next = j + 1;
                if (this.compare.compare(output[j], output[next]) > 0) {
                    changed = true;
                    int temp = output[j];
                    output[j] = output[next];
                    output[next] = temp;
                }
            }
        }
        return output;
    }
}
