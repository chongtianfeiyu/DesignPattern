package com.usina.Prototype.Simple;
public class Prototype implements Cloneable {  
	 private String name;
    public Prototype clone() throws CloneNotSupportedException {  
        Prototype proto = (Prototype) super.clone();  
        return proto;  
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}  
}  
