public class static2 {
    static String name;
    static String name2;
    static String name3;


    static void call(){
        System.out.println("take a call from "+name);
    }
    static void call2(){
        System.out.println("take a call from "+name2);
    }
    static void call3(){
        System.out.println("take a call from "+name3);
    }
    public static void main(String args[])
    {
        name = "nokiya";
        name2 = "apple";
        name3 = "ztc";
        call();
        call2();
        call3();


    }
}
