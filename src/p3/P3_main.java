package p3;


import java.util.Arrays;

public class P3_main {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b= {1,2,3,4};
		
		System.out.println(Arrays.toString(elementwiseMultiply(a,b)));
		System.out.println(areOrthogonal(a,b));
		
	}
	
	public static int[] elementwiseMultiply(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			int[] a=new int[0];
			return a;
		}else {
		int[] result= new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			result[i] = arr1[i]*arr2[i];
		}
		return result;
		}
	}
	
	public static boolean areOrthogonal(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		int[] multiplied = elementwiseMultiply(arr1,arr2);
		int sum =0;
		for(int i=0; i<multiplied.length; i++) {
			sum += multiplied[i];
		}
		return sum == 0;
	}

}
