// Implementation and Time analysis of sorting algorithms: Merge Sort

#include <stdio.h>
#include <string.h>

void merge(int arr[], int left, int mid, int right) {
    int i = left, j = mid + 1, k = 0;
    int temp[right - left + 1];

    while (i <= mid && j <= right)
        temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];

    while (i <= mid)
        temp[k++] = arr[i++];

    while (j <= right)
        temp[k++] = arr[j++];

    for (int t = 0; t < k; t++)
        arr[left + t] = temp[t];
}

void mergeSort(int arr[], int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

int main() {
    int arr[] = {64, 34, 25, 12, 22};
    int n = 5, i;

    mergeSort(arr, 0, n - 1);

    printf("Merge Sort Output: ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}

/* OUTPUT:
    Merge Sort Output: 12 22 25 34 64
    Analysis: Divide and conquer approach, merges sorted subarrays. O(n log n)
    stable sort, O(n) space.
*/
