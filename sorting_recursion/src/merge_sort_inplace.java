import java.util.Arrays;

public class merge_sort_inplace {

    static void mergeSortinplace(int[] arr,int s,int e){
        if(e-s==1){
            return ;
        }
        int mid=(s+e)/2;
        mergeSortinplace(arr,s,mid);
        mergeSortinplace(arr,mid,e);
        mergeinplace(arr,s,mid,e);

    }
    public static void mergeinplace(int[] arr,int s,int m, int e){
        int[] mix=new int[e-s] ;
        int i=s;int j=m;int k=0;
        while(i< m && j<e){
            if(arr[i]< arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
    public static void main(String[] args){
        int[] arr={6,4,8,1,2,3,5};
        mergeSortinplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
