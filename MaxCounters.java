//https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
public class MaxCounters {
    public static int[] solution(int N, int[] A){
        int[] ans = new int[N];
        int max = 0;
        int prev = 0;

        for(int i = 0; i<A.length;i++){
            if(A[i] == (N+1)){
                prev = max;
            }
            else if(A[i] >= 1 && A[i] <= N){
                ans[A[i]-1] = Math.max(ans[A[i]-1], prev);
                ans[A[i]-1]++;
                max = Math.max(max,ans[A[i]-1]);
            }
        }

        for(int j = 0;j<ans.length;j++){
            ans[j] = Math.max(ans[j],prev);
        }

        return ans;
    }
}
