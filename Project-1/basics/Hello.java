public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        double number = 10.098787;
        System.out.format("%.3f", number);
        System.out.println(Math.round(number * 100.0) / 100.0);
        double n = number;
        System.out.format("%.3f", n);

        System.out.println();
        String s = "Sai naveen";
        System.out.println(s.replace('S', 's'));
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('S'));
        int a = 10;
        int b=20;
        System.out.println(a+b);
    }
}