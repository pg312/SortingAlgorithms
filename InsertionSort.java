public class InsertionSort {

    public void insertionSort(int [] array){
        for(int index = 1; index < array.length ; index++){
            for(int index2 = 0; index2 < index; index2++){
                if(array[index2] > array[index2+1]){
                    array[index2] += array[index2+1];
                    array[index2+1]  = array[index2] - array[index2+1];
                    array[index2] -= array[index2+1];
                }
            }
        }
        for(int e : array){
            System.out.println(e);
        }
    }
}
