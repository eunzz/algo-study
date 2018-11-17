import java.util.*;

public class bj14888 {
    public static boolean next_permutation(int[] arr){
        int len = arr.length-1;
        int i = len;
        while (i>0 && arr[i-1]>=arr[i]) i--;
        if (i<=0)
            return false;

        int j = len;
        while (arr[i-1]>=arr[j]) j--;

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

    public static int calculate(int[] arrN, int[] arrO){
        int temp=arrN[0];
        int i;

        for(i=0; i<arrO.length; i++){
            switch(arrO[i]) {
                case 0:
                    temp += arrN[i+1];
                    break;
                case 1:
                    temp -= arrN[i+1];
                    break;
                case 2:
                    temp *= arrN[i+1];
                    break;
                case 3:
                    temp /= arrN[i+1];
                    break;
            }
        }
        return temp;
    }

    public static int isHigh(int temp, int resHigh){
        if (temp >resHigh) resHigh = temp;
        return resHigh;
    }
    public static int isLow(int temp, int resLow){
        if (temp <resLow) resLow = temp;
        return resLow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrN = new int[n];
        int[] arrO = new int[n - 1];
        int i, j;
        int temp, resHigh, resLow;

        for (i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }

        int idx=0;
        for (i = 0; i < 4; i++) {
            int op = sc.nextInt();
            for (j=0; j<op; j++)
                arrO[idx++] = i;
        }

        temp = calculate(arrN, arrO);
        resHigh = temp;
        resLow = temp;

        while(next_permutation(arrO)){
            temp = calculate(arrN, arrO);
            resHigh = isHigh(temp, resHigh);
            resLow = isLow(temp, resLow);
        }

        temp = calculate(arrN, arrO);
        resHigh = isHigh(temp, resHigh);
        resLow = isLow(temp, resLow);


        System.out.println(resHigh);
        System.out.println(resLow);
    }
}


