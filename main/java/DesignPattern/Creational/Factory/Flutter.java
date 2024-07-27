package DesignPattern.Creational.Factory;

public class Flutter {
    void refresh(){
        System.out.println("Refresh !");
    }

    //violation of SRP, OCP
    UiFactory getUiFactory(String os){
        if(os.equals("Android")){
            return new AndroidUiFactory();
        }
        else if(os.equals("Ios")){
            return new IosUiFactory();
        }else{
            return null;
        }
    }
}
