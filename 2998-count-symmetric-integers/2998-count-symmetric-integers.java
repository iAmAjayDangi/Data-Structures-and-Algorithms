class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int cnt = 0;

        for(int i=low;i<=high;i++){
            String str = String.valueOf(i);
            if(str.length() % 2 ==0){
                int sum = 0;
                int n = str.length();
                for(int j=0;j<n/2;j++){
                    sum += (str.charAt(j) - 48) - (str.charAt(n-j-1) - 48);
                }
                if(sum == 0){
                    cnt++;
                }
            }
        }

        return cnt;

    }
}