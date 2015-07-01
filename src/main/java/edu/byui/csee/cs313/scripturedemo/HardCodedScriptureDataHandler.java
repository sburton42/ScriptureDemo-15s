/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.csee.cs313.scripturedemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sburton
 */
public class HardCodedScriptureDataHandler implements ScriptureDataHandler {
    @Override
    public List<Scripture> getFavoriteScriptures() {
        List<Scripture> myList = new ArrayList<Scripture>();

        myList.add(new Scripture("2 Nephi", 9, 34));
        myList.add(new Scripture("Ether", 12, 27));
        myList.add(new Scripture("1 Nephi", 2, 15));
        myList.add(new Scripture());

        return myList;
    }
}
