package com.Interface;
interface Switch{
	void on();
	void off();
}
interface Regulator{
	void increaseSpeed();
	void decreaseSpeed();
}
class Fan implements Switch,Regulator{
	public void on() {
		System.out.println("Fan on");
	}
	public void off() {
		System.out.println("Fan off");
	}
	public void increaseSpeed() {
		System.out.println("Speed Increased");
	}
	public void decreaseSpeed() {
		System.out.println("Speed Decreased");
	}
}
public class Test4 {

	public static void main(String[] args) {
		Switch s=new Fan();
		s.on();
		s.off();
		Regulator r=new Fan();
		r.increaseSpeed();
		r.decreaseSpeed();

	}

}
