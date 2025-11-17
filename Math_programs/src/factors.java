import java.util.ArrayList;

public class factors {
    //brute force
    public static void factors1(int n){
        System.out.println("1st method:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }
    }
    //Check till sqrt of no.
    static void factors2(int n){
        System.out.println("2nd method:");
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i==0){//this condition is when no. * no.= sqrt of n
                if(n/i==i){
                    System.out.println(i);
                }
                else{
                    System.out.println(i+" "+n/i+" ");
                }
        }

    }
}
public static void factors3(int n){
    System.out.println("3rd method:");
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=1;i<Math.sqrt(n);i++) {
        if (n % i == 0) {
            if (n / i == i) {
                System.out.println(i + " ");
            } else {
                System.out.println(i + " ");
                list.add(n / i);
            }
        }
    }
        for(int j=list.size()-1;j>=0;j--){
            System.out.println(list.get(j)+" ");
        }


    }
    public static void main(String[] args){
        factors1(4);
        factors2(5);
        factors3( 8);
    }
}
