public class SD {
    public static void main(String[] args) {
        processArray(5);
        processArray(10);
    }
    public static void processArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10;
        }
        System.out.println("\nStack-Dynamic Array (size " + size + "):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
