package epam_pep_session2.epam_pep_session2;


public class Gulabjamun {

    public float emaxprice,eminprice,emaxweight,eminweight;//expected weight and price weight in grams and price in rupees
    public Gulabjamun(float a,float b,float c,float d)
    {
        emaxprice=a;
        eminprice=b;
        emaxweight=c;
        eminweight=d;
    }
    public Gulabjamun()
    {
        emaxprice=0;
        eminprice=0;
        emaxweight=0;
        eminweight=0;
    }
    public static void main(String a[]){}
    public float getemaxprice()
    {
        return emaxprice;
    }
    public float geteminprice()
    {
        return eminprice;
    }
    public float getemaxweight()
    {
        return emaxweight;
    }
    public float geteminweight()
    {
        return eminweight;
    }
}
