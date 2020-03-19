package springhw.Printer;

import springhw.beans.HelloBean;

public class Printer
{
    private static Printer InitPrinter;

    public static Printer getInitPrinter()
    {
        if (null == InitPrinter)
        {
            InitPrinter = new Printer();
        }
        return InitPrinter;
    }
    private Printer()
    {
        super();
    }
    public void print(HelloBean hb)
    {
        System.out.println(hb);
    }
}
