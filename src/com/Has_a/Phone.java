package com.Has_a;

public class Phone {
    String phonename;
    String color;
    Sim s;
    public Phone(String phonename,String color) {
    	this.phonename=phonename;
    	this.color=color;
    }
    public void insertSim(Sim s) {
    	this.s=s;
    }
    public void display() {
    	System.out.println(phonename+"\n"+color);
    	if(s!=null)
    		System.out.println(s.name+"\n"+s.num);
    	else
    		System.out.println("Sim card not Added");
    }
    }
