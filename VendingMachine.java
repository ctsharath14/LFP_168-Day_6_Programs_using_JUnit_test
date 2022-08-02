import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for which you want to get the change");
        int n = sc.nextInt();
        int a[] = {1, 2, 5, 10, 50, 100, 500, 1000};

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int ans = minCoins(n, a, dp);
        System.out.println("The minimum number of coins required will be : "+ans);

        /*for(int x: dp) {
            System.out.print(x+" ");
        }*/
    }

    static int minCoins(int n, int a[], int dp[]) {

        if(n == 0) return 0;

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i<a.length; i++) {
            if(n-a[i] >= 0) {
                int subAns = 0;
                if(dp[n-a[i]] != -1) {
                    subAns = dp[n-a[i]];
                } else {
                    subAns = minCoins(n-a[i], a, dp);
                }
                if(subAns != Integer.MAX_VALUE &&
                        subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return dp[n] = ans;
    }
}
