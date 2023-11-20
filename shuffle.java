//Java program to shuffle an array 
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
       // int n = myArray.length;
       
        System.out.println("initial array ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        shuffleArray(myArray);
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
    private static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();
        System.out.println("shuffeled array ");
        for (int i = n - 1; i > 0; i--) {           
            int randomIndex = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
