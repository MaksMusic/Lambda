package Lambda1;

public class MAin {
    public static void main(String[] args) {
        //вариант 1 создание класса аноним
        AnonimClass anonimClass = new AnonimClass();

        Auto auto = new Auto();
        auto.labda(anonimClass);

        //вариант 2 анонимный класс (без класса аноним) но с переопределение метода
        auto.labda(new Fun() {
            @Override
            public double one() {
                return 2.0;
            }
        });
        //вариант 3
        auto.labda(() -> 7.7);






        ///////////////////////////////////////////////////////////////////////////////////////
        AnonimClass2 anonimClass2 = new AnonimClass2();

        //вариант 1 создание класса аноним
        auto.labda2(anonimClass2);

        //вариант 2 анонимный класс (без класса аноним) но с переопределение метода
        auto.labda2(new Fun2() {
            @Override
            public void two(int n, int n2) {
                System.out.println(n*n2);
            }
        });
        //вариант 3
        auto.labda2( (a,b) -> {
            System.out.println(a*b);

        });
        //или
        auto.labda2( (a,b) -> System.out.println(a*b));







    }


}
