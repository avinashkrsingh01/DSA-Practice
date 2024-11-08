public class FindMaxAverage {
    public static double findMaxAvg(int[] nums, int k){
        int sum =0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i=k; i<nums.length; i++){
            sum += (nums[i]-nums[i-k]);
            maxSum = Math.max(maxSum, sum);
        }
        double ans = maxSum*1.0 /k;
        System.out.println(ans);
        
        return ans ;
    }
    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3,0,-45,23};
        int k =4;
        findMaxAvg(nums, k);
    }
    
}
