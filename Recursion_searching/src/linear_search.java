import java.util.ArrayList;

public class linear_search {
   static ArrayList<Integer> list=new ArrayList<>();
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            System.out.println(list);
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
   public static ArrayList findAllIndex1(int[] arr, int target, int index) {
       ArrayList<Integer> list1=new ArrayList<>();

        if (index == arr.length) {
            return list1;
        }
        if (arr[index] == target) {
            list1.add(index);
        }
        findAllIndex1(arr,target,index+1);
       return list1;
   }
    public static void main(String[] args) {
        int[] arr = {6, 4, 8, 1, 2, 3, 5};
        System.out.println(find(arr,4,0));
        System.out.println(findIndex(arr,8,0));
        findAllIndex(arr,8,0);

        System.out.println(findAllIndex1(arr,8,0));
    }
}
