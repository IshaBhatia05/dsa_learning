public class leetcode_reduce_no_steps {
    public static int numbeOfSteps(int num){
        return helper(num,0);
    }
    public static int helper(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
    public static void main(String[] args){
        System.out.println(numbeOfSteps(41));
    }
}
