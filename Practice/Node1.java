package DS.Practice;

public class Node1 {
    int data;
    Node1 nextNode1;
    
    public Node1(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node1 getNextNode1() {
        return nextNode1;
    }
    public void setNextNode1(Node1 nextNode1) {
        this.nextNode1 = nextNode1;
    }

    @Override
    public String toString(){
        return "Data: " + data;
    }
}
