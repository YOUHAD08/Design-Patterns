package ma.youhad.template_method;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        System.out.println("---------Template Pattern With Implementation 1 ------");
        Template template = new TemplateImpl_1();
        System.out.println(template.ComputeTemplate(10,20));

        System.out.println("---------Template Pattern With Implementation 2 ------");
        template = new TemplateImpl_2();
        System.out.println(template.ComputeTemplate(1,2));

    }
}
