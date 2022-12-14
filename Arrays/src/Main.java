public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = -4;
        intArray[3] = 90;
        intArray[4] = -50;

        for (int i=0; i< intArray.length; i++){
            System.out.println("Integer in index " + i + " = " + intArray[i]);
        }
    }
}