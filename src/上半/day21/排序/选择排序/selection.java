package �ϰ�.day21.����.ѡ������;

public class selection {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
