package com.nurmelekovat.a5.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Java17 implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		return "Version Java 17";
	}
	
}
