def fixed_heap_dynamic():
    import array
    arr = array.array('i', [0, 0, 0, 0, 0])
    for i in range(len(arr)):
        arr[i] = i * 5
    print("\nFixed Heap-Dynamic Array (array module):")
    print(arr.tolist())
fixed_heap_dynamic()