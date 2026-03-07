// Day 7: 1주차 종합 복습 - 학생 성적 관리 프로그램
// Day1 변수 | Day2 연산자 | Day3 조건문 | Day4 반복문 | Day5 배열/메서드 | Day6 클래스/객체
public class GradeManager {

    // === [Day 6] 내부 클래스: 학생 ===
    String name;       // [Day 1] String
    int[] scores;      // [Day 5] 배열

    // [Day 6] 생성자
    GradeManager(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // [Day 5] 메서드 - 총점 계산
    int getTotal() {
        int sum = 0;                          // [Day 1] 변수
        for (int s : scores) {                // [Day 4] for-each
            sum += s;                         // [Day 2] 대입 연산자
        }
        return sum;
    }

    // [Day 5] 메서드 - 평균 계산
    double getAverage() {
        return (double) getTotal() / scores.length;  // [Day 2] 형변환 나누기
    }

    // [Day 3] 조건문 - 등급 판정
    String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    // [Day 3] 삼항 연산자 - 합격 여부
    String getPassStatus() {
        return (getAverage() >= 60) ? "합격" : "불합격";   // [Day 2] 비교 + 삼항
    }

    // [Day 5] 메서드 - 정보 출력
    void printReport() {
        System.out.println("┌─────────────────────────────");
        System.out.println("│ 이름: " + name);
        System.out.print("│ 점수: ");
        for (int i = 0; i < scores.length; i++) {         // [Day 4] for문
            System.out.print(scores[i]);
            if (i < scores.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("│ 총점: " + getTotal());
        System.out.printf("│ 평균: %.1f%n", getAverage()); // 소수점 1자리
        System.out.println("│ 등급: " + getGrade());
        System.out.println("│ 결과: " + getPassStatus());
        System.out.println("└─────────────────────────────");
    }

    // === main ===
    public static void main(String[] args) {

        // [Day 6] 객체 배열 생성
        GradeManager[] students = {
            new GradeManager("Alice",   new int[]{95, 88, 92}),
            new GradeManager("Bob",     new int[]{72, 65, 58}),
            new GradeManager("Charlie", new int[]{80, 85, 78}),
            new GradeManager("Diana",   new int[]{55, 40, 62}),
        };

        // 전체 성적표 출력
        System.out.println("====== 1주차 종합 - 성적 관리 ======\n");
        for (GradeManager s : students) {                  // [Day 4] for-each
            s.printReport();
        }

        // [Day 3 + Day 4] 등급별 인원 세기 (switch + 반복문)
        System.out.println("====== 등급별 인원 ======");
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        for (GradeManager s : students) {
            switch (s.getGrade()) {                        // [Day 3] switch
                case "A": countA++; break;                 // [Day 2] 증감 연산자
                case "B": countB++; break;
                case "C": countC++; break;
                case "D": countD++; break;
                case "F": countF++; break;
            }
        }
        System.out.println("A: " + countA + "명");
        System.out.println("B: " + countB + "명");
        System.out.println("C: " + countC + "명");
        System.out.println("D: " + countD + "명");
        System.out.println("F: " + countF + "명");

        // [Day 4 + Day 5] 최고/최저 점수 학생 찾기
        System.out.println("\n====== 최고 & 최저 ======");
        GradeManager best = students[0];
        GradeManager worst = students[0];
        for (GradeManager s : students) {
            if (s.getAverage() > best.getAverage()) best = s;    // [Day 3] if
            if (s.getAverage() < worst.getAverage()) worst = s;
        }
        System.out.printf("1등: %s (평균 %.1f)%n", best.name, best.getAverage());
        System.out.printf("꼴등: %s (평균 %.1f)%n", worst.name, worst.getAverage());
    }
}
