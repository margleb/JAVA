/*
 * —уть инкапсул€ции - объединение данных и методов работы с этими данными в одной упаковке (классе)
 * —окрытие - скрытие всех данных в классе (private) и предоставление данных (методов) дл€ управлени€ этими данными 
 */
class Plant {
	
	public static final int ID = 7;
	private String name;

	private int calculateGrowthForecast() {
		return 9;
	}	
	
	// классы дл€ управлени€ данными, остальна€ инфа скрыта
	public String getData() {
		String data = "some stuff" + calculateGrowthForecast();
		return data;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
}

public class Application {
	
	public static void main(String[] args) {

	}
	
}
