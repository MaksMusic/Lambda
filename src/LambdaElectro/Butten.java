package LambdaElectro;

import java.util.ArrayList;
import java.util.List;

public class Butten {

    Electro electro;
    private final List<Electro> electrolist  = new ArrayList();



    public void get(Butten butten){
        butten.on();

    }
    public int fun (List<Integer> list)  { //приниает лист и возвращает среднее статистическое
        int v = 0;
        for (int n : list){
            v+=n;
        }
     return v/ list.size();
    }


    void onOne(){
        if (electro!=null){
            electro.padachaElectro();
        }

    }


    void on(){ // запуск всех устройсв в листе
        for (Electro it :electrolist){
            if (it!=null){
                it.padachaElectro();
            }

        }

    }
    void addElecroPribor(Electro electro){
        electrolist.add(electro);
    }
    void remuveElecroPribor(Electro electro){
        electrolist.remove(electro);
    }

    void addElecroPribor55(Batarey batarey){

    }

}
