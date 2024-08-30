public class ConvertDataType {
    static short methodOne(long l)
    {
        System.out.println(l);
        int i = (int) l;
        System.out.println(i);
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        System.out.println(d);
        float f = (float) d;
        System.out.println(f);
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
