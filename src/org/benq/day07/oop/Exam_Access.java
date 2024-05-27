package org.benq.day07.oop;

// 접근지정자(제한자)
// 종류 : public, protected, default, private
class Sample {
	public int a;
	private int b;
	int c;
}


public class Exam_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample smp = new Sample();
		smp.a = 507;
//		smp.b = 1023;	// The field Sample.b is not visible
		smp.c = 2024;
	}

}
