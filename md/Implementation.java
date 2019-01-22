package md;

public class Implementation implements Interface, Interface2 {
    public Implementation() {
        System.out.print("Implementation ");
    }
    public Implementation(int age) {
        System.out.print("Implementation age ");
    }
    public boolean method () {
        return false;
    }
    public static void main(String[] args) {
        Interface in = new Implementation();
        Interface2 in2 = new Implementation();
        Interface2 in22 = new Impl2();
        System.out.println(in.method());
        System.out.println(in2.method());
        System.out.println(in22.method());
    }
}

interface Interface {
    public boolean method();
}

interface Interface2 {
    default public boolean method() {
        return true;
    }
}

class Impl2 implements Interface2//, Interface
{

}
