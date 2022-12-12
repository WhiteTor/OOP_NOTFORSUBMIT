/*

객체지향 프로그래밍 평가과제 (배점 25점)
학과: 컴퓨터공학부
학번: 202100613
이름: 김민우

과제 주제: 다양한 Java 기술을 이용한 한류 소개 프로그램

*/

package Korean_Wave;

import java.util.*;
import Korean_Wave.meaning_of_koreanwave;
import Korean_Wave.aspect_of_koreanwave;
import Korean_Wave.koreanwave_per_region;

public class main {   // 주석 2: 클래스 상속
	public static void main(String[] args) {
		Stack<String> working = new Stack<>();   // 주석 7: 컬렉션 프레임워크(스택) 사용, 현재 표시중인 화면 안내 용도
		working.push("메인 화면");
		Scanner sc = new Scanner(System.in);
		System.out.println("한류 문화 안내 프로그램에 오신 것을 환영합니다.");
		while (true) {
			System.out.println("현재 표시되는 화면: " + working.peek());
			System.out.println("원하시는 정보의 번호를 입력해주세요.(예시: 1)");
			System.out.println("----------------------------------");
			System.out.println("1. 한류란?");
			System.out.println("2. 한류의 양상");
			System.out.println("3. 지역별 한류(txt저장)");
			System.out.println("종료하시려면 '종료' 를 입력해주세요.");
			System.out.println("----------------------------------");
			String subject = sc.next();
			if (subject.equals("종료")) {
				break;
				}
			else if (subject.equals("1")) {
				working.push("한류란?");   // 주석 7: 스택에 현재 표시되는 화면 정보 입력
				System.out.println("현재 표시되는 화면: " + working.peek());
				meaning_of_koreanwave.comment();  //meaning_of_koreanwave.java에서 상속되어옴.
				working.pop();   // 주석 7: 화면에서 이탈시 마지막으로 들어온 정보(=현재 화면) 삭제
				}
			else if (subject.equals("2")) {
				working.push("한류의 양상");   // 주석 7: 스택에 현재 표시되는 화면 정보 입력
				System.out.println("현재 표시되는 화면: " + working.peek());
				aspect_of_koreanwave.printInfo();
				working.pop();   // 주석 7: 화면에서 이탈시 마지막으로 들어온 정보(=현재 화면) 삭제
				}
			else if (subject.equals("3")) {
				working.push("지역별 한류(txt저장)");   // 주석 7: 스택에 현재 표시되는 화면 정보 입력
				System.out.println("현재 표시되는 화면: " + working.peek());
				koreanwave_per_region.gettxt();
				working.pop();   // 주석 7: 화면에서 이탈시 마지막으로 들어온 정보(=현재 화면) 삭제
				}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
		}
		sc.close();
	}
}