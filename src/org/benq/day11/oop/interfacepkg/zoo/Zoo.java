package org.benq.day11.oop.interfacepkg.zoo;

public class Zoo {
	public static void main(String [] args) {
		
		ZooKeeper zkp = new ZooKeeper();
		zkp.feed(new Lion());
		zkp.feed(new Tiger());
		zkp.feed(new Bear());
	}
}
