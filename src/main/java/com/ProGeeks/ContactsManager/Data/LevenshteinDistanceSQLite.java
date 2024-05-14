/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProGeeks.ContactsManager.Data;

import org.sqlite.Function;
import java.sql.SQLException;

/**
 *
 * @author Hady Elkatatny
 */
public class LevenshteinDistanceSQLite extends Function  {
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 2) {
            throw new SQLException("EditDistance(str1, str2): Invalid argument count. Requires 2, but found " + args());
        }

        String str1 = value_text(0);
        String str2 = value_text(1);

        // Calculate the edit distance (e.g., using Levenshtein algorithm)
        int distance = calculateEditDistance(str1, str2);

        result(distance);
    }

    private int calculateEditDistance(String str1, String str2) {
        return LevenshteinDistance.ComputeDistance(str1, str2);
    }
}