public class Taylor {
    public static double calc(double x,int k)
    {
        double sum=1.0;
        double m=0.5;
        double step=1.0;
        int i=1;
        do
        {
            step=step*(m-i+1)*x/i;
            sum+=step;
            i++;
        }
        while (Math.abs(step)>Math.pow(10, -1 * k));
        return sum;
    }
}
