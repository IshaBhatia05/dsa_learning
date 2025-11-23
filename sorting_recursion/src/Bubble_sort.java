import java.util.Arrays;

public class Bubble_sort {
    public static void sort(int[] arr,int r, int c){
        if(r==0){
            return;
        }
        if(c<r){//until one pass of r is not completed
            if(arr[c]>arr[r]){//ascending://arr[c]<arr[r]=decending
              int temp= arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;}
            sort(arr,r,c+1);

        }else{
            sort(arr,r-1,0);
        }
    }
    public static void main(String[] args){
      int[] arr={6,4,8,1,2,3,5};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
