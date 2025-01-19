public class con_overloading {
    int rupees;
    con_overloading()
    {
        rupees = 0;

    }
    con_overloading(int x)
    {
        rupees = x;

    }
    con_overloading(int x, int y)
    {

    }
    public static void main(String[] args)
    {
        con_overloading tom = new con_overloading();
        con_overloading menuka = new con_overloading(20);
        System.out.println(tom.rupees);
        System.out.println(menuka.rupees);

    }
}
