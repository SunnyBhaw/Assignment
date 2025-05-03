# Array Memory Allocation Types in Java and Python

## Types Demonstrated:
1. Fixed Stack Dynamic
2. Stack Dynamic
3. Fixed Heap Dynamic
4. Heap Dynamic

---

## ✅ Comparison Table

| Category              | Java                                     | Python                                      |
|----------------------|------------------------------------------|---------------------------------------------|
| Fixed Stack Dynamic  | `int[] arr = new int[5];`                | `arr = [0] * 5`                              |
| Stack Dynamic        | `new int[n]` from user input             | `arr = [i for i in range(n)]`               |
| Fixed Heap Dynamic   | `Integer[] arr = new Integer[5];`        | `arr = np.zeros(5)` (using numpy)           |
| Heap Dynamic         | `ArrayList<Integer>`                     | `list.append()` on dynamic list             |

---

## 🧠 Key Takeaways:

- **Java** distinguishes between primitive stack memory (e.g., `int[]`) and heap memory (e.g., `Integer[]`, `ArrayList<>`).
- **Python** dynamically manages memory under the hood, and everything (even lists) resides on the heap.
- Java is more explicit about memory allocation types.
- Python is more flexible but abstracts memory handling.

---

## 📌 Notes

- Java arrays require size at creation time.
- Python lists grow dynamically without pre-declaration.
