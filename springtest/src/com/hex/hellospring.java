package com.hex;

public class hellospring {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayhello() {
		System.out.println("hello:"+name);
	}

}
