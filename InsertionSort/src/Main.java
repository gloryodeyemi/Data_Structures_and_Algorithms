public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, -22, 12};

        // Insertion sort algorithm
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }

        // print out sorted array
        for (int item: intArray){
            System.out.println(item);
        }
    }
}