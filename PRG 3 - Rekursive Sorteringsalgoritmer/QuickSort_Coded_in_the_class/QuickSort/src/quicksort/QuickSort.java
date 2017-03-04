package quicksort;

/**
 *
 * @author hau
 */
public class QuickSort
{

//    quicksort(array, left, right): 
    public void quicksort(int[] arr, int left, int right)
    {
//	if left < right:
        if (left < right)
        {
//		pivot := partition(array, left, right) 
            int pivot = partition(arr, left, right);
//		quicksort(array, left, pivot - 1) 
            quicksort(arr, left, pivot - 1);
//		quicksort(array, pivot + 1, right)
            quicksort(arr, pivot + 1, right);
        }
    }

    // left is the index of the leftmost element of the subarray 
    // right is the index of the rightmost element of the subarray (inclusive)
    // number of elements in subarray = right-left+1 
    //partition(array, left, right) 
    private int partition(int[] arr, int left, int right)
    {
//	pivotIndex := choosePivot(array, left, right) 
        int pivot = (left + right) / 2;
//	pivotValue := array[pivotIndex]
        int pivotValue = arr[pivot];
//	swap array[pivotIndex] and array[right] 
        int temp   = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
//	storeIndex := left
        int storeIndex = left;
//	for i from left to right - 1 
        for (int i = left; i < right; i++)
        {
//		if array[i] < pivotValue
            if (arr[i] < pivotValue)
//			swap array[i] and array[storeIndex] 
            {
                int temp2       = arr[i];
                arr[i]          = arr[storeIndex];
                arr[storeIndex] = temp2;
//			storeIndex := storeIndex + 1 
                storeIndex++;
            }
        }
//	swap array[storeIndex] and array[right] 
//		// Move pivot to its final place
            int temp3       = arr[storeIndex];
            arr[storeIndex] = arr[right];
            arr[right]      = temp3;
        
//	return storeIndex
            return storeIndex;

        
    }
}
