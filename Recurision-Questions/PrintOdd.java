public class PrintOdd {
    public static void printOdd(int start, int n){
        if(start>n){
            return;
        }
        if(start%2==1){
            System.out.println(start);
        }
        printOdd(start+1, n);
    }

    public static void main(String[] args) {
        int n =100;
        printOdd(0, n);
    }
}
