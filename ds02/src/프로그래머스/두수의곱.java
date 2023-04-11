package 프로그래머스;

import java.util.Scanner;

public class 두수의곱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		Solution sol = new Solution();
		int answer = sol.solution(num1, num2); //int
		System.out.println(answer);
		sc.close();
		
	}

}
class Solution2 {
    public int solution(int angle) {
        int answer = 0;
        if(0 < angle && angle < 90){
            return 1;
        }if( angle == 90){
            return 2;
        }if(90 < angle && angle < 180){
            return 3;
        }if(angle == 180){
            return 4;
        }
        return answer;
    }
    }