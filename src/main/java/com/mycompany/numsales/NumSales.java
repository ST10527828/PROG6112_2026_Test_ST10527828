/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numsales;

/**
 *
 * @author emeris
 */
public class NumSales {

    public static void main(String[] args) {
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] console = {"PS5", "XBOX", "SWITCH"};
        int[][] sales = {{1000, 2000, 3000},
                         {2000, 3000, 4000},
                         {1500, 1100, 1200}};
        
        System.out.println("-----------------------------");
        System.out.println("GAMING COSOLE REPORT");
        System.out.println("-----------------------------");
        for (int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);
        }
        
        for (int row = 0; row < sales.length; row++){
            for (int col = 0; col < sales[row].length; col++){
                System.out.print(sales[row][col] + " ");
            }
            System.out.println();
        }
        
      
    }
}
