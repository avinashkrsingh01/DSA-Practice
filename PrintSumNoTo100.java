public class PrintSumNoTo100 {
    public static void printSumOfNo1to100(int i,int n, int sum) {
        if(i > n){
            System.out.println(sum);
            return;
        }
        sum +=i;
        printSumOfNo1to100(i+1, n, sum);
    }
    public static void main(String[] args) {
        int n =100;
        int sum =0;
        int i=1;
        printSumOfNo1to100(i,n,sum);
    }
}
