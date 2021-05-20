package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Object> println = System.out::println;
		
		// forma #01
		Stream<String> langs = Stream.of("Java", "JS", "CSS\n");
		langs.forEach(print);
		
		//						0			1		2		 3
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"}; 
		
		// forma #02
		Stream.of(maisLangs).forEach(print);
		
		// forma #03
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1,2).forEachOrdered(print); // esperado Lisp - pois não inclui elemento final
		Arrays.stream(maisLangs, 1,3).forEachOrdered(print); // esperado Lisp, Perl
		
		// Forma #04
		List<String> outrasLangs = Arrays.asList("C", "PHP", "C++\n\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		
		// Forma #05
		// Stream.generate(() -> "A" ).forEach(print);
		
		// Forma #06
		Stream.iterate(0, n -> n + 1).forEach(println);
	}

}
