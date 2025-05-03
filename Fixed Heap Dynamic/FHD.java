public class FHD {
    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
        }
        System.out.println("\nFixed Heap-Dynamic Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
