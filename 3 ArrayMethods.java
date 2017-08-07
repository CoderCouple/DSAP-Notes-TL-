import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int array1 []={1,2,3,4,6,5};
		int array2 []=array1.clone();
		
		//List of methods you must know about arrays
		//array1.clone();
		//Arrays.copyOf();
		//System.arraycopy();
		//
		
		//Arrays.toString();
		//Arrays.sort(array1);
		
		//Arrays.equals(a1,a2);
		//Arrays.deepEquals(a1, a2);
		//http://www.tothenew.com/blog/array-comparison-use-equals-or-deepequals/
		
		
		if(Arrays.equals(array1, array2))
		System.out.println("Array with the same contents...!!!");
		
		
		if(array1==array2){
			System.out.println("array1 == array2 is true...!!!");
		}else {
			System.out.println("array1 == array2 is false...!!!");
		}

		
		
		if(Arrays.toString(array1)==Arrays.toString(array2)){
			System.out.println("array1 == array2 is true...!!!");
		}else {
			System.out.println("array1 == array2 is false...!!!");
		}

		System.out.println(array1);
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		
		
		int array3 []= Arrays.copyOf(array1, array1.length);
		System.out.println(Arrays.toString(array3));
		
		
		
		
	}

}
