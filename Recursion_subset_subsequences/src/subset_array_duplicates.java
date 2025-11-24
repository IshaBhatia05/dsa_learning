import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_array_duplicates {
    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0; int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal =new ArrayList<>(outer.get(j));//the copy shd be of j in order to avoid duplic
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args){
        int [] arr={1,2,2,4};
        List<List<Integer>> ans=subsetDuplicate(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
}
