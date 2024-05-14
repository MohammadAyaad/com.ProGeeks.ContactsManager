/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProGeeks.ContactsManager.Data;

import java.util.Arrays;

/**
 *
 * @author Hady Elkatatny
 */
public class LevenshteinDistance {
    public static int ComputeDistance(String str1,String str2)
    {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) 
        {
            for (int j = 0; j <= str2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                else if (j == 0) {
                    dp[i][j] = i;
                }
                else {
                    dp[i][j] = minm_edits(dp[i - 1][j - 1]
                        + NumOfReplacement(str1.charAt(i - 1),str2.charAt(j - 1)), // replace
                        dp[i - 1][j] + 1, // delete
                        dp[i][j - 1] + 1); // insert
                }
            }
        }
 
        return dp[str1.length()][str2.length()];
    }
   
    private static int NumOfReplacement(char c1, char c2)
    {
        return c1 == c2 ? 0 : 1;
    }
 
    // receives the count of different
    // operations performed and returns the
    // minimum value among them.
   
    static int minm_edits(int... nums)
    {
        return Arrays.stream(nums).min().orElse(
            Integer.MAX_VALUE);
    }
}
