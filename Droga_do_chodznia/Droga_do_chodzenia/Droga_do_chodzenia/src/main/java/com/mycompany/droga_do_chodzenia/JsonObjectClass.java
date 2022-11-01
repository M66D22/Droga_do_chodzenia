/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.droga_do_chodzenia;

import java.awt.List;

/**
 *
 * @author Michal
 */
public class JsonObjectClass {
    private int id;
    //private List route;
    private String name;
    private int length;
    private String description;
    private String type;
    //private image;
    //private list best_lap;

    public JsonObjectClass(int id, String name, int length, String description, String type) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.description = description;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nid=" + id + 
                "\nname=" + name + 
                "\nlength=" + length + 
                "\ndescription=" + description + 
                "\ntype=" + type+"\n\n";
    }
    
    
}
