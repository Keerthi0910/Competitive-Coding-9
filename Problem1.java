o(d) d is the last number in days time complexity and space compleity


class Solution {
    public int mincostTickets(int[] days, int[] costs) {

        int n = days.length;

        int m = days[n-1];
        int[] dp = new int[m+1];

        dp[0] = 0;

        int min = Integer.MAX_VALUE;
       int j = 0;


        
    
        for(int i = 1 ; i <= m; i++){
            
           if(i != days[j]  ){        
             dp[i] = dp[i-1];
           
           } else{

           
           // 1day 

            int oneDay = dp[i-1] + costs[0];

           // 7 day

           int sevenDay = dp[Math.max(0, i-7)] + costs[1];

           // 30 day

           int thirtyDay = dp[Math.max(0, i -30)] + costs[2];

           dp[i]= Math.min(oneDay, Math.min(sevenDay, thirtyDay));
           j++;

            }
    }
        return dp[m];
                 

     
        
    }
}
