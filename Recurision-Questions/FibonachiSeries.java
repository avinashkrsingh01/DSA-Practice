public class FibonachiSeries {
    public static void fiboOfn(int a, int b, int n) {
        if(n==0){
            return;
        }
        int c =a +b;
        System.out.print(c +" ");
        fiboOfn(b, c, n-1);
    }
    public static void main(String[] args) {
        int a =0;
        int b =1;
        System.out.print(a + " ");
        System.out.print(b +" ");
        int n = 8;
        fiboOfn(a, b, n-2);
    }
}
