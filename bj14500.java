import  java.util.*;

public class bj14500 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i =0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int temp = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){

                if (j+3<m) {
                    temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i][j+3];
                    if (temp > sum) sum = temp;
                }
                if (i+3<n) {
                    temp = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+3][j];
                    if (temp > sum) sum = temp;
                }
                if (i+1<n && j+1<m) {
                    temp = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1];
                    if (temp > sum) sum = temp;
                }
                if (i+2<n && j+1<m) {
                    temp = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j+1];
                    if (temp > sum) sum = temp;
                }
                if (i+1<n && j+2<m) {
                    temp = arr[i][j] + arr[i+1][j] + arr[i][j+1] + arr[i][j+2];
                    if (temp > sum) sum = temp;
                }
                if (i+2<n && j+1<m) {
                    temp = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1];
                    if (temp > sum) sum = temp;
                }
                if (i+1<n && j+2<m) {
                    temp = arr[i][j+2] + arr[i+1][j+2] + arr[i+1][j+1] + arr[i+1][j];
                    if (temp > sum) sum = temp;
            }
                if (i+2<n && j+1<m) {
                    temp = arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i+2][j];
                    if (temp > sum) sum = temp;
                }
                if (i+1<n && j+2<m) {
                    temp = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2];
                    if (temp > sum) sum = temp;
                }
                if (i+2<n && j+1<m) {
                    temp = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+2][j];
                    if (temp > sum) sum = temp;
                }
                if (i+1<n && j+2<m) {
                    temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+2];
                    if (temp > sum) sum = temp;
                }
                if (i+2<n && j+1<m) {
                    temp = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j+1];
                    if (temp > sum) sum = temp;
                }
                if (i+1<n && j+2<m) {
                    temp = arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+1][j];
                    if (temp > sum) sum = temp;
                }
                if (i+2<n && j+1<m) {
                    temp = arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j] + arr[i+2][j];
                    if (temp > sum) sum = temp;
                }
                if (i+1<n && j+2<m) {
                    temp = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j+2];
                    if (temp > sum) sum = temp;
                }
                if (i+1<n && j+2<m) {
                    temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1];
                    if (temp > sum) sum = temp;
                }
                if (i+2<n && j+1<m) {
                    temp = arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i+1][j];
                    if (temp > sum) sum = temp;
                }
                if (i+1<n && j+2<m) {
                    temp = arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2] + arr[i][j+1];
                    if (temp > sum) sum = temp;
                }
                if (i+2<n && j+1<m) {
                    temp = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+1][j+1];
                    if (temp > sum) sum = temp;
                }
            }
        }
        System.out.println(sum);

    }
}
