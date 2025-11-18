public class sum_of_digits  {
    public static int sum_of_digit(int n){
                                                                                                                                                                                                                                                                   int sum=0;
        if(n==0){
            return 0 ;
        }

        return n%10+sum_of_digit(n/10);
    }
    public static void main(String[] args){
        int sum=sum_of_digit(154328);
        System.out.println(sum);

    }
}
