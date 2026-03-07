// Day 6: 객체 생성과 사용 - 클래스를 활용하는 실습
public class OopBasic {
    public static void main(String[] args) {

        // === 1. 객체 생성 (new 키워드) ===
        System.out.println("=== 객체 생성 ===");
        Student s1 = new Student("Alice", 20, 95);
        Student s2 = new Student("Bob", 22, 78);
        Student s3 = new Student("Charlie", 19);   // 오버로딩 생성자 (점수 없이)

        // === 2. 메서드 호출 ===
        System.out.println("\n=== 자기소개 ===");
        s1.introduce();
        s2.introduce();
        s3.introduce();

        // === 3. 필드 접근 & 메서드 활용 ===
        System.out.println("\n=== 등급 확인 ===");
        System.out.println(s1.name + "의 등급: " + s1.getGrade());
        System.out.println(s2.name + "의 등급: " + s2.getGrade());

        // === 4. 값 변경 ===
        System.out.println("\n=== 점수 변경 ===");
        s3.setScore(88);
        System.out.println("Charlie 점수 변경 후:");
        s3.introduce();
        System.out.println("등급: " + s3.getGrade());

        // === 5. 객체 배열 ===
        System.out.println("\n=== 객체 배열 (전체 학생) ===");
        Student[] students = {s1, s2, s3};

        for (Student s : students) {
            System.out.println(s.name + " → " + s.getGrade());
        }

        // === 6. 최고 점수 학생 찾기 ===
        System.out.println("\n=== 최고 점수 학생 ===");
        Student best = students[0];
        for (Student s : students) {
            if (s.score > best.score) {
                best = s;
            }
        }
        System.out.println("1등: " + best.name + " (" + best.score + "점)");
    }
}
