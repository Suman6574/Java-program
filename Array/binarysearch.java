import java.util.*;

public class binarysearch {
    public static int binary(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array element :");
        int key = sc.nextInt();
        int number[] = { 2, 4, 5, 7, 8, 6, 9 };
        System.out.println(binary(number, key));
        System.out.println(number.length);
    }

}
