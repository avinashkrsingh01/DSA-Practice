public class ContainerWithMostWater {
    public static int maxWater(int [] height){

        int maxWater =0;
        int left =0;
        int right = height.length-1;
        for(int i=left; i<right; i++){
            maxWater = Math.max(maxWater, (right-left) * Math.min(height[left], height[right]));
            if(left<right){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxWater);
        return maxWater;
    }
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        maxWater(height);
    }
}
