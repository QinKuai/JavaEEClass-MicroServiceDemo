package com.qinkuai.msdentity;

import lombok.Data;

@Data
public class Consumer {
	private String name;
	private int age;
	
	public Consumer() {
		name = "QinKuai_Consumer_Ver";
		age = 20;
	}
}
