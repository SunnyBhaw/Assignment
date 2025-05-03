def stack_dynamic(size):
    arr = [0] * size
    for i in range(size):
        arr[i] = i * 10
    print(f"\nStack-Dynamic Array (size {size}):")
    print(arr)
stack_dynamic(4)
stack_dynamic(6)