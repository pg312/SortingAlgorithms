public class SelectionSort {

    public void selectionSort(int[] array){

        for(int index  = 0; index < array.length; index++){
            int minIndex = index;
            for(int index2 = index+1; index2 < array.length; index2++){
                if(array[minIndex] > array[index2]){
                    minIndex  = index2;
                }
            }
            if(minIndex != index){
                array[index] += array[minIndex];
                array[minIndex] = array[index] - array[minIndex];
                array[index] -= array[minIndex];
            }
        }
        for(int e : array){
            System.out.println(e);
        }

    }
}
