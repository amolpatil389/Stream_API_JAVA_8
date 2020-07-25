package Stream_API_1;

import java.util.stream.IntStream;

public class Ex_2_Integer_Stream_Skip {

	public static void main(String[] args) {
		
		IntStream.range(1, 10)
		.skip(5).forEach(x->System.out.println(x));
		System.out.println();

	}

}
