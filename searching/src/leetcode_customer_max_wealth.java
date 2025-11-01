public class leetcode_customer_max_wealth {
    public static void main(String[] args){
       int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;//this concept
        for(int row=0;row<accounts.length;row++){
            int sum=0;//this concept
            for(int col=0;col<accounts[row].length;col++){
                sum=accounts[row][col]+sum;

            }
            if(sum>ans){//compare
                ans= sum;
            }
        }

        return ans;
    }

}
