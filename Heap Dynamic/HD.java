import java.util.ArrayList;

public class HD {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1, 15);
        System.out.println("\nHeap-Dynamic Array (ArrayList):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        arr.remove(2);
        System.out.println("\nAfter removal:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
