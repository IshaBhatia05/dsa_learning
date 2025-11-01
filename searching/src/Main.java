//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] arr={3,5,4,-2,1,48,98};
        int target=-2;
        int value=linerSearch(arr,target);
        System.out.print("Value present at what index: "+value);
    }
    static int linerSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }else{
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]==target){
                    return i;
                }
            }
        }

            return -1;
    }
}