public class leetcode_element_position_infinite_no {
    public static void main(String[] args){
        int[] arr={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170,200,210,320};
        int target=130;
        System.out.println(findPosition(arr,target));


    }
    public static int findPosition(int[] arr,int target){
        //Find the range
        //find start with a box of size (chunk)
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
             end=end+(end-start+1)*2;
             start=newStart;

        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr,int target,int start,int end){


        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return -1;

    }

}
