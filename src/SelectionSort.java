public class SelectionSort {

    public int[] array;

    public SelectionSort(){
        //construct array
        makeArray();
        //print unsorted array
        printArray();
        //sort array
        selectionSortArray();
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
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j]+" ");

        }
        System.out.println();

    }

    public void selectionSortArray(){
        for (int x = 0; x < (array.length-1); x++){
             int currentMin = x;
             for (int y = x+1; y < (array.length); y++){
                 if (array[y] < array[currentMin]){
                    currentMin = y;
                 }
             }
            int min = array[currentMin];
            array[currentMin] = array[x];
            array[x] = min;
            }
        }


    public static void main(String[] args) {
        SelectionSort insert = new SelectionSort();
    }
}
