public class QuickSort {

    public void quickSort(int [] arr, int low, int high){
        if(low < high){
            int pivot = findPivot(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private int findPivot(int[] arr, int low, int high) {
        int index = low-1, pivotIndex = high;
        for(int index2 = low ;index2 < pivotIndex; index2++){
            if(arr[index2] < arr[pivotIndex]){
                index++;
                int temp = arr[index];
                arr[index] = arr[index2];
                arr[index2] = temp;
            }
        }
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[++index];
        arr[index] = temp;
        return index;
    }
}
