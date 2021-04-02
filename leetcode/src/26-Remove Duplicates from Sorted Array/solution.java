public class solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int p = 1;
        for(int i = 0; i < n-1; i++) {
            if(nums[i+1] != nums[i]) {
                nums[p] = nums[i+1];
                p++;
            }
        }
        return p;
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;

        int p = 0,
            q = 0;
        int sum = 0;
        boolean up = false;
        for(int i = 0; i < n-1; i++) {
            if(prices[i+1] > prices[i]){
                up = true;
                q = i+1;
            }
            else if(prices[i+1] == prices[i]){
                if(up){
                    q = i+1;
                }
                else{
                    p = i+1;
                }
            }
            else{
                if(up){
                    up = false;
                    sum += prices[q] - prices[p];
                    p = i+1;
                }
                else{
                    p = i+1;
                }
            }
        }
        if(up){
            sum += prices[q] - prices[p];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int ans = maxProfit(a);
        System.out.println(ans);;
    }
}


