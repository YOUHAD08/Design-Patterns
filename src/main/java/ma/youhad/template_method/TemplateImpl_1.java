package ma.youhad.template_method;

public class TemplateImpl_1 extends Template {
    @Override
    protected int detail_1(double a) {
        return (int) (Math.sqrt(a));
    }

    @Override
    protected double detail_2(double a, double b, double params) {
        double x=a/b*params;
        return x+params;
    }
}
