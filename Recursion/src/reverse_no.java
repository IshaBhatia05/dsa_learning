public class reverse_no {
   static int sum=0;
  public  static int rev1(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
         sum=sum*10+rem;
       rev1(n/10);
       return sum;
    }
    public static int rev2(int n){
        int digits=(int)(Math.log(n))+1;
        return helper(n,digits);}
    public static int helper(int n , int digits){
        if(n%10==n){
            return n;
        }
        int rem=n % 10;
        System.out.println(rem);
        System.out.println(rem * (int)(Math.pow(10,digits-1)));
        return rem * (int)(Math.pow(10,digits-1))+helper(n/10,digits);

    }

    public static void main(String[] args){
       rev1(123456);
        System.out.println(sum);
        int val=rev2(4321);
        System.out.println(val);
    }
}
