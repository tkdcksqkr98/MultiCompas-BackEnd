package 컬렉션;
import java.util.*;

public class 배열과컬렉션변환2 {

	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자", "고구마", "우유", "감자", "양파"};
		stringPrint(냉장고음식);
		
		List<String> list =Arrays.asList(냉장고음식);
		//1. 감자가 들어있는 마지막 위치를 구해보세요. 전체 출력 
		System.out.println(list.lastIndexOf("감자"));
		System.out.println(list);
		//2. 양파를 포함하고 있으면 "양파는 안사도 된다",
		//        포함하고 있지 않으면 없어서 "양파사서 냉장고에 넣어야 한다."
		//        전체 출력
		if (list.contains("양파")) {
			System.out.println("양파는 안사도 된다");
		}else {
			System.out.println("양파사서 냉장고에 넣어야 한다.");
		}
		//3. 우유를 춘식이 우유로 수정해보자.
		list.set(2,"춘식이우유");
		System.out.println(list);
		//4. 양파를 찾아서 위치를 찾은 후, 해당 위치에 "양파즙"이라고 수정하자.
		//   전체출력
		int index = list.indexOf("양파");
		list.set(index,"양파즙");
		System.out.println(list);
		//5. 다시 배열로 변환하여 전체 내용을 출력
		List<String> list3 = new ArrayList<String>(Arrays.asList(냉장고음식));
		System.out.println(list3);
	
		//배열을 가지고 하면 복잡한 처리가 있으면 list로 하면 편하다.
				//검색, 수정, 인덱스의 작업을 하시려면 asList()를 사용하면 된다.
				//asList()로 하면 실제로는 원본 배열을 가지고 처리하는 것이기
				//때문에 길이와 관련된 추가, 삭제, 삽입이 불가능하다.
				//추가, 삭제, 삽입의 작업을 하시려면 모든 기능을 가진 ArrayList를
				//새로 만들어주면 됨.
	
	
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
