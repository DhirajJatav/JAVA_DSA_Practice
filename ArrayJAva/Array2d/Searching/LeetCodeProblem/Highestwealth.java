package Array2d.Searching.LeetCodeProblem;
// problem num=1672

public class Highestwealth {
    
public static void main(String[] args) {
    int[][] accounts={{1,5},{7,3},{3,5}};
    // to find wealthies person
    int result=maximumWealth(accounts);
    System.out.println(result);

}
    public static int maximumWealth(int [][] accounts){
        int max=0;
        for (int i = 0; i < accounts.length; i++) {
            int rowsome=0;
            
            for (int j = 0; j < accounts[i].length; j++) {
                rowsome+=accounts[i][j];
            }
            if(rowsome>max)
                max=rowsome;
        }
        return max;
    }
}
