public class factorial_no {
    public static int fact(int n){
        if(n<=0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        int f_val=fact(3);
        System.out.println(f_val);

    }
}
