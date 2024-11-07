public class Print1to100 {
    public static void printTo100(int n, int start){
        if(start>n){
            return;
        }
        System.out.println(start);
        printTo100(n, start+1);
    }

    public static void main(String[] args) {
        int n =100;
        printTo100(n, 0);
    }
}