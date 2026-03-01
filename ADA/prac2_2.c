// Implementation and Time analysis of linear and binary search algorithm.
// Binary search

#include <stdio.h>

int main() {
    int arr[] = {12, 22, 25, 34, 64};
    int n = 5, target = 25, left = 0, right = n - 1, found = -1;

    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            found = mid;
            break;
        } else if (arr[mid] < target)
            left = mid + 1;
        else
            right = mid - 1;
    }

    printf("Binary Search: Found at index %d\n", found);

    return 0;
}

/* OUTPUT:
    Binary Search: Found at index 2
    Analysis: Divides search space by half recursively. O(log n) time, requires
   sorted array.
*/
