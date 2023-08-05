public abstract class Sort  {
    public interface CompareInterface {
        int compare(int a1, int a2);
    }
    protected CompareInterface compare;
    public Sort() {
        this.compare = (x, y) -> {
            if (x > y) return 1;
            if (x < y) return -1;
            return 0;
        };
    }
    public Sort(CompareInterface compare) {
        this.compare = compare;
    }

    protected abstract int[] sortImplement(int[] input);

    public int[] sort(int[] input) {
        return sortImplement(input);
    }
}
