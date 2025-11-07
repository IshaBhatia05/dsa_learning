import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxInt=getMaxIndex(arr,i,last);
            swap(arr,maxInt,last);


        }

    }

    public static int getMaxIndex(int[] arr, int start,int end){
        int max=start;

        for(int i=start;i<end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
    }
        return max;
    }
    public static void swap(int[] arr,int first,int second){
        if(arr[first]<arr[second]){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;

    }


    }
}
