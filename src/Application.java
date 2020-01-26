public class Application {
	
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		// вызвается переписываемый метод из tree
		plant2.grow();
		
		tree.shedLeaves();
		
		// ошибка, та как у класса Plant нет shedLeaves() метода
		// plant2.shedLeaves();
		
		doGrow(tree);
	}
	
	// полиморфизм гарантирует  что везде, где родительский класс ожидается, я могу использовать дочерний класс этого родителя.
	public static void doGrow(Plant plant) {
		plant.grow();
	}
	
}
 