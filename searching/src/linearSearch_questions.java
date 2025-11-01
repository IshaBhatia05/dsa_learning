public class linearSearch_questions {
    public static void main(String[] args){
        int [] arr={5,7,-12,1,4,3,6};
        int target=6;
        //return true/false if element exist
        boolean val=linerSearch1(arr,target);
        System.out.println("Found element : "+val);
        //Working with Strings
        String str="IshaBhatia";
        char ch='a';
        System.out.println(searchString(str,ch));
        //Search in range:start and end
        System.out.println("Value in Range is available or not: "+rangeSearch(arr,target,1,5));
        //Find minimum no. in array
        int val1=minValue(arr);
        System.out.println("min No. in an array: "+val1);

    }
    static int minValue(int[] arr){
        int min_value=arr[0];
        if(arr.length==0){
            return -1;
        }
        for (int j : arr) {
            if (j < min_value) {
                min_value = j;

            }
        }
        return min_value;

    }
    static int rangeSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;

        }
        for(int i=start;i<end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static boolean linerSearch1(int[] arr,int target){
        for(int arrVal:arr){
            if(arrVal==target){
                return true;
            }
        }
        return false;

    }

    static boolean searchString(String str,Character ch){
        if (str.length()==0){
            return false;
        }
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)==ch){
                return true;
            }

        }
        return false;
    }
}
