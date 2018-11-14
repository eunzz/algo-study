import java.util.*;

public class bj9095 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum;

        for (int i=0; i<n; i++){
            int res = 0;
            sum = sc.nextInt();

            // a+b+c+d == sum && 0*a + 1*b + 2*c + 3*d == sum 임을 이용
            for (int a=0; a<=sum; a++){
                for (int b=0; b<=sum; b++){
                    for (int c=0; c<=sum; c++){
                        for (int d=0; d<=sum; d++){
                            if (a+b+c+d==sum && b+2*c+3*d==sum) {
                                res += facto(b+c+d)/(facto(b)*facto(c)*facto(d));
                            }
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }

    public static int facto(int n) {
        if (n==0) return 1;
        else if (n==1) return 1;
        else return n *facto(n-1);
    }
}
