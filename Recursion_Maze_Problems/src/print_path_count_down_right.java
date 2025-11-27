import java.util.ArrayList;

public class print_path_count_down_right {
    public static void print_path(String p, int r, int c){
        if(r==1&&c==1){
            System.out.println(p);

            return ;
        }

        if(r>1){
            print_path(p+'D',r-1,c);
        }
        if(c>1){
           print_path(p+'R',r,c-1);
        }

    }


    public static ArrayList<String> print_pathRet(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
if(r>1){
    list.addAll(print_pathRet(p+'D',r-1,c));
}
        if(c>1){
            list.addAll(print_pathRet(p+'R',r,c-1));
        }
         return list;
    }
    public static void main(String[] args){
       print_path("",3,3);
        System.out.println(print_pathRet("",3,3));
    }
}
