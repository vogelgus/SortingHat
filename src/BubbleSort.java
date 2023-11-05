import java.sql.SQLOutput;
import java.util.Arrays;

public class BubbleSort {

    public int[] array;

    public BubbleSort(){
        //construct array
        makeArray();
        //print unsorted array
        printArray();
        //sort array
        sortArray();
        //print sorted array to make sure it worked
        printArray();
    }

    public void makeArray(){
        //construct the array
        array = new int[8];
        for (int i = 0; i < 8; i++){
            array[i] = (int)((Math.random()*9)+1);

        }

    }

    public void printArray(){
    // print all elements of array in one line -- separated by a line
//        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j]+" ");

        }
        System.out.println();
    }

    public void sortArray(){
    // sort the array
        boolean madeSwap = false;
        for (int y = 1;  y < (array.length); y++) {
            madeSwap = false; // madeSwap is false
            for (int x = 1; x < (array.length-(y-1)); x++) {
                if (array[x-1] > array[x]) {
                    int temp = array[x];
                    array[x] = array[x-1];
                    array[x-1] = temp;
                    madeSwap = true;
                } // end of if statement
            } // end of inner for loop
            if (madeSwap == false){
                break; //breaks the for loop
            }
//            printArray();
        } // end of outer for loop

    }



    public static void main(String[] args) {
        BubbleSort bubbles = new BubbleSort();
    }

}