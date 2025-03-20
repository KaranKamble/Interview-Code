package test;

class Singloton1 {

	private static final Singloton1 S1 = new Singloton1();

	private Singloton1() {
		System.out.println("Inside ctor");
	}

	public static Singloton1 getObject() {
		return S1;
	}
}

class Singloton2 {
	private static Singloton2 s2;

	private Singloton2() {
		System.out.println("Inside ctor");
	}

	public static Singloton2 getObject() {
		if (s2 == null)
			return s2 = new Singloton2();
		return s2;

	}
}

class Singloton3 {
	private static Singloton3 s3;

	public Singloton3() {
		System.out.println("Inside ctor");
	}

	public static Singloton3 getObject() {

		if (s3 == null) {
			synchronized (Singloton3.class) {
				if (s3 == null) {
					s3 = new Singloton3();
				}
			}
		}
		return s3;
	}

}

public class Program {

	public static void main(String[] args) {
		Singloton3 s1 = Singloton3.getObject();
		Singloton3 s2 = Singloton3.getObject();
		System.out.println(s1 == s2);
	}

	public static void main2(String[] args) {
		Singloton2 s1 = Singloton2.getObject();
		Singloton2 s2 = Singloton2.getObject();
		System.out.println(s1 == s2);
	}

	public static void main1(String[] args) {
		Singloton1 s1 = Singloton1.getObject();
		Singloton1 s2 = Singloton1.getObject();
		System.out.println(s1 == s2);
	}
}
