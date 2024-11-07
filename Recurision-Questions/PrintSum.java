
public class PrintSum {
    public static void printSum1to100(int i, int n, int sum){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum1to100(i+1, n, sum);
    }
    public static void main(String[] args) {
        printSum1to100(1,100,0);
    }
}
