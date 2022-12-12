package Korean_Wave;

import java.util.*;
import java.io.FileWriter;
import java.io.Writer;
import Korean_Wave.enum_region;

public class koreanwave_per_region extends ask_continue{
	public static void gettxt() {
		while(true) {
			System.out.println("txt파일로 저장하고 싶은 지역의 번호를 입력해주세요(예시: 1)");
			System.out.println("----------------------------------");
			System.out.println("1. ASIA");
			System.out.println("2. EUROPE");
			System.out.println("3. NORTH AMERICA");
			System.out.println("4. SOUTH AMERICA");
			System.out.println("5. AFRICA");
			System.out.println("6. OCEANIA");
			System.out.println("돌아가시려면 '돌아가기' 를 입력해주세요.");
			System.out.println("----------------------------------");
			Scanner sc = new Scanner(System.in);
			String number = sc.next();
			if(number.equals("돌아가기")) {
				break;
				}
			enum_region selected = null;
			String report = null;
			switch(number) {   // 주석 6: 참조타입(열거타입)을 사용하는 switch문
			case "1":
				selected = enum_region.ASIA;
				report = "아시아에서 한류는, 한류가 서구권 국가로 퍼져나가기 전 마치 전초기지와도 같은 곳이었습니다.\n문화적으로도 비슷하고 신선한 한류는 중국, 일본에서도 인기를 끌었고, 동남아시아에서도 큰 인기를 얻었습니다.\n다만 동남아시아의 경우 다양한 문화로 인해 두루두루 많은 문화가 사랑받는다는 점을 고려할때, 한류가 온전히 저만의 특징으로 성공한 것은 아니라는 의견도 소수 존재합니다.";
				break;
			case "2":
				selected = enum_region.EUROPE;
				break;
			case "3":
				selected = enum_region.NORTH_AMERICA;
				break;
			case "4":
				selected = enum_region.SOUTH_AMERICA;
				break;
			case "5":
				selected = enum_region.AFRICA;
				break;
			case "6":
				selected = enum_region.OCEANIA;
				break;
			}
			System.out.println("현재 선택된 국가: " + selected);
			System.out.println("저장 위치: C:/");
			System.out.println("파일명: " + selected);
			try {   // 주석 4: 출력 과정에서 예외가 발생할 경우를 대비하여 예외 처리를 사용하였습니다.
				Writer writer = new FileWriter("C:\\report.txt");   // 주석 8: 파일 입출력 사용, 해당하는 대륙의 간단한 한류 현황을 표시합니다.
				writer.write(report);
				writer.flush();
				writer.close();
			} catch(Exception e) {
				System.out.println("오류가 발생하였습니다. 다시 시도해주세요.");
			} finally {
				ask_continue.breakorcontinue();   // 주석 4: 예외가 발생하여도, 프로그램은 종료할 수 있도록 합니다.
			}
		}
	}
}
