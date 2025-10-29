package DS.Week3;

public class App5 {

    public static void main(String[] args) {
        Plant p1 = new Plant();
        Tree t1 = new Tree();

        t1.grow();
        Tree t2 = new Plant();
    }

    //polymorphism = "many shapes"

}

class Plant extends Tree{
    @Override
    public void grow(){
        System.out.println("Plant growing...");
    }
}
class Tree{
    
    public void grow(){
        System.out.println("Tree growing...");
    }

    public void shedLeaves(){
        System.out.println("Tree shedding leaves...");
    }
}
