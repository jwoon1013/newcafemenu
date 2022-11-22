package Front;

import java.util.Scanner;

public class frontOptions {
    //제일 처음 실행하면 뜨는 질문창.
    public void frontOptionsQuestion() {
        System.out.println("무엇을 할까요?");
        System.out.println("1. 손님메뉴 열기");
        System.out.println("2. 직원메뉴 열기");
        System.out.println("3. 나가기");

        System.out.println("숫자를 입력하세요.");
        Scanner frontScanner = new Scanner(System.in);
        int frontAnswer = frontScanner.nextInt();
        if (frontAnswer==1){
            System.out.println("손님메뉴를 불러옵니다.");

        } else if(frontAnswer==2){
            System.out.println("직원메뉴를 불러옵니다.");

        } else if(frontAnswer==3){
            System.out.println("안녕히가세요.");
            System.exit(0);
        } else {
            System.out.println("잘못누르셨습니다. 다시 선택해주세요.");
            frontOptionsQuestion();
        }




    }
}
