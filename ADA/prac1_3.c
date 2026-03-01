// Implementation and Time analysis of sorting algorithms:
// Insertion sort

#include <stdio.h>

int main() {
    int arr[] = {64, 34, 25, 12, 22};
    int n = 5, i, j, key;

    for (i = 1; i < n; i++) {
        key = arr[i];
        for (j = i - 1; j >= 0 && arr[j] > key; j--)
            arr[j + 1] = arr[j];
        arr[j + 1] = key;
    }

    printf("Insertion Sort Output: ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}

/* OUTPUT:
    Insertion Sort Output: 12 22 25 34 64
    Analysis: Inserts elements into sorted portion iteratively. O(n²) worst, O(n) best case.
*/