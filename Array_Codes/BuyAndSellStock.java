public class BuyAndSellStock {
    public static void buyAndSell(int prices[]){
        
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){ // Profit 
                int profit = prices[i] - buyPrice; // Today Profit 
                maxPrice = Math.max(maxPrice, profit);
            }else{
                buyPrice = prices[i];
            }
        }

        System.out.println(maxPrice);
    }
    public static void main(String args[]){
        int prices[] = new int[]{7,1,5,6,4};

        buyAndSell(prices);
    }
}
