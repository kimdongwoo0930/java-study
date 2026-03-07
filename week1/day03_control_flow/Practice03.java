// ======================================
// Day 3 연습 문제 - 조건문
// ======================================

public class Practice03 {
    public static void main(String[] args) {

        // ── 문제 1 ──────────────────────────────────────
        // BMI를 계산하고 if/else if/else로 판정하세요.
        // BMI = 몸무게(kg) / (키(m) * 키(m))
        //
        // 판정 기준:
        // BMI < 18.5 → "저체중"
        // 18.5 <= BMI < 23 → "정상"
        // 23 <= BMI < 25 → "과체중"
        // 25 이상 → "비만"
        //
        // 출력 예시 (몸무게 70, 키 1.75):
        // BMI: 22.86
        // 판정: 정상

        System.out.println("=== 문제 1: BMI 판정 ===");
        double weight = 70;
        double heightM = 1.75;

        // TODO: BMI 계산
        double bmi = weight / (heightM * heightM); // ← 공식 채우세요

        System.out.printf("BMI: %.2f%n", bmi);

        // TODO: if/else if/else로 판정 출력
        String result = "";
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23) {
            result = "정상";
        } else if (bmi < 25) {
            result = "과체중";
        } else {
            result = "비만";
        }

        System.out.println("판정: " + result);

        // ── 문제 2 ──────────────────────────────────────
        // switch문으로 월(month)을 입력받아 계절을 출력하세요.
        //
        // 3, 4, 5월 → "봄"
        // 6, 7, 8월 → "여름"
        // 9, 10, 11월 → "가을"
        // 12, 1, 2월 → "겨울"
        //
        // 출력 예시 (month = 7):
        // 7월은 여름입니다.

        System.out.println("\n=== 문제 2: switch - 계절 판단 ===");
        int month = 7;

        // TODO: switch문 작성 (힌트: case 여러 개를 break 없이 이어쓸 수 있음)
        String season = "";
        switch (month) {
            case 3, 4, 5:
                season = "봄";
                break;
            case 6, 7, 8:
                season = "여름";
                break;

            case 9, 10, 11:
                season = "가을";
                break;

            default:
                season = "겨울";
                break;
        }

        System.out.println(month + "월은 " + season + "입니다.");

        // ── 문제 3 ──────────────────────────────────────
        // 삼항 연산자 한 줄로 해결하세요.
        //
        // (1) number가 양수면 "양수", 음수면 "음수", 0이면 "영"
        // 힌트: 삼항 연산자 중첩 가능 (조건1 ? 값1 : 조건2 ? 값2 : 값3)
        //
        // (2) year가 윤년이면 "윤년", 아니면 "평년"
        // 윤년 조건: 4의 배수 && (100의 배수가 아니거나 400의 배수)
        //
        // 출력 예시:
        // -5 → 음수
        // 2024년: 윤년

        System.out.println("\n=== 문제 3: 삼항 연산자 ===");
        int number = -5;
        int year = 2024;

        // TODO (1)
        String sign = (number > 0 ? "양수" : number < 0 ? "음수" : "영"); // ← 삼항 연산자로 채우세요
        System.out.println(number + " → " + sign);

        // TODO (2)
        String yearType = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? "윤년" : "평년"); // ← 삼항 연산자로 채우세요
        System.out.println(year + "년: " + yearType);
    }
}
