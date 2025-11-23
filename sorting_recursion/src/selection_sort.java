import java.util.Arrays;

public class selection_sort {
    public static void sel_sort(int[] arr,int r, int c,int max){
        if(r==0){
            return;
        }
        if(c<r){//until one pass of r is not completed
            if(arr[c]>arr[max]){//ascending://arr[c]<arr[max]=decending:max=0th index

                sel_sort(arr,r,c+1,c);

        }else{
                sel_sort(arr,r,c+1,max);//max will not change
            }
        }else{
                int temp= arr[max];
                arr[max]=arr[r-1];
                arr[r-1]=temp;
            sel_sort(arr,r-1,0,0);

            }
    }
    public static void main(String[] args){
        int[] arr={3,4,1,2,};
        //int[] arr={6,4,8,1,2,3,5};
        sel_sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
}


