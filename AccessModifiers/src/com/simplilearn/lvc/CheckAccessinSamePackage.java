package com.simplilearn.lvc;

public class CheckAccessinSamePackage {

public static void main(String[] args) {
		
		AccessSpecifier obj=new AccessSpecifier();
		obj.display();//able to call protected method
		
		obj.hello();//able to call public method
		obj.world();//able to call default method
	}
}
