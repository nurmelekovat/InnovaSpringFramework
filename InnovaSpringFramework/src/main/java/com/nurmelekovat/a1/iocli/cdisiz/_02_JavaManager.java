package com.nurmelekovat.a1.iocli.cdisiz;

public class _02_JavaManager {
	// interface çağır
	private _01_JavaVersion javaInterface;
	
	// paramatreli constructor
	public _02_JavaManager(_01_JavaVersion javaInterface) {
		this.javaInterface = javaInterface;
	}
	
	// Metot
	public void newJavaVersion() {
		javaInterface.javaVersion();
	}
}
