
public class ShadowTest {
	int x = 0;
	class FirstLavel {
		int x = 1;
		void InsideFirstLavel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + x);
			System.out.println("ShadowText.this.x = " + ShadowTest.this.x);
		}
	}
	
	public static void main(String[] args) {
		ShadowTest st = new ShadowTest();
		ShadowTest.FirstLavel fl = st.new FirstLavel();
		fl.InsideFirstLavel(23);
	}
}
