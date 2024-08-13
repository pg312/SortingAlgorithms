public class MergeSort {

    public void merge(int[] array, int low, int middle, int high){
        int [] leftArray = new int[middle-low+1];
        int [] rightArray = new int[high-middle];
        for(int index  = 0; index < leftArray.length; index++)
            leftArray[index] = array[low+index];
        for(int index = 0; index < rightArray.length; index++)
            rightArray[index] = array[middle+index+1];
        int k = low, leftIndex = 0, rightIndex = 0;
        while(leftIndex < leftArray.length && rightIndex < rightArray.length){
            if(leftArray[leftIndex] < rightArray[rightIndex])
                array[k++] = leftArray[leftIndex++];
            else
                array[k++] = rightArray[rightIndex++];
        }
        while(leftIndex < leftArray.length)
            array[k++] = leftArray[leftIndex++];
        while(rightIndex < rightArray.length)
            array[k++] = rightArray[rightIndex++];

    }
    public void mergeSort(int [] array, int left, int right){
        if(left < right){
          int middle = (left + right)/2;
          mergeSort(array,left,middle);
          mergeSort(array,middle+1,right);
          merge(array, left,middle,right);
        }
    }
}
