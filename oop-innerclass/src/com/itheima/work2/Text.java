package com.itheima.work2;

public class Text {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        NewPhone np = new NewPhone();

        op.call();
        op.send();
        System.out.println("-------------------------------------------------");
        np.call();
        np.send();
        np.PlayGame();
    }
}
