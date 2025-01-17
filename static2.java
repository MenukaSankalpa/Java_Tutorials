public class static2 {
    static String name;

    static void call(){
        System.out.println("take a call from "+name);
    }
    public static void main(String args[])
    {
        name = "nokiya";
        call();

    }
}
