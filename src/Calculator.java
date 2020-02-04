import java.util.function.Function;

/*
 * 1. Создаем интерфейс IntegerMath
 *    - метод int operation, c двумя int аргументами
 * 2. Метод operateBinary()
 *    - принимает в качестве аргумента интерфейс и возращает результат расчета
 * 3. В main методе
 *    - экземпляр myApp
 *    - две переменных additional/subtraction интерфейса IntegerMath (лямбда функция)
 *    - sysout для двух интерфейсов
 */

public class Calculator {
	   
    interface IntegerMath {
        int operation(int a, int b);   
    }
   
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
  
    public static void main(String... args) {
     
        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));    
    }
}
