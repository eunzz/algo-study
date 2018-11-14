import java.util.*;

public class bj10972 {
    public static boolean next_permutation(int[] arr){
        int len = arr.length-1;
        int i = len;
        while (i>0 && arr[i-1]>arr[i]) i--;
        if (i<=0)
            return false;

        int j = len;
        while (arr[i-1]>arr[j]) j--;

        change(arr, i-1, j);

        while (i<len){
            change(arr, i, len);
            i++;
            len--;
        }

        return true;

    }
    public static void change(int[] arr, int a, int b){
        try {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        } catch(ArrayIndexOutOfBoundsException e){}
    }

    public static void main(String[] args){
        Scanner scN = new Scanner(System.in);
        int n = scN.nextInt();

        //Scanner scA = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
           // arr[i] = Integer.parseInt(scA.next());
            arr[i] = Integer.parseInt(scN.next());
        }

        boolean res = next_permutation(arr);
        if (res){
            for (int i=0; i<n; i++)
                System.out.print(arr[i]+" ");
        }
        else System.out.println(-1);
    }

}
