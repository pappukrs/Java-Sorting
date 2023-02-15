import java.util.Scanner;

class Bubble {

    public static void printArr(int arr[], int size) {

        for (int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int k = 0; k < size; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        printArr(arr, size);
    }
}