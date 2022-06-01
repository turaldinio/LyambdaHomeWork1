public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        /*
        ошибка деления на 0, b=0, c=3/0
        решение добавить блок try/cath
        b=calc.minus.apply(2,1)
         */

        calc.println.accept(c);
    }
}
