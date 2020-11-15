package prototype;

import java.util.Scanner;

class Test {
    Scanner sc = new Scanner(System.in);

    public void Help() {
        //명령어 사용법을 출력하는 메소드
    	System.out.println("'test print' 명령어");
    	System.out.println("명령어 이후에 오는 영단어들의 대소문자를 바꿔서 출력한다");
    }

    public String Scan() {
        //명령 전체를 입력받는 메소드
        //test print SC나 test print sc가 들어올곳
        String result = null;

        //Help메소드를 출력
        //입력부분

        return result;
    }

    public String[] Divide(String INPUT) {
        //Scan()에서 받은 String을 자바 내장클래스에 존재하는 메소드로 쪼개는 메소드
        String[] result = {};

        return result;
    }
    public boolean commandA(String INPUT) {
        //첫번째로 입력된 string이 문자열 배열에 포함되는 string인지 검사하는 메소드
        boolean result = false;
        String[] commandA_G = {"test"};

        //if문으로 입력한 문자열이 commandA_G에 존재할경우 true값을 return

        return result; 
    }

    public boolean commandB(String INPUT) {
        //두번째로 입력된 string이 문자열 배열에 포함되는 string인지 검사하는 메소드
        boolean result = false;
        String[] commandB_G = {"print"};

        //if문으로 입력한 문자열이 commandB_G에 존재할경우 true값을 return 

        return result; 
    }

    public String updown(String INPUT) {
        //소문자는 대문자로, 대문자는 소문자로 바꾸는 메소드
        String result = null;

        return result;
    }

}

public class Command {
    public static void main(String[] args) {
        Test ts = new Test();
        ts.Scan();
    }
}