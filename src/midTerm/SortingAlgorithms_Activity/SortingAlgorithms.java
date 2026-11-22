package midTerm.SortingAlgorithms_Activity;

public class SortingAlgorithms {

    public static void main(String[] args) {

        BubbleSort();
        System.out.println();

        SelectionSort();
        System.out.println();

        InsertionSort();
        System.out.println();

    }

    public static void BubbleSort() {

        int[] numbers = {30, 20, 99, 6, 56, 12, 1, 45, 22, 2};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }

            }

        }

        System.out.println("Sorted Array using Bubble Sort: ");

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");

        }
        System.out.println();

    }

    public static void SelectionSort() {

        int[] numbers = {30, 20, 99, 6, 56, 12, 1, 45, 22, 2};

        for (int i = 0; i < numbers.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;

                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

        }
        System.out.println("Sorted Array using Selection Sort: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }

        System.out.println("");

    }

    public static void InsertionSort() {

        int[] numbers = {30, 20, 99, 6, 56, 12, 1, 45, 22, 2};
        
        
        for (int i = 1; i < numbers.length; i++) {
            
            int key = numbers[i];
            int j = i - 1;
            
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
                
            }
            numbers[j + 1] = key;
            
        }
        
        System.out.println("Sorted Array using Insertion Sort: ");
        
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.print(numbers[i] + " ");
            
        }

    }

}
