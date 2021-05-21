package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total = nums.stream().reduce(soma).get();
		System.out.println(total); //esperado 45
		
		Integer total2 = nums.parallelStream().reduce(0, soma); //Identity é passado a cada nova chamada, logo, para garantir o Identity somado apenas uma única vez usar Stream ao invês de parallelStream
		System.out.println(total2);
		
		// Resultado Optional<Integer> ...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma) 
			.ifPresent(System.out::println); // esperado 30 (6+7+8+9)
	}

}
