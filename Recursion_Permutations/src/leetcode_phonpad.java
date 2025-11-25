import java.util.ArrayList;

public class leetcode_phonpad {
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
       int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            list.addAll(padRet(p+ch,up.substring(1)));
        }
        return list;
    }
    public static void main(String[] args){
        pad("","abc");
        System.out.println( padRet("","abc"));
    }
}
