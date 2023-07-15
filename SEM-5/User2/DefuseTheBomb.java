class Solution {
    public int[] decrypt(int[] code, int k) 
    {   
        int ans[] = new int[code.length];

        if(k>0)
        {
            for(int i=0;i<code.length;i++)
            {
                int a = 0;
                for(int j = 1; j <= k ;j++)
                {
                 a = a+(code[(i+j) % code.length]); 
                }
                ans[i] = a;
            }
        }
        if(k==0)
        {
            for(int i=0;i<code.length;i++)
            {
                code[i] = 0;
            }

        }
        if(k<0)
        {
            for(int i=0;i<code.length;i++)
            {
                int a = 0;
                for(int j = 1; j <= -1*k ;j++)
                {
                 a = a+(code[(i - j + code.length) % code.length]); 
                }
                ans[i] = a;
            }
            
        }
        return ans;
    }
}
