package p1Z0_808_2;

interface Exportable {
    void export();
}

public class Tool implements Exportable{
    
    protected void export() { // line n1
        System.out.println("Tool::export");
    }
    
    public static void main(String[] args) {
        Tool aTool = new Tool();
        aTool.export();
    }
}
