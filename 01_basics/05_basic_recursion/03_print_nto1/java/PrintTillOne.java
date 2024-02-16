// public class PrintTillOne{
//     public static void main(String[] args) {
//         int n = 5;
//         printTillOne(1,n);
//     }
//     static void printTillOne(int i,int n){
//         if(i<1){
//             return;
//         }
//         System.out.println(i);
//         printTillOne(i-1,n);
//     }
// }
public class PrintTillOne{
    public static void main(String[] args) {
        int n = 5;
        printTillOne(n);
    }
    static void printTillOne(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printTillOne(n-1);
    }
}