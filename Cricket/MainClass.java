package Cricket;
import java.util.Arrays;
import java.util.Scanner;
public class MainClass {
    public static void main(String [] args){
        int[][] match = {
        {1, 0, 4, 0, -1, 2},    // Over 1
        {0, 1, 1, 4, 0, 6},     // Over 2
        {1, 2, -1, 0, 1, 4},    // Over 3
        {0, 0, 0, 1, 2, 4},     // Over 4
        {6, 1, 1, 0, -1, 1},    // Over 5
        {4, 0, 2, 1, 1, 6},     // Over 6
        {1, 0, -1, 4, 1, 0},    // Over 7
        {0, 6, 0, 1, 1, 2},     // Over 8
        {1, 4, 0, 0, -1, 1},    // Over 9
        {6, 0, 2, 1, 0, 4},     // Over 10
        {0, 1, 1, 0, 2, 6},     // Over 11
        {4, 1, 0, -1, 1, 1},    // Over 12
        {0, 0, 4, 1, 6, 2},     // Over 13
        {1, 1, 1, 0, 4, -1},    // Over 14
        {0, 6, 0, 2, 1, 4},     // Over 15
        {1, 0, 0, 1, -1, 2},    // Over 16
        {0, 4, 1, 6, 0, 1},     // Over 17
        {1, 1, 4, 0, 0, 6},     // Over 18
        {0, 2, -1, 4, 1, 0},    // Over 19
        {6, 0, 1, 1, 4, 2}      // Over 20
    };
    Scanner sc = new Scanner(System.in);
    System.out.println(Arrays.deepToString(match));
    sc.close();
    }
}
