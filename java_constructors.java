public class java_constructors {
    String name;
    java_constructors()
    {
        name = "Sham";
        System.out.println("Welcome tom");
    }
    void meth()
    {
        System.out.println("Hello tom");

    }

    public static void main(String[] args)
    {
        java_constructors obj = new java_constructors();
        obj.meth();
        System.out.println(obj.name);


    }

}
