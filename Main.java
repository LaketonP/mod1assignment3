import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner input = new Scanner(System.in);
        // matrix
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        // ask user to enter 1st matrix
        System.out.println("Enter m1 (a 3 by 3 matrix) row by row:");
        for (int i = 0; i < m1.length; i++) { // loops through each row
            for (int l = 0; l < m1[i].length; l++) { // loops through each column
                m1[i][l] = input.nextInt();
            }
        }
        // ask user for 2nd matrix
        System.out.println("Enter m2 (a 3 by 3 matrix) row by row:");
        for (int i = 0; i < m2.length; i++) {
            for (int l = 0; l < m2[i].length; l++) {
                m2[i][l] = input.nextInt();
            }
        }
        // compare both
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }
    // compares both matrices
    public static boolean equals(int[][] m1, int[][] m2) { // if length of matrices are not equal return false
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }
        // checks for each element in both matrices
        for (int i = 0; i < m1.length; i++) {
            for (int l = 0; l < m1[i].length; l++) {
                if (m1[i][l] != m2[i][l]) {
                    return false;
                }
            }
        }
        // all elements are equal, return true
        return true;
    }
}
