import java.util.*;

public class bj10974 {
    public static boolean next_permutation(int[] arr){
        int len = arr.length-1;
        int i = len;
        while(i>0 && arr[i-1]>arr[i]) i--;
        if (i<=0) return false;

        int j = len;
        while(arr[i-1]>arr[j]) j--;

        int temp = arr[i-1];
        arr[i-1] = arr[j];
        arr[j] = temp;

        while (i<len){
            temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            i++;
            len--;
        }

        return true;
    }

    public static void main(String[] args){
        Scanner scN = new Scanner(System.in);
        int n = scN.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=i+1;
        }
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        while(next_permutation(arr)){
            for (int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
