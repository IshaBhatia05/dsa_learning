public class bitwise_operator {
    public static boolean isOdd(int n){
        return ((n&1)==1);// AND with 1 will give same no.
    }

    //find the no. appeared twice but only one no. appeared once
    public static int isRepeat(int[] arr){
        //XOR will make all the duplicates =0.Only unique elements remaining
        int unique=0;
       for(int n:arr){
            unique^=n;
        }
        return unique;
    }
    //Find ith bit
    public static int ibit(int n,int i){
        int mask=1<<i;
        return (n & mask)!=0?1:0;
    }
    //Find set the ith bit
    public static int setibit(int n,int i){
        int mask=1<<i;
        return (n|mask);
    }
    //Find set the ith bit
    public static int resetibit(int n,int i){
        int mask=1<<i;
        return ~(n|mask);
    }
    //find position of right most set bit
    public static int rightSetBit(int n){
        return (n&(-n));
    }
//Every no. appearing  odd times and only one no. appearing once. give t.Give that no.
public static int uniqueNoThrice(int[] arr){
    //XOR will make all the duplicates =0.Only unique elements remaining
    int unique=0;
    for(int i=0;i<32;i++) {//Iterate over all 32 bits
        int sum=0;
        for (int n : arr) {
            if((n&(1<<i))!=0){
                sum++;
            }
        }
        unique ^= (sum%3)<<i;
    }
    return unique;
}
//Find nth Magic Number
    public static int magic_no(int n){
        int ans=0;int base=5;
        while(n>0){
            int last=n&1;
            n=n >> 1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
    //Find the no. of digits with base10
    public static int noDigitsBase10(int n) {
        int b =2;
        int ans =(int)(Math.log(n)/Math.log(b))+1;
         return ans;
    }

// Give no. n, find the no. of set bits in it
public static int setbits(int n){
        int count =0;
        while(n>0) {
            count++;
            n=(n & (n-1));
        }
        return count;

}
//XOR of no.s from 0 to a
    public static int xor(int a){
        if(a%4==0){ return a;}
        if(a%4==1){return 1;}
        if(a%4==2){return a+1;}
        return 0;

    }
    public static void main(String[] args) {
        int[] arr={2,3,3,4,2,6,4};
        int[] arr1={2,2,4,3,3,4,2,3,6,4};
//        System.out.println("isOdd:"+isOdd(67));
//        System.out.println("Repeated no:"+isRepeat(arr));
//        System.out.println("Find ith bit: "+ib it(7,4));
        System.out.println("Set bit:"+setibit(7,2));
        System.out.println("ReSet bit:"+resetibit(3,1));
        System.out.println("ith bit:"+ibit(7,1));
//        System.out.println("Right Set bit:"+rightSetBit(18));
//        System.out.println("Unique No Thrice:"+uniqueNoThrice(arr1));
//        System.out.println("Magic No: "+magic_no(8));
//        System.out.println("No. of digits with Base No. 10 : "+noDigitsBase10(24));
//        //Give no. n, find the no. of set bits in it
//        System.out.println(" Integer to Binary string: "+Integer.toBinaryString(45));
//        //return Binary conversation of no.
//        System.out.println("Set bit count:"+setbits(45));
//        //range  XOR for a,b : a=3,b=9
//        //xor a
//        System.out.println("Value of a:"+xor(9));
//        //xor b
//        System.out.println("Value of b:"+xor(2));
//        int ans= xor(9)^xor(2);
//        System.out.println("Range of no. of XOR:"+ans);
    }

}
