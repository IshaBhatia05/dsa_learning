public class lcm {
    public static int lcm(int a,int b){
        return (a*b)/gcd_hcf.gcd(a,b);
    }
    public static void main(String[] args){
        System.out.println( "LCM: "+lcm(4,55));
    }
}
