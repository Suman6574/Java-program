import java.util.*;

public class input {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Phy =" + marks[0]);
        System.out.println("Chem =" + marks[1]);
        System.out.println("Math =" + marks[2]);
        int avg = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println(avg);
        System.out.println("Length of array :" + marks.length);
    }

}
