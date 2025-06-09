"""Quicksort using the final element as the pivot"""

def partition(arr, start_index, end_index):
    assert end_index - start_index >= 2

    pivot_index = end_index - 1
    left = start_index
    right = pivot_index

    while left < right:
        while left < right and arr[left] < arr[pivot_index]:
            left += 1
        while left < right and arr[right - 1] > arr[pivot_index]:
            right -= 1
        if left < right:
            arr[left], arr[right - 1] = arr[right - 1], arr[left]

            left += 1
            right -= 1
    arr[right], arr[pivot_index] = arr[pivot_index], arr[right]
    pivot_index = right
    return pivot_index


def quicksortSubarray(arr, start_index, end_index):
    assert 0 <= start_index
    assert start_index <= end_index
    assert end_index <= len(arr)

    if end_index - start_index < 2:
        return

    pivot_index = partition(arr, start_index, end_index)
    quicksortSubarray(arr, start_index, pivot_index)
    quicksortSubarray(arr, pivot_index + 1, end_index)


def quicksort(arr):
    quicksortSubarray(arr, 0, len(arr))


def main():
    arr = [1, 0, 9, 45678, -8, 9.76]
    quicksort(arr)
    print(arr)


main()

