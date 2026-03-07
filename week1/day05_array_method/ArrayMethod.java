// Day 5: 배열과 메서드 - 선언, 순회, 함수 정의/호출 실습
public class ArrayMethod {
    public static void main(String[] args) {

        // === 1. 배열 선언 ===
        System.out.println("=== 배열 선언 ===");

        // 방법1: 값을 직접 넣기
        int[] scores = {90, 85, 70, 95, 60};

        // 방법2: 크기만 정하고 나중에 넣기
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        // === 2. 배열 접근 & 길이 ===
        System.out.println("첫 번째 점수: " + scores[0]);       // 90
        System.out.println("배열 길이: " + scores.length);       // 5

        // === 3. for문으로 순회 ===
        System.out.println("\n=== for문 순회 ===");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        // === 4. for-each로 순회 ===
        System.out.println("\n=== for-each 순회 ===");
        for (String name : names) {
            System.out.println("이름: " + name);
        }

        // === 5. 배열 활용 - 최대값 찾기 ===
        System.out.println("\n=== 최대값 찾기 ===");
        int max = scores[0];
        for (int s : scores) {
            if (s > max) {
                max = s;
            }
        }
        System.out.println("최대 점수: " + max);  // 95

        // === 6. 메서드 호출 ===
        System.out.println("\n=== 메서드 호출 ===");

        // 리턴값 있는 메서드
        int result = add(10, 20);
        System.out.println("add(10, 20) = " + result);

        // 리턴값 없는 메서드 (void)
        greet("Java");

        // 배열을 파라미터로 넘기기
        double avg = average(scores);
        System.out.println("평균 점수: " + avg);

        // 오버로딩 - 같은 이름, 다른 파라미터
        System.out.println("\n=== 오버로딩 ===");
        System.out.println("add(1, 2) = " + add(1, 2));
        System.out.println("add(1, 2, 3) = " + add(1, 2, 3));
    }

    // 리턴값 있는 메서드: static 리턴타입 이름(파라미터)
    static int add(int a, int b) {
        return a + b;
    }

    // 오버로딩: 같은 이름이지만 파라미터 개수가 다름
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 리턴값 없는 메서드: void
    static void greet(String name) {
        System.out.println("안녕하세요, " + name + "!");
    }

    // 배열을 받아 평균 구하기
    static double average(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return (double) sum / arr.length;  // 실수 나눗셈 위해 캐스팅
    }
}
