package src.code.backtracking;

import java.util.*;

public class ExtraCharactersInAString {

    public int helper(int i, String s, Set<String> table, Map<Integer, Integer> dp){

        if(i == s.length()) return 0;

        if(dp.containsKey(i)){
            return dp.get(i);
        }

        int result = s.length();
        for(int endIdx = i; endIdx < s.length(); endIdx++){

            int offset = 0;
            String localSubString = s.substring(i, endIdx + 1);

            if(table.contains(localSubString)){
                offset += helper(endIdx + 1, s, table, dp);
            } else{
                offset += localSubString.length() + helper(endIdx + 1, s, table, dp);
            }

            result = Math.min(result, offset);
        }
        dp.put(i, result);
        return result;
    }

    public int minExtraChar(String s, String[] dictionary) {

        Map<Integer, Integer> dp = new HashMap<>();

        Set<String> table = new HashSet<>(Arrays.asList(dictionary));

        return helper(0, s, table, dp);
    }

}
