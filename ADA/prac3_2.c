// Implementation and Time analysis of sorting algorithms: Quick Sort

#include <stdio.h>

int partition(int arr[], int low, int high) {
    int pivot = arr[high], i = low - 1, j, temp;
    for (j = low; j < high; j++)
        if (arr[j] < pivot) {
            i++;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}

void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int main() {
    int arr[] = {64, 34, 25, 12, 22};
    int n = 5, i;

    quickSort(arr, 0, n - 1);

    printf("Quick Sort Output: ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}

/* OUTPUT:
    Quick Sort Output: 12 22 25 34 64
    Analysis: In-place divide and conquer using pivot partitioning. O(n log n)
    average, O(n²) worst, O(log n) space.
*/
