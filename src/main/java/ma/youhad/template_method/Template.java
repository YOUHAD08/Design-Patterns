package ma.youhad.template_method;

public abstract class Template {
    public double ComputeTemplate(double a, double b) {
        double data = a*b;
        int params = detail_1(data);
        double  Sum = b;
        for (int i = 1; i <= params; i++) {
            double value = detail_2(a,b,params);
            Sum += value;
        }
        return Sum;
    }

    protected abstract int detail_1(double a);
    protected abstract double detail_2(double a,double b,double params);
}
