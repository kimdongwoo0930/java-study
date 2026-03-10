// Day 9: 추상 클래스 (Abstract Class)
// "공통 기능은 여기서 구현하고, 세부 구현은 자식에게 맡긴다"

// ============================================================
// === 1. 추상 클래스란? ===
// ============================================================
// - abstract 키워드 사용
// - 직접 객체 생성 불가 (new AbstractClass() 에러!)
// - 추상 메서드(abstract): 선언만, 구현은 자식에서 반드시 해야 함
// - 일반 메서드도 가질 수 있음 (인터페이스와의 차이)
// - 필드(인스턴스 변수)도 가질 수 있음 (인터페이스와의 차이)

abstract class Employee {

    // 필드: 추상 클래스는 인스턴스 변수 가능
    protected String name;
    protected int workDays; // 이번 달 근무일수

    public Employee(String name, int workDays) {
        this.name = name;
        this.workDays = workDays;
    }

    // 추상 메서드: 구현 없이 선언만
    // → 자식 클래스에서 반드시 @Override 해야 함
    public abstract double calculateSalary(); // 급여 계산 방식이 직군마다 다름
    public abstract String getJobTitle();     // 직함도 직군마다 다름

    // 일반 메서드: 공통 로직은 여기서 구현
    public void printPayslip() {
        System.out.printf("[급여명세서] %s(%s) | 근무: %d일 | 급여: %.0f원%n",
            name, getJobTitle(), workDays, calculateSalary());
    }

    // 공통 메서드
    public String getName() { return name; }
}

// ============================================================
// === 2. 추상 클래스 상속 ===
// ============================================================
// 정규직: 월급제 (고정 월급)
class FullTimeEmployee extends Employee {
    private double monthlySalary; // 월 고정급

    public FullTimeEmployee(String name, int workDays, double monthlySalary) {
        super(name, workDays);
        this.monthlySalary = monthlySalary;
    }

    // 추상 메서드 반드시 구현
    @Override
    public double calculateSalary() {
        return monthlySalary; // 근무일수 관계없이 고정
    }

    @Override
    public String getJobTitle() {
        return "정규직";
    }
}

// 시급직: 시급 * 근무시간
class PartTimeEmployee extends Employee {
    private double hourlyWage;  // 시급
    private int hoursPerDay;    // 하루 근무 시간

    public PartTimeEmployee(String name, int workDays, double hourlyWage, int hoursPerDay) {
        super(name, workDays);
        this.hourlyWage = hourlyWage;
        this.hoursPerDay = hoursPerDay;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursPerDay * workDays;
    }

    @Override
    public String getJobTitle() {
        return "시급직";
    }
}

// 프리랜서: 건당 금액 * 완료 건수
class Freelancer extends Employee {
    private double ratePerProject; // 건당 금액
    private int projectsDone;      // 완료 건수

    public Freelancer(String name, int workDays, double ratePerProject, int projectsDone) {
        super(name, workDays);
        this.ratePerProject = ratePerProject;
        this.projectsDone = projectsDone;
    }

    @Override
    public double calculateSalary() {
        return ratePerProject * projectsDone;
    }

    @Override
    public String getJobTitle() {
        return "프리랜서";
    }
}

// ============================================================
// === 3. 인터페이스 + 추상클래스 함께 사용 ===
// ============================================================
interface Taxable {
    double TAX_RATE = 0.033; // 건강보험료율 3.3%

    double calculateTax();

    default void printTax() {
        System.out.printf("  └ 세금(3.3%%): %.0f원%n", calculateTax());
    }
}

// 추상 클래스 상속 + 인터페이스 구현 동시에
class SeniorEmployee extends FullTimeEmployee implements Taxable {

    public SeniorEmployee(String name, int workDays, double monthlySalary) {
        super(name, workDays, monthlySalary);
    }

    @Override
    public double calculateTax() {
        return calculateSalary() * TAX_RATE;
    }

    @Override
    public String getJobTitle() {
        return "시니어";
    }
}

public class AbstractBasic {
    public static void main(String[] args) {

        // new Employee("홍길동", 20); // 에러! 추상 클래스는 객체 생성 불가

        System.out.println("===== 추상 클래스 예제 =====\n");

        FullTimeEmployee ft = new FullTimeEmployee("김정규", 22, 3500000);
        PartTimeEmployee pt = new PartTimeEmployee("이시급", 20, 10000, 4);
        Freelancer fl = new Freelancer("박프리", 15, 500000, 8);
        SeniorEmployee sr = new SeniorEmployee("최시니어", 22, 6000000);

        ft.printPayslip();
        pt.printPayslip();
        fl.printPayslip();
        sr.printPayslip();
        sr.printTax(); // Taxable 인터페이스의 default 메서드

        // 추상 클래스 타입으로 다형성
        System.out.println("\n===== 다형성 배열 =====");
        Employee[] employees = { ft, pt, fl, sr };

        double totalSalary = 0;
        for (Employee e : employees) {
            totalSalary += e.calculateSalary();
        }
        System.out.printf("전체 급여 합계: %.0f원%n", totalSalary);

        // ============================================================
        // === 4. 인터페이스 vs 추상 클래스 비교 ===
        // ============================================================
        // ┌─────────────────┬──────────────────┬──────────────────┐
        // │                 │   인터페이스      │   추상 클래스    │
        // ├─────────────────┼──────────────────┼──────────────────┤
        // │ 키워드          │ interface        │ abstract class   │
        // │ 다중 구현/상속   │ 가능 (여러 개)    │ 불가 (하나만)    │
        // │ 인스턴스 변수    │ 불가             │ 가능             │
        // │ 생성자          │ 없음              │ 있음             │
        // │ 메서드 구현      │ default만 가능    │ 자유롭게 가능    │
        // │ 목적            │ 기능 규격 정의     │ 공통 구현 공유   │
        // └─────────────────┴──────────────────┴──────────────────┘
        //
        // 선택 기준:
        // - "이 기능을 반드시 구현해야 한다" → 인터페이스
        // - "공통 코드를 물려주고 싶다"     → 추상 클래스
    }
}
