
public class OuterClass {

	public void method1() {
		class LocalClass{
			int d;
			void method5() {
				System.out.println("Local Class : "+d);
			}
		}
		LocalClass inner = new LocalClass();
		inner.d = 1004;
		inner.method5();
	}
}
