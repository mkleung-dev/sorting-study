import java.util.Arrays;

public class SortHandler {
    private int[][] intList;
    private int[][] sortedList;

    private int lastElapsed;
    private boolean lastCorrect;
    public SortHandler(int[] intList) {
        this.intList = new int[1][];
        this.sortedList = new int[1][];
        for (int i = 0; i < this.sortedList.length; i++) {
            this.intList[i] = intList.clone();
            this.sortedList[i] = this.intList[i].clone();
            Arrays.sort(this.sortedList[i]);
        }
    }

    public SortHandler(int[][] intList) {
        this.intList = new int[intList.length][];
        this.sortedList = new int[intList.length][];
        for (int i = 0; i < this.sortedList.length; i++) {
            this.intList[i] = intList[i].clone();
            this.sortedList[i] = this.intList[i].clone();
            Arrays.sort(this.sortedList[i]);
        }
    }

    private boolean verify(int[][] intList) {
        boolean correct = true;
        for (int listIndex = 0; listIndex < intList.length; listIndex++) {
            if (sortedList[listIndex].length != intList[listIndex].length) {
                correct = false;
            }
            for (int i = 0; correct && i < sortedList[listIndex].length; i++) {
                if (sortedList[listIndex][i] != intList[listIndex][i]) {
                    correct = false;
                }
            }
        }
        return correct;
    }

    public void test(Sort sort) {
        int[][] candidateList = new int[intList.length][];
        long start = System.currentTimeMillis();
        for (int listIndex = 0; listIndex < intList.length; listIndex++) {
            candidateList[listIndex] = sort.sort(intList[listIndex]);
        }
        long finish = System.currentTimeMillis();
        lastElapsed = (int) ((finish - start) / intList.length);
        lastCorrect = verify(candidateList);
    }

    public int getLastElapsed() {
        return lastElapsed;
    }

    public boolean isLastCorrect() {
        return lastCorrect;
    }
}
