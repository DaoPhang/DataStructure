package DS.Week1;

public class Practice2 {
    public static void main(String[] args){
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bobby");
        Machine machine3 = new Machine("Champ", 112);

        System.out.println(machine1);
        System.out.println(machine2);
        System.out.println(machine3);
    }
}

class Machine{
    String name;
    int serialNum;
    
    public Machine() {
    }

    public Machine(String name) {
        this.name = name;
    }

    public Machine(String name, int serialNum) {
        this.name = name;
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

}