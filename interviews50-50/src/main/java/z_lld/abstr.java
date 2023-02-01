package z_lld;

import java.util.Arrays;
import java.util.List;

public  class abstr {
    public static void main(String[] args) {
        String s = "Tenant_PGTenant_BLR";
        List<String> ls = Arrays.asList("Tenant_BLR","Tenant_PG","BUY","Tenant_Chen","Tenant_YUA","RENT","Tenant_CDR","Tenant_PWI","OAPS");
        System.out.println(System.currentTimeMillis());
        for(int i=0;i<10;i++){
            System.out.println(wordBreak(s,ls));
        }
        System.out.println(System.currentTimeMillis());

    }
    public static boolean wordBreak(String storyTag, List<String> userTagsSet) {
        boolean[] dp = new boolean[storyTag.length()+1];
        dp[0]=true;
        for(int i=1;i<=storyTag.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && userTagsSet.contains(storyTag.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[storyTag.length()];
    }
}
