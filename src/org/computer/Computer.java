package org.computer;

public class Computer extends Desktop {
	public void computermodel() {
		System.out.println("Dell1.8");
	}
	public static void main (String[] args) {
		Computer c = new Computer();
		c.computermodel();
		c.desktopsize();
	}

}
