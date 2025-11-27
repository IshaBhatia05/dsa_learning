import java.util.ArrayList;

public class print_path_count_down_right_daigonal {
    public static void print_pathDaignol(String p, int r, int c){
        if(r==1&&c==1){
            System.out.println(p);

            return ;
        }
        if(r>1&&c>1){
            print_pathDaignol(p+'D',r-1,c-1);
        }
        if(r>1){
            print_pathDaignol(p+'V',r-1,c);
        }
        if(c>1){
            print_pathDaignol(p+'H',r,c-1);
        }

    }


    public static ArrayList<String> print_pathDaignolRet(String p, int r, int c){
        if(r==1&&c==1){//Path reached
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1&&c>1){
            list.addAll( print_pathDaignolRet(p+'D',r-1,c-1));
        }
if(r>1){
    list.addAll(print_pathDaignolRet(p+'V',r-1,c));
}
        if(c>1){
            list.addAll(print_pathDaignolRet(p+'H',r,c-1));
        }
         return list;
    }
    public static void main(String[] args){
        print_pathDaignol("",3,3);
        System.out.println(print_pathDaignolRet("",3,3));
    }
}
