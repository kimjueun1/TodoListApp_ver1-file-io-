package com.todo.db;

public class SingletonClass {

	private static SingletonClass instance;
	private SingletonClass() {}
	
	static {
		try { instance = new SingletonClass(); }
		catch(Exception e) {
			throw
				new RuntimeException("[Error]" + e.getMessage());
		}
		
	}
	public static SingletonClass getInstance() {
		return instance;
	}

}
