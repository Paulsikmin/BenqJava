package org.benq.day11.oop.interfacepkg.zoo;

public class ZooKeeper {
	
	public void feed(FoodInterface animal) {
		System.out.println("feed " + animal.animalFood());
	}

//	public void feed(Lion lion) {
//		System.out.println("feed gazel");
//	}
//
//	public void feed(Tiger tiger) {
//		System.out.println("feed rabbit");
//	}
//
//	public void feed(Bear bear) {
//		System.out.println("feed honey");
//	}

}
