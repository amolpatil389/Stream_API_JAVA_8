package Stream_API_1;

import java.util.stream.IntStream;

public class Ex_1_Integer_Stream {

	public static void main(String[] args) {
		
		IntStream.range(1, 10)
		.forEach(System.out::print);
		
		System.out.println();
		

	}

}
// The simple 3 line code will print integer from 1 to 9