class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        
        vector<bool> ans;

        int mx=candies[0];

        for(int i=1;i<candies.size();i++){
            if(candies[i]>mx)
            mx=candies[i];
        }

        for(int candy: candies){
            if(candy+extraCandies >= mx){
                ans.push_back(true);
            }
            else{
                ans.push_back(false);
            }
        }

        return ans;

    }
};