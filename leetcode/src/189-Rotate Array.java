import java.util.Arrays;

class RotateArray {
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


    public static void rotate(int[] nums, int k) {
        var i = k-1;
        var n = nums.length;
        int[] v = new int[n];
        var last = nums[i];
        v[i] = 1;
        int tmp;

        while(true){
            var j = i+k;
            if(j >= n){
                j -= n;
            }
            i = j;              
            tmp = nums[j];
            nums[j] = last;
            last = tmp;
            v[i] = 1;
            if(i == k-1) break;
        }
    }

    public static void rotate1(int[] nums, int k) {
        var i = 0;
        var n = nums.length;
        boolean[] v = new boolean[n];
        var hold = nums[i];
    
        for(int t = 0; t < n; t++){
            i = (i+k) % n;
            if(v[i]){
                i = (i+1) % n;
                hold = nums[i];
                t--;
            }
            else {
                var tmp = nums[i];
                nums[i] = hold;
                hold = tmp;
                v[i] = true;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int ans = maxProfit(a);
        System.out.println(ans);



        int[] b = {-1,-100,3,99};
        rotate1(b,2);
        System.out.println(Arrays.toString(b));

    }
}


