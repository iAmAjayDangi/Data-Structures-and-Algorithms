class Solution {
    
    int findMinimumOperations(StringBuilder str, char number){
        
        int n=str.length();
        int i=0;
        
        int ans1=Integer.MAX_VALUE, ans2= Integer.MAX_VALUE;
        
        for(i=n-1;i>=0;i--){
            if(str.charAt(i) == number){
                break;
            }
            str.setCharAt(i, ' ');
        }
        
        boolean temp = false;
        boolean flag=false;
        
        if(i>=0 && number == '0'){
            temp=true;
            i--;
            while(i>=0){
                if(str.charAt(i) == '0' || str.charAt(i) == '5'){
                    flag=true;
                    break;
                }
                str.setCharAt(i, ' ');
                i--;
            }
            int cnt=0;
            for(int j=0;j<n;j++){
                if(str.charAt(j)==' '){
                    cnt++;
                }
            }
            ans1=cnt;
        }
        
        
        if(i>=0 && number == '5'){
            temp=true;
            i--;
            while(i>=0){
                if(str.charAt(i) == '2' || str.charAt(i) == '7'){
                    flag=true;
                    break;
                }
                str.setCharAt(i, ' ');
                i--;
            }
            int cnt=0;
            for(int j=0;j<n;j++){
                if(str.charAt(j)==' '){
                    cnt++;
                }
            }
            ans1=cnt;
        }
        
        if(!flag && number !='0'){
            return str.length();
        }
        
        if(!temp){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(str.charAt(j)==' '){
                    cnt++;
                }
            }
            ans2=cnt;
        }
        
        return Math.min(ans1, ans2);
        
    }
    
    public int minimumOperations(String num) {
        
        StringBuilder str1 = new StringBuilder(num);
        StringBuilder str2 = new StringBuilder(num);
        
        return Math.min(findMinimumOperations(str1, '0'), findMinimumOperations(str2, '5'));
        
    }
}