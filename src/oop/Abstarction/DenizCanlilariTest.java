package oop.Abstarction;

abstract class DenizCanlilari {

    public abstract void yuzme();
    public void beslenme(){
        System.out.println("Deniz canlilari beslenir.");
    }
}

class Ahtapot extends DenizCanlilari{
    @Override
    public void yuzme() {
        System.out.println("Ahtapotlar kollari sayesinde suda hizli yuzer.");
    }
        }
        class Balina extends DenizCanlilari{
    @Override
    public void yuzme() {
        System.out.println("Balinlar suda yavas yuzer.");
    }
        }
        public class DenizCanlilariTest {

    public static void main(String[] args) {

        DenizCanlilari ahtapot=new Ahtapot();
        DenizCanlilari balina=new Balina();

        ahtapot.yuzme();
        ahtapot.beslenme();

        balina.yuzme();
        balina.beslenme();
    }
        }
