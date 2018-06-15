/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.ablehands.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import by.bntu.fitr.povt.ablehands.logic.Generate;
import by.bntu.fitr.povt.ablehands.logic.Logic;
import by.bntu.fitr.povt.ablehands.view.View;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList(Generate.generate(5, 10));
        List<Integer> list2 = new ArrayList(Generate.generate(6, 99));
        //List<Integer> list1 = new ArrayList(Arrays.asList(1,1,2,3, 5, 7, 9,15,17));
        //List<Integer> list2 = new ArrayList(Arrays.asList(2, 4, 6, 8,10, 12));
        Collections.sort(list1);
        Collections.sort(list2);
        
        Logic.concatenations(list1, list2);
        View.print(list1.toString());
    }
    
}
