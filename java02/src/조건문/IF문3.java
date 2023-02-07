package 조건문;

import java.lang.invoke.SwitchPoint;

public class IF문3 {

	public static void main(String[] args) {
		//조건이 여러개 일때
		int myNum = 99;
		
		//점수가 80점 이상이면 최우수 프린트
		//점수가 70점 이상이면 우수 프린트
		//점수가 60점 이상이면 보통 프린트
		//나머지는 미달 프린트
		String result = "";
		  if (myNum >= 80) {
			result = "최우수";
		} else if(myNum >= 70){
			result = "우수";
		} else if(myNum >= 60) {
			result = "보통";
		} else {
			result = "미달";
		}
				System.out.println(result);
		
		int myTour = 10; //올해 여행 횟수
		//여행횟수가 10이면 "VVIP" 프린트
		//여행횟수가 6이면 "VIP" 프린트
		//나머지 횟수이면, "Normal" 프린트
		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break;
		case 6:
			System.out.println("VIP");
			break;
			default:
				System.out.println("Normal");
		}
	}

}
