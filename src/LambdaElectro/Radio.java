package LambdaElectro;

public class Radio implements Electro{
    @Override
    public void padachaElectro() {
        start();
    }

    void start(){
        System.out.println("LambdaElectro.Radio  plays");
    }
}
