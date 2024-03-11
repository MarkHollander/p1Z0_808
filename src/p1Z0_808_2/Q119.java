package p1Z0_808_2;

public class Q119 extends Tool implements Exportable {
    public void export() {
        System.out.println("Tool::export");
    }
    public static void main(String[] args) {
        Tool aTool = new Q119();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }

    public static void callExport(Exportable ex) {
        ex.export();
    }
    
}
