// ======================================
// Day 5 연습 문제 - 배열과 메서드
// ======================================

public class Practice05 {
    public static void main(String[] args) {

        // ── 문제 1 ──────────────────────────────────────
        // 아래 배열에서 최솟값을 구하는 코드를 작성하세요.
        //
        // 출력 예시:
        // 최솟값: 12

        System.out.println("=== 문제 1: 배열 최솟값 ===");
        int[] numbers = { 45, 12, 67, 23, 89, 34, 56 };
        int min = numbers[0];

        // TODO: 최솟값 찾기
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println("최솟값: " + min);

        // ── 문제 2 ──────────────────────────────────────
        // 아래 배열의 요소 순서를 뒤집어서 출력하세요.
        // (새 배열 사용 금지 - 직접 swap으로 뒤집기)
        //
        // 출력 예시:
        // 뒤집기 전: [1, 2, 3, 4, 5]
        // 뒤집기 후: [5, 4, 3, 2, 1]

        System.out.println("\n=== 문제 2: 배열 뒤집기 ===");
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.print("뒤집기 전: [");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + (k < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        // TODO: swap으로 배열 뒤집기 (힌트: 앞뒤 인덱스를 교환, arr.length/2 번 반복)
        for (int k = 0; k <= arr.length / 2; k++) {
            int A = arr[k];
            int B = arr[arr.length - k - 1];
            arr[k] = B;
            arr[arr.length - k - 1] = A;
        }

        System.out.print("뒤집기 후: [");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + (k < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        // ── 문제 3 ──────────────────────────────────────
        // 아래 메서드들을 완성하세요.
        //
        // (1) isEven(int n) → n이 짝수면 true, 홀수면 false
        // (2) repeat(String s, int n) → 문자열 s를 n번 반복한 String 반환
        // 예) repeat("ab", 3) → "ababab"
        // (3) max(int[] arr) → 배열에서 최댓값 반환
        //
        // 출력 예시:
        // isEven(4): true
        // isEven(7): false
        // repeat("Ha", 3): HaHaHa
        // max: 89

        System.out.println("\n=== 문제 3: 메서드 완성 ===");
        System.out.println("isEven(4): " + isEven(4));
        System.out.println("isEven(7): " + isEven(7));
        System.out.println("repeat(\"Ha\", 3): " + repeat("Ha", 3));
        System.out.println("max: " + max(numbers));
    }

    // TODO (1): 짝수 판별
    static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false; // ← 고치세요
    }

    // TODO (2): 문자열 반복
    static String repeat(String s, int n) {
        String S = "";
        for (int i = 1; i <= n; i++) {
            S += s;
        }
        return S; // ← 고치세요
    }

    // TODO (3): 최댓값
    static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max; // ← 고치세요
    }
}
