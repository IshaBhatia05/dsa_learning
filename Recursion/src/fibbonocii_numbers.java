public class fibbonocii_numbers {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        int fib_val=fib(8);
        System.out.println(fib_val);

    }
}
