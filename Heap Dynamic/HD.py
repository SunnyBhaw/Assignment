def heap_dynamic():
    arr = []
    arr.append(10)
    arr.append(20)
    arr.append(30)
    arr.insert(1, 15)
    print("\nHeap-Dynamic Array (Python list):")
    print(arr)
    arr.pop(2)
    print("After removal:")
    print(arr)
heap_dynamic()