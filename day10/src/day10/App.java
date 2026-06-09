package day10;

public class App {
    public static void main(String[] args) {

        Player machine = new MachinePlayer("터미네이터");
        Player human = new HumanPlayer("황기태");

        String m = machine.turn();
        String h = human.turn();

        System.out.println(machine.getName() + ":" + m + ", "
                + human.getName() + ":" + h);

        //기계승
        if (m.equals(h)) {
            System.out.println(machine.getName() + " 승리!");
        }
        //인간승
        else if (
                (h.equals("가위") && m.equals("보")) ||
                (h.equals("바위") && m.equals("가위")) ||
                (h.equals("보") && m.equals("바위"))
        ) {
            System.out.println(human.getName() + " 승리!");
        }
        //그외는기계승
        else {
            System.out.println(machine.getName() + " 승리!");
        }
    }
}
