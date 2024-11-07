public class PrintEven {
    public static void printEven(int start, int n) {
        if(start > n){
            return;
        } 
        if(start%2==0){
            System.out.println(start);
            
        }
        printEven(start+1, n);
    }

    public static void main(String[] args) {
        int n =100;
        printEven(1, n);
    }
}