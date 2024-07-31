public class maxvalueinarray {
    public static int array(int number[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 6, 3, 5 };
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Largest no of array is :" + array(number));
    }

}
