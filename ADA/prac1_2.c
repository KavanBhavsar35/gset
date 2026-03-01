// Implementation and Time analysis of sorting algorithms:
// Selection sort

#include <stdio.h>

int main() {
    int arr[] = {64, 34, 25, 12, 22};
    int n = 5, i, j, min, temp;

    for (i = 0; i < n - 1; i++) {
        min = i;
        for (j = i + 1; j < n; j++)
            if (arr[j] < arr[min])
                min = j;
        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    printf("Selection Sort Output: ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}

/* OUTPUT:
    Selection Sort Output: 12 22 25 34 64
    Analysis: Selects minimum element and places at beginning recursively. O(n²) time, O(1) space.
*/