/*
 * 1. Внутренний класс FirstLevel, 2 int переменные
 *    - Создаем void метод methodInFirstLevel()
 *      - Consumer<Integer> c лямбда функцией и sysout каждой переменной
 *        - в качестве аргумента передаем y
 * 2. Демонстрируем ошибку: Lambda expression's parameter x cannot redeclare another local variable defined in an enclosing
 * 	  (Параметр лямбда-выражения x не может повторно объявить другую локальную переменную, определенную во вложенной области видимости.)
 * 3. Пробуем переопределить x в методе methodInFirtsLevel, смотрим на получившуюся ошибку: Local variable x defined in an enclosing scope must be final or effectively final
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
           
        	// ошибка при добавлении x аргумента
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