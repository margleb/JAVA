public class Application {
	public static void main(String[] args) {
		
		// Inefficient
		String info = "";		
		info += "My name is bob";
		info += " ";
		info += "I am a buidler";
		
		System.out.println(info);
		
		// More efficent
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver");
		System.out.println(s.toString());
		
		/// Formatting /////
		System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
		System.out.println("More text.");
		
		// Formatting integer
		System.out.printf("Total const %-10d; quantity is %d\n", 5, 120);
		
		for(int i=0; i<20; i++) {
			// 2 в данном случае позволяет добавить пробелы
			// - (минус) позволяет выровнить по числа по левому краю
			System.out.printf("%-2d: %s\n", i, "Here is some text");
		}
		
		// Formatting floating point values
		// .2 указывает кол-во цифр после запятой
		// -6.1 (6 - количество символов + пробел); 
		// (1 - кол-во символов после запятой); 
		// (минус - выравнивание по левому краю)
		System.out.printf("Total value: %.2f\n", 5.6783);
		System.out.printf("Total value: %-6.1f\n", 321.6783);
		
		 
	}
}
