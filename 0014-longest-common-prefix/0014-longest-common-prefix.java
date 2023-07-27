class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder("");

        StringBuilder compare=new StringBuilder(strs[0]);

        for(int i=1;i<strs.length;i++){
            if(strs[i].length() < compare.length()){
                compare=new StringBuilder(strs[i]);
            }
        }

        // System.out.println(compare);

        for(int i=0;i<compare.length();i++){

            boolean temp=true;

            for(int j=0;j<strs.length;j++){
                if(compare.charAt(i) != strs[j].charAt(i)){
                    temp=false;
                    break;
                }
            }

            if(temp){
                ans.append(compare.charAt(i));
            }
            else{
                break;
            }

        }

        return ans.toString();

        
    }
}