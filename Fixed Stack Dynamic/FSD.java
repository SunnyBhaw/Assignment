public class FSD {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10;
        }
        System.out.println("Fixed Stack-Dynamic Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
