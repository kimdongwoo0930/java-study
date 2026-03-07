// Day 8: 접근제어자 (Access Modifiers)
// public > protected > (default) > private

class BankAccount {

    // private: 이 클래스 내부에서만 접근 가능
    private String owner;
    private double balance;

    // public: 어디서든 접근 가능
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // public getter: private 필드를 외부에 읽기 전용으로 공개
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // public 메서드: 외부에서 balance를 안전하게 변경
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원 입금 → 잔액: " + balance + "원");
        } else {
            System.out.println("입금액은 0보다 커야 합니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원 출금 → 잔액: " + balance + "원");
        } else {
            System.out.println("출금 불가: 잔액 부족 또는 잘못된 금액");
        }
    }
}

// 상속 관계에서 protected 확인
class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String owner, double balance, double interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        // private 필드 balance는 자식도 직접 접근 불가 → getter 사용
        double interest = getBalance() * interestRate / 100;
        deposit(interest); // public 메서드는 사용 가능
        System.out.println("이자율 " + interestRate + "% 적용 완료");
    }
}

public class AccessModifier {
    public static void main(String[] args) {

        System.out.println("===== 접근제어자 예제 =====\n");

        BankAccount account = new BankAccount("홍길동", 10000);

        // account.balance = 99999; // 에러! private 필드 직접 접근 불가
        // account.owner = "해커"; // 에러!

        System.out.println("예금주: " + account.getOwner());
        System.out.println("잔액: " + account.getBalance() + "원\n");

        account.deposit(5000);
        account.withdraw(3000);
        account.withdraw(20000); // 잔액 부족

        System.out.println("\n===== 상속 + 접근제어자 =====\n");

        SavingsAccount savings = new SavingsAccount("김철수", 100000, 3.5);
        System.out.println("예금주: " + savings.getOwner());
        System.out.println("잔액: " + savings.getBalance() + "원");
        savings.applyInterest();
        System.out.println("이자 적용 후 잔액: " + savings.getBalance() + "원");

        System.out.println("\n===== 접근제어자 정리 =====");
        System.out.println("private   : 해당 클래스 내부에서만 접근 가능");
        System.out.println("(default) : 같은 패키지 내에서만 접근 가능");
        System.out.println("protected : 같은 패키지 + 자식 클래스에서 접근 가능");
        System.out.println("public    : 어디서든 접근 가능");
    }
}
