public class StrictlyIncArr {
    public static boolean strictlyInc(int []arr, int index){
        if(index == arr.length-1){
            return true;
        }else{
            if(arr[index]<arr[index+1]){
                return strictlyInc(arr, index+1);
            }
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,65,78};
        System.out.println(strictlyInc(arr, 0));
    }
}
