public class pallindrome {
    public static boolean pallindrome(int n){
        return (n==reverse_no.rev1(n));
    }
    public static void main(String[] args){
        System.out.println(pallindrome(12321));
    }
}
