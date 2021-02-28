package 周赛.week21_2_28;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-28
 */
public class Solution5690 {
    int ans=Integer.MAX_VALUE;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        for(int i=0;i<baseCosts.length;i++){
            int sum=baseCosts[i];
            if(sum==target) return target;
            if(Math.abs(baseCosts[i]-target)<Math.abs(ans-target)){
                ans=baseCosts[i];
            }
            dfs(toppingCosts,sum,target,0);
            if(ans==target) return target;

        }
        return ans;
    }
    public void dfs(int[] toppingCosts,int sum, int target,int index) {
        if(Math.abs(sum-target)<Math.abs(ans-target)){
            ans=sum;
        }else if(Math.abs(sum-target)==Math.abs(ans-target)&&sum<ans){
            ans=sum;
        }else if(sum>target){
            return;
        }
        if(sum==target) return;
        if(index==toppingCosts.length){
            return;
        }
        dfs(toppingCosts,sum,target,index+1);
        dfs(toppingCosts,sum+toppingCosts[index],target,index+1);
        dfs(toppingCosts,sum+2*toppingCosts[index],target,index+1);
    }
}
