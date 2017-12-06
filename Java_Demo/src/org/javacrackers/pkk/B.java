package org.javacrackers.pkk;

public class B extends A {

	public void main1() {
		System.out.println("Derived class main1");
		
	}
	public void main() {
		System.out.println("Derived class main");
		
	}

	
	public static void main(String aa[]){
		A a= new B();
		a.main();
		a.main1(0);
	}
	@Override
	public int main1(int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
