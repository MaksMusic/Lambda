package LambdaElectro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // создание кнопки
        Butten butten = new Butten();
        //создание електроприборов
        Lano lano = new Lano();
        Radio radio = new Radio();


        //Подписка на слушателя одного прибора
        butten.electro = lano;
        butten.onOne();



        //Подписка на слушателя множества приборов
        butten.addElecroPribor(lano);
        butten.addElecroPribor(radio);
        //запуск всех подписанных приборов (запуск все приборов в листе)
        butten.on();

        //Отписка от слушателя
        butten.remuveElecroPribor(lano);


        // Anonim class -----------------------------------------------------------------------
        butten.addElecroPribor(new Electro() {
            @Override
            public void padachaElectro() {
                System.out.println("Сигнализация");
            }
        });
        // Lambda function -----------------------------------------------------------------------
        butten.addElecroPribor( () -> System.out.println("Tv on") );
        // Lambda function -----------------------------------------------------------------------
        butten.addElecroPribor( () -> System.out.println("Pk on") );
        // Lambda function -----------------------------------------------------------------------
        List<Integer> n = new ArrayList();
        n.add(2);
        n.add(5);
        n.add(4);
        n.add(5);
        // Lambda function ----------------------------------------------------------------------
      butten.addElecroPribor55( (b , h ) -> b + h   );


    }
}
