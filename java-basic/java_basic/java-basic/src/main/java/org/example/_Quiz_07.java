package org.example;

/**
 * 문제: Class를 이용하여 햄버거를 자동으로 만드는 프로그램을 작성하시오
 * 조건:
 * 1. 햄버거의 종류는 햄버거, 치즈버거, 새우버거 3가지
 * 2. 각 버거는 각각의 클래스로 생성
 * 3. 버거 이름을 담기 위한 name 변수 정의
 * 4. 재료 정보를 표시하는 cook() 메소드 정의
 * 5. 공통 부분은 상속 및 메소드 오버라이딩으로 처리
 * 6. 모든 클래스는 하나의 파일에 정의
 * 7. 각 버거의 재료 정보:
 * - 햄버거: 양상추, 패티, 피클
 * - 치즈버거: 양상추, 패티, 피클, 치즈
 * - 새우버거: 양상추, 패티, 피클, 새우
 *
 * 실행결과
 * 주문하신 메뉴를 만듭니다.
 * -------------------
 * 햄버거를 만듭니다.
 * 빵 사이에 들어가는 재료는?
 * > 양상추
 * + 패티
 * + 피클
 * -------------------
 * 치즈버거를 만듭니다.
 * 빵 사이에 들어가는 재료는?
 * > 양상추
 * + 패티
 * + 피클
 * + 치즈
 * -------------------
 * 새우버거를 만듭니다.
 * 빵 사이에 들어가는 재료는?
 * > 양상추
 * + 패티
 * + 피클
 * + 새우
 * -------------------
 * 메뉴 준비가 완료 되었습니다.
 */
public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new Cheeseberger();
        hamBurgers[2] = new ShrimpBuger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-------------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("-------------------");
        }
        System.out.println("메뉴 준비가 완료 되었습니다.");
    }
}

class HamBurger {
    public String name;

    public HamBurger() {
        this("햄버거");
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class Cheeseberger extends HamBurger {
    public Cheeseberger() {
        super("치즈버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class ShrimpBuger extends HamBurger {
    public ShrimpBuger() {
        super("새우버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}