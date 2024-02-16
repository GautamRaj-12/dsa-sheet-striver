public class PrintTillN{
    public static void main(String[] args) {
        int n = 5;
        printTillN(1,n);
    }
    static void printTillN(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printTillN(i+1,n);
    }
}
// public class PrintTillN{
//     public static void main(String[] args) {
//         int n = 5;
//         printTillN(n);
//     }

//     static void printTillN(int n){
//         if(n > 0){
//             printTillN(n-1);
//             System.out.println(n);
//         }
//     }
// }