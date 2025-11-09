import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;//index of element in cyclic sort = value-1
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
i++;}
        }


    }
}
