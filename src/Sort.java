public abstract class Sort  {
    public interface CompareInterface {
        int compare(int a1, int a2);
    }
    protected CompareInterface compare;
    protected int elapsedTimeInMS;
    public Sort() {
        this.compare = (x, y) -> {
            if (x > y) return 1;
            if (x < y) return -1;
            return 0;
        };
        elapsedTimeInMS = 0;
    }
    public Sort(CompareInterface compare) {
        this.compare = compare;
        elapsedTimeInMS = 0;
    }

    public int getElapsedTimeInMS() {
        return elapsedTimeInMS;
    }

    protected abstract int[] sortImplement(int[] input);

    public int[] sort(int[] input) {
        int[] output = sortImplement(input);
        return output;
    }
}
