public class leetcode_ceiling_floor_value {
    //Given a sorted array and a value x, find the element of the floor of x. The floor of x is the largest element in the array smaller than or equal to x.
    public static void main(String[] args){
       int[] arr= { 2, 8, 10, 10, 12, 19}; int target = 1;
System.out.println(findCeiling(arr,target));
        System.out.println(findFloor(arr,target));
    }
public static int findCeiling(int[] arr, int x){
        int start =0;int end=arr.length-1;

        if(x>arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
           int mid=start+(end-start)/2;
            if(x<arr[mid]){
                end=mid-1;
            }else if(x>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return start;


    }
    public static int findFloor(int[] arr, int x){
        int start =0;int end=arr.length-1;
          while(start<=end){
            int mid=start+(end-start)/2;
            if(x<arr[mid]){
                end=mid-1;
            }else if(x>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return end;


    }
}
