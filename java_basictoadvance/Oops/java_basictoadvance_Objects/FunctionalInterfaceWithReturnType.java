package java_basictoadvance_Objects;

@FunctionalInterface
interface uauser {
	 int  add(int i, int j);
}

public class FunctionalInterfaceWithReturnType {
	public static void main(String[] args) {
		uauser b= new uauser() {

			@Override
			public int add(int i, int j) {
				return i+j;
			}
			
		};
		int result = b.add(30, 40);
		System.out.println(result);
	}
}
