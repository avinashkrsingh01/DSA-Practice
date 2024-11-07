
public class HeightofStack {
    public static int heightOfStack(int x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n % 2 == 0) {
            return heightOfStack(x, n/2) * heightOfStack(x, n/2);
        }else{
            return heightOfStack(x, n/2) * heightOfStack(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 6;
        int ans = heightOfStack(x, n);
        System.out.println(ans);
    }
}
