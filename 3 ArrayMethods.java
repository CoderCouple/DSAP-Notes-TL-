import java.util.Arrays;

public class ArrayMethods {

	public static char[] delete(char data[], int pos) {
		if (pos >= 0 && pos <= data.length) {

			char[] temp = new char[data.length - 1];
			System.arraycopy(data, 0, temp, 0, pos);
			System.arraycopy(data, pos + 1, temp, pos, data.length - pos-1);
			return temp;
		}
		return data;
	}

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 6, 5 };
		int array2[] = array1.clone();

		// List of methods you must know about arrays
		// array1.clone(); -- Shallow Copy!!!
		// Arrays.copyOf(); -- Shallow Copy!!!
		// System.arraycopy(); -- Shallow Copy!!!
		// http://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/
		// public static void arraycopy(Object source,int srcindex,Object
		// destination,int destIndex,int length)

		// Arrays.toString();
		// Arrays.sort(array1);

		// Arrays.equals(a1,a2); -- copies only references of nested arrays
		// Arrays.deepEquals(a1, a2); -- creats new copies of even nested arrays
		// http://www.tothenew.com/blog/array-comparison-use-equals-or-deepequals/

		if (Arrays.equals(array1, array2))
			System.out.println("Array with the same contents...!!!");

		if (array1 == array2) {
			System.out.println("array1 == array2 is true...!!!");
		} else {
			System.out.println("array1 == array2 is false...!!!");
		}

		if (Arrays.toString(array1) == Arrays.toString(array2)) {
			System.out.println("array1 == array2 is true...!!!");
		} else {
			System.out.println("array1 == array2 is false...!!!");
		}

		System.out.println(array1);
		System.out.println(Arrays.toString(array1));

		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));

		int array3[] = Arrays.copyOf(array1, array1.length);
		System.out.println(Arrays.toString(array3));

		int array4[] = new int[array1.length];
		System.arraycopy(array1, 0, array4, 0, 3);
		System.out.println(Arrays.toString(array4));

		char a[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(delete(a, 3)));

	}

}
