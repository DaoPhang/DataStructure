package DS.Lab7;

/**
 * Stock Profit Calculator using FIFO (First In First Out) principle.
 * Uses MyQueue to track stock purchases and calculate profit when selling.
 */
public class Q5 {
    
    /**
     * Represents a stock purchase with number of shares and purchase price.
     */
    private static class StockPurchase {
        int shares;
        double price;
        
        StockPurchase(int shares, double price) {
            this.shares = shares;
            this.price = price;
        }
        
        @Override
        public String toString() {
            return shares + " shares @ $" + price;
        }
    }
    
    private MyQueue<StockPurchase> purchaseQueue;
    private double totalProfit;
    
    public Q5() {
        purchaseQueue = new MyQueue<>();
        totalProfit = 0.0;
    }
    
    /**
     * Buy shares at a given price.
     * @param shares Number of shares to buy
     * @param price Purchase price per share
     */
    public void buy(int shares, double price) {
        purchaseQueue.enqueue(new StockPurchase(shares, price));
        System.out.println("Bought " + shares + " shares at $" + price);
    }
    
    /**
     * Sell shares at a given price.
     * Uses FIFO - always sells the oldest shares first.
     * @param shares Number of shares to sell
     * @param price Sale price per share
     * @return The profit from this sale
     */
    public double sell(int shares, double price) {
        if (shares <= 0) {
            return 0.0;
        }
        
        double profit = 0.0;
        int remainingToSell = shares;
        
        System.out.println("Selling " + shares + " shares at $" + price);
        
        while (remainingToSell > 0 && !purchaseQueue.isEmpty()) {
            StockPurchase oldestPurchase = purchaseQueue.peek();
            
            if (oldestPurchase.shares <= remainingToSell) {
                // Sell all shares from this purchase
                StockPurchase sold = purchaseQueue.dequeue();
                int sharesSold = sold.shares;
                double profitFromThisPurchase = sharesSold * (price - sold.price);
                profit += profitFromThisPurchase;
                remainingToSell -= sharesSold;
                
                System.out.println("  Sold " + sharesSold + " shares (bought at $" +sold.price + "): Profit = $" + profitFromThisPurchase);
            } else {
                // Partially sell from this purchase
                int sharesToSell = remainingToSell;
                double profitFromThisPurchase = sharesToSell * (price - oldestPurchase.price);
                profit += profitFromThisPurchase;
                oldestPurchase.shares -= sharesToSell;
                remainingToSell = 0;
                
                System.out.println("  Sold " + sharesToSell + " shares (bought at $" +  oldestPurchase.price + "): Profit = $" + profitFromThisPurchase);
            }
        }
        
        if (remainingToSell > 0) {
            System.out.println("Warning: Not enough shares to sell " + remainingToSell +" more shares. Only sold " + (shares - remainingToSell) + " shares.");
        }
        
        totalProfit += profit;
        System.out.println("Profit from this sale: $" + profit);
        return profit;
    }
    
    /**
     * Get the total profit from all sales.
     * @return Total profit
     */
    public double getTotalProfit() {
        return totalProfit;
    }
    
    /**
     * Display remaining shares in the queue.
     */
    public void displayRemainingShares() {
        if (purchaseQueue.isEmpty()) {
            System.out.println("No remaining shares.");
            return;
        }
        
        System.out.println("Remaining shares in queue:");
        MyQueue<StockPurchase> tempQueue = new MyQueue<>();
        int position = 1;
        
        while (!purchaseQueue.isEmpty()) {
            StockPurchase purchase = purchaseQueue.dequeue();
            System.out.println("  " + position++ + ". " + purchase);
            tempQueue.enqueue(purchase);
        }
        
        // Restore the queue
        while (!tempQueue.isEmpty()) {
            purchaseQueue.enqueue(tempQueue.dequeue());
        }
    }
    
    public static void main(String[] args) {
        Q5 investor = new Q5();
        
        System.out.println("=== Stock Trading Simulation ===");
        System.out.println();
        
        // Day 1: Buy 100 shares at $20
        System.out.println("Day 1:");
        investor.buy(100, 20);
        System.out.println();
        
        // Day 2: Buy 20 shares at $24
        System.out.println("Day 2:");
        investor.buy(20, 24);
        System.out.println();
        
        // Day 3: Buy 200 shares at $36
        System.out.println("Day 3:");
        investor.buy(200, 36);
        System.out.println();
        
        // Day 4: Sell 150 shares at $30
        System.out.println("Day 4:");
        investor.sell(150, 30);
        System.out.println();
        
        // Display total profit
        System.out.println("=== Final Results ===");
        System.out.println("Total Profit: $" + investor.getTotalProfit());
        System.out.println();
        
        // Display remaining shares
        investor.displayRemainingShares();

        System.out.println();
        System.out.println("Expected calculation:");
        System.out.println("100 * (30-20) + 20 * (30-24) + 30 * (30-36) = 1000 + 120 - 180 = 940");
    }
}
