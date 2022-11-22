import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("향단이네 카페에 오신 것을 환영합니다!");
        mainFront();


    }

    // Front manu : 실행시 처음 나오는 프론트 화면 호출 함수
    private static void mainFront() {
        System.out.println("무엇을 할까요?");
        System.out.println("1. 손님메뉴 열기");
        System.out.println("2. 직원메뉴 열기");
        System.out.println("3. 나가기");
        System.out.println(" ");
        System.out.println("숫자를 입력하세요.");
        Scanner frontScanner = new Scanner(System.in);
        int frontAnswer = frontScanner.nextInt();
        if (frontAnswer == 1) {
            System.out.println("손님메뉴를 불러옵니다.");
            customerFront();

        } else if (frontAnswer == 2) {
            System.out.println("직원메뉴를 불러옵니다.");
            employeeFront();

        } else if (frontAnswer == 3) {
            System.out.println("안녕히가세요.");
            System.exit(0);
        } else {
            System.out.println("잘못누르셨습니다. 다시 선택해주세요.");
            mainFront();
        }

    } //mainFront() 종료

    // customerFront() 1. 손님메뉴 선택시 나오는 프론트화면 호출 함수
    private static void customerFront() {
        System.out.println("안녕하세요," /*(여기에 손님 이름 출력)*/ + "님. 무엇을 할까요?");
        System.out.println("소지금 : " /*(여기에 손님 보유금액 출력)*/ + "원");
        System.out.println("1.주문하기");
        System.out.println("2.음료마시기");
        System.out.println("3.돌아가기");
        System.out.println(" ");
        System.out.println("숫자를 입력하세요.");
        Scanner customerScanner = new Scanner(System.in);
        int customerAnswer = customerScanner.nextInt();
        if (customerAnswer == 1) {
            System.out.println("주문을 합니다.");
            System.out.println(" ( 미구현 ) ");
            customerFront();

        } else if (customerAnswer == 2) {
            System.out.println("음료 목록을 불러옵니다..");
            System.out.println(" ( 미구현 ) ");
            customerFront();

        } else if (customerAnswer == 3) {
            System.out.println("메인메뉴로 돌아갑니다.");
            mainFront();
        } else {
            System.out.println("잘못누르셨습니다. 다시 선택해주세요.");
            customerFront();

        }

    }//customerFront() 종료

    // employeeFront() 2 직원메뉴 선택시 나오는 프론트화면 호출 함수
    private static void employeeFront() {
        System.out.println("안녕하세요, 무엇을 할까요?");
        System.out.println("1.수입금 확인");
        System.out.println("2.재고 확인");
        System.out.println("3.돌아 가기");
        System.out.println(" ");
        System.out.println("숫자를 입력하세요.");
        Scanner employeeScanner = new Scanner(System.in);
        int employeeAnswer = employeeScanner.nextInt();
        if (employeeAnswer == 1) {
            System.out.println("수입금 확인합니다.");
            System.out.println(" ( 미구현 ) ");
            employeeFront();

        } else if (employeeAnswer == 2) {
            System.out.println("재고 확인합니다.");
            System.out.println(" ( 미구현 ) ");
            employeeFront();

        } else if (employeeAnswer == 3) {
            System.out.println("메인메뉴로 돌아갑니다.");
            mainFront();
        } else {
            System.out.println("잘못누르셨습니다. 다시 선택해주세요.");
            employeeFront();

        }


    }
}
