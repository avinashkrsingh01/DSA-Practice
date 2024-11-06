public class TowerOfHunoi {
    public static void towerOfHunoi(int n, String start, String helper, String dest) {
        if(n==1){
            System.out.println("Move " +n+" from " + start + " to "+dest);
            return;
        }
        towerOfHunoi(n-1, start, dest, helper);
        System.out.println("Move " +n+" from " + start + " to "+dest);
        towerOfHunoi(n-1, helper, start, dest);
    }
    public static void main(String[] args) {
        int n =3;
        towerOfHunoi(n,"S","H","D");
    }
}
