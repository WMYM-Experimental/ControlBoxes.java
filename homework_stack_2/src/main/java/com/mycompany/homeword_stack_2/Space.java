/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeword_stack_2;

import java.util.ArrayList;

/**
 *
 * @author Washington
 */
public class Space {

    ArrayList<MyStack> space;
    int numOfStacks;

    public Space() {
        this.space = new ArrayList<>();
        // 3 for default
        this.space.add(new MyStack(6));
        this.space.add(new MyStack(6));
        this.space.add(new MyStack(6));
        
        this.numOfStacks = this.space.size();
    }

    public void add(MyStack ns) {
        this.space.add(ns);
    }

    public MyStack get(int index) {
        return (MyStack) this.space.get(index);
    }

    public int size() {
        return this.space.size();
    }

    @Override
    public String toString() {
        String result = "";
        int aux;
        for (int i = this.size() - 1; i >= 0; i--) {

            aux = i;
            aux++;

            result += "+++++++++++++++++++++++++++++++++++++++\n"
                   + "_______________ STACK " + aux + " ________________" + "\n"
                   + this.space.get(i).toString() + "\n\n";
        }
        return result;
    }

}
