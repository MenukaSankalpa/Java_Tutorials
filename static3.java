public class static3 {


    void call(String name)
    {
        System.out.println("take a call from "+name);
    }
    public static void main(String[] args)
    {
        Test phone1 = new Test();
        Test phone2 = new Test();
        Test phone3 = new Test();
        phone1.call("nokia");

    }
}


