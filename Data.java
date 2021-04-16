/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

public class Data {
    private static final Data data;
    static{
        data = new Data();
    }
    public static Data getData(){
        return data;
    }
    public int arr[][] = new int[6][6];
}
