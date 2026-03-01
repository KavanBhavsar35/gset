// Implementation and Time analysis of sorting algorithms:
// Bubble sort

#include <stdio.h>

int main() {
    int arr[] = {64, 34, 25, 12, 22};
    int n = 5, i, j, temp;

    for (i = 0; i < n - 1; i++)
        for (j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }

    printf("Bubble Sort Output: ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}

/* OUTPUT:
    Bubble Sort Output: 12 22 25 34 64
    Analysis: Compares adjacent elements repeatedly, swaps if greater. O(n²) time complexity.
*/
