package org.system;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Single Inheritance");
		Desktop obj = new Desktop();
        obj.desktopSize(); // calls method of super class
        obj.computerModel();// calls method of sub class


	}

}
