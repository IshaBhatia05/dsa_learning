public class leetcode_even_no_digits {
    //Given an array nums of integrer, return how many of them contains even no. of digits
//1295: Find numbers with Even number of Digits
public static void main(String[] args){
    int[] nums={12,34,9876,1,765};
    System.out.println(findNumbers(nums));


}
    static int findNumbers(int[] nums){
        int counter=0;
        for(int num:nums){
            int digitcount=even(countofdigits(num));
            if(digitcount==1){
                counter++;
            }

        }
    return counter;
    }
    static int even(int digitcount){
        if(digitcount%2==0){
            return 1;
        }else{
            return 0;
        }

    }



static int countofdigits(int num){
    int count=0;
   while(num>0) {
       count++;
       num = num / 10;
   }
   return count;

}
}
