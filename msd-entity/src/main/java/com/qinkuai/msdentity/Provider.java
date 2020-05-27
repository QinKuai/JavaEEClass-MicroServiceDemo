package com.qinkuai.msdentity;

import lombok.Data;

@Data
public class Provider {
	private String name;
	private int age;
	
	public Provider() {
		name = "QinKuai_Provider_Ver";
		age = 21;
	}
}
