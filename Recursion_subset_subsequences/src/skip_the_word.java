public class skip_the_word {

    static String skip_word(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skip_word(up.substring(5));
        }else{
            return up.charAt(0)+skip_word(up.substring(1));
        }
    }
    static String skip_word_app(String up){
        if(up.isEmpty()){

            return "";
        }
        if(up.startsWith("app")&& !(up.startsWith("apple"))){
            return skip_word_app(up.substring(3));
        }else{
            return up.charAt(0)+skip_word_app(up.substring(1));
        }
    }
    public static void main(String[] args){
        System.out.println(skip_word("appbappleccadh"));
        System.out.println(skip_word_app("appbappleccadh"));

    }
}
