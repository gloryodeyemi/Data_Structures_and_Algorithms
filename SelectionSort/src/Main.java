public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, -22, 12};

        // Selection sort algorithm
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        // print out sorted array
        for (int item: intArray){
            System.out.println(item);
        }
    }

    // method to swap items in the array
    public static void swap(int[] array, int i, int j){
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}