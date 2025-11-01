public class leetcode_even_no_digits {
    //Given an array nums of integrer, return how many of them contains even no. of digits

public static void main(String[] args){
    int[] arr={12,344,9876,1,765};
    findNumElements(arr);


}
    static void findNumElements(int[] arr){

        for(int num:arr){
            int digitcount=even(countofdigits(num));
            if(digitcount==1){
                System.out.println("Even no.");
            }
            else{
                System.out.println("Odd no.");
            }
        }

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
