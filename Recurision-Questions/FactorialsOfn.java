public class FactorialsOfn {
    public static int fact(int n){
        if(n==0 || n ==1){
            return 1;
        }
        int fact_nm1 = fact(n-1);
        int fact_n = fact_nm1 * n;
        return fact_n;
    }

    public static void main(String[] args) {
        int n =15;
        int ans = fact(n);
        System.out.println(ans);
    }
}