""" Adds two n-bit binary integers"""

def add_binary_integers(A, B, n):
    """
    Add two n-bit binary integers

    Arguements
    A -- n-bit integer stored in a list
    B -- n-bit integer stored in a list
    n -- length of the lists
    """

    # To be safe, should really check that A and B only contain 1s and 0s

    carry_over = 0
    C = []

    for i in range(n):
        add = A[i] + B[i] + carry_over
        C.append(add % 2)
        if add > 1:
            carry_over = 1
        else:
            carry_over = 0
    C.append(carry_over)
    return C

def binary_to_decimal(A, n):
    """
    Converts an n-bit binary number to a decimal

    Arguements
    A - a list
    n - length of A
    """
    a = 0
    for i in range(n):
        a += A[i] * pow(2, i)
    return a

if __name__ == "__main__":

    import numpy as np

    # Small numbers
    A = [1, 1, 1]
    B = [1, 0, 1]
    C = add_binary_integers(A, B, len(A))
    print("Small numbers")
    a = binary_to_decimal(A, len(A))
    b = binary_to_decimal(B, len(B))
    c = binary_to_decimal(C, len(C))

    print(a + b == c)

    # Large numbers
    A = np.random.randint(0, 1, size=100)
    B = np.random.randint(0, 1, size=100)
    C = add_binary_integers(A, B, len(A))
    print("Large numbers")
    a = binary_to_decimal(A, len(A))
    b = binary_to_decimal(B, len(B))
    c = binary_to_decimal(C, len(C))

    print(a + b == c)
