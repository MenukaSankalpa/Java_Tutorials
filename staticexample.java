public class staticexample {

    int x;
    static int y;

    static void meth1() {

    }
    static void meth2(){

    }

    public static void main(String[] args)
    {
        x = 4;
        y = 5;
        meth1();
        meth2();

        staticexample obj = new staticexample();
        obj.x=4;
        obj.meth1();

    }
}