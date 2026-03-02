// Day 3: 조건문 - if/else, switch, 삼항 연산자 실습
public class ControlFlow {
    public static void main(String[] args) {

        // === 1. if / else if / else ===
        int score = 85;
        System.out.println("=== if / else if / else ===");
        System.out.println("점수: " + score);

        if (score >= 90) {
            System.out.println("등급: A");
        } else if (score >= 80) {
            System.out.println("등급: B");
        } else if (score >= 70) {
            System.out.println("등급: C");
        } else {
            System.out.println("등급: F");
        }

        // === 2. 논리 연산자와 조건문 결합 ===
        System.out.println("\n=== 복합 조건 ===");
        int age = 20;
        boolean hasId = true;

        if (age >= 19 && hasId) {
            System.out.println("입장 가능");
        } else {
            System.out.println("입장 불가");
        }

        // === 3. switch문 ===
        System.out.println("\n=== switch문 ===");
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("월요일");
                break;          // break 없으면 아래로 계속 실행됨!
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            default:            // 위 case에 해당 안 될 때
                System.out.println("주말");
                break;
        }

        // switch - String도 가능!
        System.out.println("\n=== switch + String ===");
        String command = "start";

        switch (command) {
            case "start":
                System.out.println("시작합니다");
                break;
            case "stop":
                System.out.println("중지합니다");
                break;
            default:
                System.out.println("알 수 없는 명령");
                break;
        }

        // === 4. 삼항 연산자 (한 줄 if문) ===
        // 형태: 조건 ? 참일때값 : 거짓일때값
        System.out.println("\n=== 삼항 연산자 ===");
        int num = 7;
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(num + "은(는) " + result);

        String status = (age >= 19) ? "성인" : "미성년자";
        System.out.println(age + "세 → " + status);
    }
}
