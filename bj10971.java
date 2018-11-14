import java.util.*;

public class bj10971 {
    public static boolean next_permutation(int[] arr){
        int len = arr.length-1;
        int i=len, j=len;

        while(i>0 && arr[i-1]>=arr[i]) i--;
        if (i<=0) return false;

        while(arr[i-1]>=arr[j]) j--;

        int temp = arr[i-1];
        arr[i-1] = arr[j];
        arr[j] = temp;

        while(i<len){
            temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            i++;len--;
        }
        return true;
    }

    public static void main(String[] args){
        // 입력값 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] cost = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                cost[i][j] = Integer.parseInt(sc.next());
            }
        }

        // arr 초기화
        int[] arr = new int[n];
        for (int k=0; k<n; k++)
            arr[k]=k;

        int res=0, temp;
        do{
            temp = cost[arr[n-1]][arr[0]];  // 마지막 돌아오는 루트
            if (temp==0) continue;          // 돌아오는 루트가 존재하지 않을 경우
            for(int k=0; k<n-1; k++){
                int row = arr[k];
                int col = arr[k+1];
                if (cost[row][col]==0){     // 루트 존재하지 않을 경우
                    temp = -1;
                    break;
                }
                temp += cost[row][col];
            }

            if (temp == -1) continue;       // 루트 존재하지 않을 경우
            if (arr[0]==0) res=temp;        // res 초기값 설정
            else if(temp<res) res=temp;
        } while(next_permutation(arr));

        System.out.println(res);
    }
}
