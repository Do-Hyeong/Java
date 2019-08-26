import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add((Integer) 3);
		numberList.add((Integer) 5);
		
		Stream<Integer> numberListStream = numberList.stream();
		numberListStream.forEach(System.out::println);
	}
	
}
