// Day 6: 클래스 정의 - 필드, 생성자, 메서드, this
public class Student {

    // === 필드 (속성) ===
    String name;
    int age;
    int score;

    // === 생성자 (Constructor) ===
    // Python의 __init__과 같은 역할
    // 클래스 이름과 동일, 리턴 타입 없음
    Student(String name, int age, int score) {
        this.name = name;     // this = 이 객체 자신 (Python의 self)
        this.age = age;
        this.score = score;
    }

    // 생성자 오버로딩 - 점수 없이 생성할 수도 있게
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.score = 0;       // 기본값 0
    }

    // === 메서드 (행동) ===
    void introduce() {
        System.out.println("안녕! 나는 " + name + " (" + age + "세), 점수: " + score);
    }

    // 리턴값 있는 메서드
    String getGrade() {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else return "F";
    }

    // 점수 변경 메서드
    void setScore(int score) {
        this.score = score;   // this.score = 필드, score = 파라미터
    }
}
