public class product_of_digits {
    public static int prod_of_digit(int n){
        if(n%10==n){//last digit 
            return n ;
        }

        return n%10*prod_of_digit(n/10);
    }
    public static void main(String[] args){
        int prod=prod_of_digit(154);
        System.out.println(prod);

    }
}
