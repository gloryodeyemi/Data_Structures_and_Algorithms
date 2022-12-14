public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = -4;
        intArray[3] = 90;
        intArray[4] = -50;

        // print out integers in the array
        for (int i=0; i< intArray.length; i++){
            System.out.println("Integer in index " + i + " = " + intArray[i]);
        }

        // find index of -4
        int index = -1;
        for (int i=0; i< intArray.length; i++){
            if (intArray[i] == -4){
                index = i;
                break;
            }
        }
        System.out.println("Index of -4 = " + index);
    }
}