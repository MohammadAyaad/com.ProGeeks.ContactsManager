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
    public static int ComputeDistance(String str0, String str1) {
        int[][] distance_matrix = new int[(str0.length() + 1)][(str1.length() + 1)];
        for (int i = 0; i <= str0.length(); i++)
            distance_matrix[i][0] = i;
        for (int i = 0; i <= str1.length(); i++)
            distance_matrix[0][i] = i;

        for (int x = 1; x <= str0.length(); x++) {
            for (int y = 1; y <= str1.length(); y++) {
                distance_matrix[x][y] = Math.min(distance_matrix[x - 1][y],
                        Math.min(distance_matrix[x][y - 1], distance_matrix[x - 1][y - 1]))
                        + ((str0.charAt(x - 1) == str1.charAt(y - 1)) ? 0 : 1);
            }
        }
        return distance_matrix[(str0.length())][(str1.length())];
    }
}
