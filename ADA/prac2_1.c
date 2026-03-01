// Implementation and Time analysis of linear and binary search algorithm.
// Linear search

#include <stdio.h>

int main() {
    int arr[] = {64, 34, 25, 12, 22};
    int n = 5, target = 25, i, found = -1;

    for (i = 0; i < n; i++)
        if (arr[i] == target) {
            found = i;
            break;
        }

    printf("Linear Search: Found at index %d\n", found);

    return 0;
}

/* OUTPUT:
    Linear Search: Found at index 2
    Analysis: Searches sequentially from start to end. O(n) time, works on
    unsorted array.
*/
