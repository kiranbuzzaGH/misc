def single_fizzbuzz(i):
    # Must fill map in descending value order
    map = {
        15: "Fizzbuzz",
        7: "Bazz",
        5: "Buzz",
        3: "Fizz"
    }
    for k, v in map.items():
        if i % k == 0:
            return v
    return i

def fizzbuzz(n):
    for i in range(n):
        i = i + 1
        print(single_fizzbuzz(i))

def main():
    fizzbuzz(100)

main()
