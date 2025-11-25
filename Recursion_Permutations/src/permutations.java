import java.util.ArrayList;

public class permutations {
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
    }
    static ArrayList<String> permutations1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new  ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new  ArrayList<String>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutations1(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    public static void main(String[] args){
        permutations("","abc");
       System.out.println( permutations1("","abc"));
    }

}
