public class Pascal_triangle {
    //Find the sum of nth row
    public static int pascal_triangles(int n){
        return 1 << (n-1);
    }
    public static void main(String[] args){
        System.out.println(pascal_triangles(4));
    }
}
