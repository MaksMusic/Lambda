package LambdaElectro;

public class Lano implements Electro{

    @Override
    public void padachaElectro() {
        startOn();
    }

    public void startOn(){
        System.out.println("Lamp on");
    }
}
