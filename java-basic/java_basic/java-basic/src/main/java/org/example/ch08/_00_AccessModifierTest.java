package org.example.ch08;

import org.example.ch07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
        // b1.resolution = "FHD"; // default: 같은 패키지 내에서만 접근 가능
        // b1.price = 200000; // private: 해당 클래스 내에서만 접근이 가능하다.
        // b1.color = "Black"; // protected: 같은 패키지 내에서는 접근이 가능하지만, 다른 패키지인 경우에는 자식 클래스에서 접근이 가능하다.

    }
}
