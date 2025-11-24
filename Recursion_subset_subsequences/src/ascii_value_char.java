import java.util.ArrayList;

public class ascii_value_char {
    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);

        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> subseqAscii1(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;

        }
        char ch=up.charAt(0);

       ArrayList<String> first= subseqAscii1(p+ch,up.substring(1));
        ArrayList<String> second=subseqAscii1(p,up.substring(1));
        ArrayList<String> third=subseqAscii1(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
    public static void main(String[] args){
        subseqAscii("","abc");
        System.out.println(subseqAscii1("","abc"));
    }


}
