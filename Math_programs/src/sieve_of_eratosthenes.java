import java.util.Arrays;

public class sieve_of_eratosthenes {
    //find all no.s less than N which are prime
    static void sieve(int n,boolean[] primes){
        for(int i=2 ; i*i<=n;i++){
            if(!primes[i]){//if element is prime
                for(int j=i*2;j<=n;j+=i){//All the multiples of prime X 2 as all the multiples of prime no. is not prime
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.println("prime: "+i);
            }
        }
    }
    public static void main(String[] args){
        int n=40;
        boolean[] prime=new boolean[n+1];

        //false in array means no no. is prime in array.2 is prime.So, all the multiples of 2 are not prime
        sieve(n,prime);
    }



}
