public class basePowerExp {
    //given no. with power of 2
    public static boolean powerOftwo(int n){
        if((n & (n - 1))==0){
            return true;
        }
        return false;
    }
    //calculate a power of b
    public static int apowerofb(int base,int power){
        int ans=1;
        while(power>0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        return ans;
    }
   public static void main(String[] args){
       System.out.println("No. has power of 2:"+powerOftwo(2));
       System.out.println("Calculate a power of b:"+apowerofb(3,6));

   }
}



