package main.java.tostring;

public class ToStringExample {
	
	String primeira = "Java";
	String segunda = "Csharp";
	String terceira = new String("Javascript");
	
	
	@Override
	public String toString() {
		return "App [primeira=" + primeira + ", segunda=" + segunda + ", terceira=" + terceira + "]";
	}	
	
}
