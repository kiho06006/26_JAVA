package day10;

import java.util.Scanner;

abstract class Player {
    protected String shape[] = {"가위", "바위", "보"};
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public String turn();
}

// 기계
class MachinePlayer extends Player {

    public MachinePlayer(String name) {
        super(name);
    }

    public String turn() { 
        return shape[(int)(Math.random() * 3)];
    }
}

// 사람
class HumanPlayer extends Player {
    Scanner sc = new Scanner(System.in);

    public HumanPlayer(String name) {
        super(name);
    }

    public String turn() {
        System.out.print("가위, 바위, 보 입력 >> ");
        return sc.next();
    }
}
