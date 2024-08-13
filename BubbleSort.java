public class BubbleSort {

    public void bubbleSort(int [] array){
        for(int index = 0; index < array.length -1; index++){
            for(int index2 = 0 ; index2 < array.length - index -1; index2++){
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
