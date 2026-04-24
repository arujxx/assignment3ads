public class Experiment {

    private Sorter sorter;
    private Searcher searcher;

    public Experiment() {
        sorter = new Sorter();
        searcher = new Searcher();
    }

    public long measureSortTime(int[] arr, String type) {
        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(arr);
        } else if (type.equals("advanced")) {
            sorter.advancedSort(arr);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("Array size: " + size);

            int[] randomArray1 = sorter.generateRandomArray(size);
            int[] randomArray2 = randomArray1.clone();

            long bubbleRandomTime = measureSortTime(randomArray1, "basic");
            long mergeRandomTime = measureSortTime(randomArray2, "advanced");

            System.out.println("Random array:");
            System.out.println("Bubble Sort time: " + bubbleRandomTime + " ns");
            System.out.println("Merge Sort time: " + mergeRandomTime + " ns");

            int[] sortedArray1 = sorter.generateSortedArray(size);
            int[] sortedArray2 = sortedArray1.clone();

            long bubbleSortedTime = measureSortTime(sortedArray1, "basic");
            long mergeSortedTime = measureSortTime(sortedArray2, "advanced");

            System.out.println("Sorted array:");
            System.out.println("Bubble Sort time: " + bubbleSortedTime + " ns");
            System.out.println("Merge Sort time: " + mergeSortedTime + " ns");

            int target = size / 2;
            long searchTime = measureSearchTime(sortedArray1, target);

            System.out.println("Binary Search time: " + searchTime + " ns");
            System.out.println("--------------------------------");
        }
    }
}