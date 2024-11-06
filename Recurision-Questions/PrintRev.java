public class PrintRev {
    public static void printRevString(String str, int index) {
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRevString(str, index-1);
    }
    public static void main(String[] args) {
        String str = "AVINASH";
        printRevString(str, str.length()-1);
    }
}