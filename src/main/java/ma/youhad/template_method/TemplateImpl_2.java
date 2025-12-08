package ma.youhad.template_method;

public class TemplateImpl_2 extends Template {
    @Override
    protected int detail_1(double a) {
        return (int) (Math.atan(a));
    }

    @Override
    protected double detail_2(double a, double b, double params) {
        return 0;
    }
}
