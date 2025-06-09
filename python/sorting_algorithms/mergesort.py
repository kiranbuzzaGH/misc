def merge(left_array, right_array):
    merged = []
    while (len(left_array) > 0 and len(right_array) > 0):
        if left_array[0] <= right_array[0]:
            merged.append(left_array[0])
            left_array.remove(left_array[0])
        else:
            merged.append(right_array[0])
            right_array.remove(right_array[0])

    # This step is not a problem as one of right or left is empty
    merged.extend(left_array)
    merged.extend(right_array)
    return merged



def mergesort(arr):
    if len(arr) < 2:
        return arr

    mid = int(len(arr)/2)

    left_array = mergesort(arr[:mid])
    right_array = mergesort(arr[mid:])

    sorted = merge(left_array, right_array)

    return sorted


def main():
    arr = [1.12345, 2, -3, -0]
    print(mergesort(arr))


main()
