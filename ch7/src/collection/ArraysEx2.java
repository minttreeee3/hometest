package collection;

import java.util.Arrays;
import java.util.Comparator;

//정렬

//Comparable 인터페이스 : 기본 정렬 기준을 구현할 때 사용
//1) compareTo(Object o)

//Comparator 인터페이스 : 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할때 사용
//1) compare(Object o)
//





public class ArraysEx2 {

	public static void main(String[] args) {
		
		int arr[] = {37,34,25,74,23,13,56,75,58,98};
		String strArr[] = {" ","58","cat","Dog","lion","tiger"};
		
		//오름차순 정렬		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//사전순으로 정렬(공백, 숫자, 대문자, 소문자 순으로 정렬)
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		//내림차순 정렬
		//sort(T[] a, Comparator<? super T> c)
		Arrays.sort(strArr, new DescComp());
		System.out.println(Arrays.toString(strArr));
		
		// Comparator.reverseOrder() :내림차순 / Comparator.naturalOrder() :오름차순
		Arrays.sort(strArr, Comparator.reverseOrder());

	}

}

// 정렬기준 새롭게 작성시
class DescComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {		
		return o1.compareTo(o2) * -1;
	}


}