import java.util.Arrays;

public class linerSearch_2D_array {
    public static void main(String[] args){
    int[] [] arr={
            {2,5,4,3},
            {7,198,0,8},
            {1,11,55,28}
            };
    int target=198;
    //Find values in 2D array
        int [] ans=search2Darray(arr,target);
        System.out.println("Index value found for "+target+" value in 2D: "+ Arrays.toString(ans));
    //Find maximum no in 2D array
        System.out.println("Max Value found in 2D array: "+maxval2Darray(arr));

    }
static int[] search2Darray(int[][] arr,int target) {

    for (int rows = 0; rows < arr.length - 1; rows++) {
        for (int cols = 0; cols <arr[rows].length - 1; cols++) {
            if (arr[rows][cols] == target) {
                return new int[]{rows, cols};
            }
        }
    }
    return new int[]{-1, -1};

}
    static int maxval2Darray(int[][] arr){
        int max_value=Integer.MIN_VALUE;
        for(int[] rows:arr){
        for(int cols: rows){
            if(cols>max_value){
                max_value=cols;
            }
            }
        }
        return max_value;
    }

}
