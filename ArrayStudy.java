public class ArrayStudy {
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void add_one(int x) {
        x = x + 1;
    }

    static void add_one(int temp_arr[]) {
        for (int i = 0; i < temp_arr.length; i++) {
            temp_arr[i]++;
        }
    }

    public static void main(String[] args) {
        // 1. Array Creation Expression
        int size = 5;
        int arr[] = new int[size];// array declaration syntax

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        print(arr);
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        print(arr);
        // 2. Array initializers list
        int arr2[] = { 1, 2, 3 };
        print(arr2);

        // If we want to increase size of the array
        int copyArray[] = new int[2 * size];// Create an array of double size
        for (int i = 0; i < size; i++) { // Copy all elements from oold to new array
            copyArray[i] = arr[i];
        }

        copyArray[5] = 6;
        copyArray[6] = 7;
        print(copyArray);

    }
}