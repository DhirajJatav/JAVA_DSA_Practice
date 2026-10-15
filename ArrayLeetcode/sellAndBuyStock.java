public class sellAndBuyStock {
    public static void main(String[] args) {
        
    }
//  step 1 here i have to find that the smalles price to purchase the stock
// step 2 i have to check the greteast price or ele after the prchasing
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice =prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            int profit =prices[i] -minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return  maxProfit;
    }
}
