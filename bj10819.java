import java.util.*;

public class bj10819 {
    public static boolean next_permutation(int[] arr){
        int len = arr.length-1;
        int i = len;
        while(i>0 && arr[i-1]>=arr[i]) i--;     //순열이 아니므로 *같음* 포함
        if (i<=0) return false;

        int j = len;
        while(arr[i-1]>=arr[j]) j--;            //순열이 아니므로 *같음* 포함

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
    public static boolean prev_permutation(int[] arr){
        int len = arr.length-1;
        int i = len;
        while(i>0 && arr[i-1]<=arr[i]) i--;     //순열이 아니므로 *같음* 포함
        if (i<=0) return false;

        int j = len;
        while(arr[i-1]<=arr[j]) j--;            //순열이 아니므로 *같음* 포함

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

    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        int n = scN.nextInt();

        //Scanner scA = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            //arr[i] = Integer.parseInt(scA.next());
            arr[i] = Integer.parseInt(scN.next());
        }

        while(prev_permutation(arr));


        int res=0;
        int temp, elem;
        do{
            temp=0;
            for(int i=1; i<n; i++){
                elem = arr[i-1]-arr[i];
                if (elem<0)
                    elem  = -elem;
                temp += elem;
            }
            if (temp>res) res = temp;

        }while(next_permutation(arr));

        System.out.println(res);
    }
}
