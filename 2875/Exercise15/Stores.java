package com.htc.exc.fifteen;

import java.util.*;

public class Stores {
	
	

	List<Product> lst = new ArrayList<>();

	public Stores(List<Product> lst) {
		super();
		this.lst = lst;
	}

	@Override
	public String toString() {
		return "Stores [lst=" + lst + "]";
	}

	
}
