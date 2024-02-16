//Functional way
public class SumOfN{
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOfN(n));
    }
    static int sumOfN(int n){
        if(n<1){
            return 0;
        }
        return n+sumOfN(n-1);
    }
}
// Parameterized way
// public class SumOfN{
//     public static void main(String[] args) {
//         int n = 10;
//         int sum = 0;
//         sumOfN(n,sum);
//     }
//     static void sumOfN(int n, int sum){
//         if(n<1){
//             System.out.println(sum);
//             return;
//         }
//         sumOfN(n-1,sum+n);
//     }
// }

