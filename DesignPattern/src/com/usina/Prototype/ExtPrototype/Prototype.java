package com.usina.Prototype.ExtPrototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Prototype implements Cloneable, Serializable {  
	  
    private static final long serialVersionUID = 1L;  
    private String desc;  
  
    private User user;  
    private Date begin;
    
    private SerializableObject obj;  
  
    /* ǳ���� */  
    public Object clone() throws CloneNotSupportedException {  
    	Object proto = super.clone();  
        return proto;  
    }  
  
    /* ��� */  
    public Object deepClone() throws IOException, ClassNotFoundException {  
  
        /* д�뵱ǰ����Ķ������� */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* �������������������¶��� */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();  
    }  
  

    

    	
    	  

  


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}  
	
	
	
  
}  
  
class SerializableObject implements Serializable {  
    private static final long serialVersionUID = 1L;  
}  