public class staticexample {

    int x;
    static int y;
    void meth1() {

    }
    static void meth2(){

    }
    public static void main(String[] args)
    {
        y = 5;
        meth2();

        staticexample obj = new staticexample();
        obj.x = 4;
        obj.meth1();

    }
}
