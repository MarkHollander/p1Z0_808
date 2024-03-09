package p1Z0_808_2;

public class Q103 {
    String name;
    int age = 25;

    public Q103(String name) {
        this(); // line n1
        setName(name);
    }

    public Q103(String name, int age) {
        Q103(name); // line n2
        setAge(age);
    }

    public String show() {
        return name + " " + age + " ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }   

    public static void main(String[] args) {
        Q103 p1 = new Q103("Jesse");
        Q103 p2 = new Q103("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }   
}
