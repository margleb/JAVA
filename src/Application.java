/*
 * 1. ���������� ����� FirstLevel, 2 int ����������
 *    - ������� void ����� methodInFirstLevel()
 *      - Consumer<Integer> c ������ �������� � sysout ������ ����������
 *        - � �������� ��������� �������� y
 * 2. ������������� ������: Lambda expression's parameter x cannot redeclare another local variable defined in an enclosing
 * 	  (�������� ������-��������� x �� ����� �������� �������� ������ ��������� ����������, ������������ �� ��������� ������� ���������.)
 * 3. ������� �������������� x � ������ methodInFirtsLevel, ������� �� ������������ ������: Local variable x defined in an enclosing scope must be final or effectively final
 * 
 */

import java.util.function.Consumer;

public class Application {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            
            // The following statement causes the compiler to generate
            // the error "local variables referenced from a lambda expression
            // must be final or effectively final" in statement A:
            //
            // x = 99;
           
        	// ������ ��� ���������� x ���������
            Consumer<Integer> myConsumer = (y) -> 
            {
            	
            	// int x = 33;
            	
                System.out.println("x = " + x); // Statement A
                System.out.println("y = " + y);
                System.out.println("this.x = " + this.x);
                System.out.println("LambdaScopeTest.this.x = " + Application.this.x);
            };

            myConsumer.accept(x);

        }
    }

    public static void main(String... args) {
    	Application st = new Application();
    	Application.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}