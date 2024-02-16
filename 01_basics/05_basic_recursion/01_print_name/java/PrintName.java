// public class PrintName {
//     public static void main(String[] args) {
//         int n = 4;
//         printNtimes(1, n);
//     }

//     static void printNtimes(int i, int n) {
//         if (i > n) {
//             return;
//         }
//         printNtimes(i + 1, n);
//         System.out.print("Gautam ");
//     }
// }
public class PrintName{
    public static void main(String[] args) {
        int n = 4;
        printNtimes(n);
    }
    static void printNtimes(int n){
        if(n==0){
            return;
        }        
        printNtimes(n-1);
        System.out.print("Gautam ");
    }
}