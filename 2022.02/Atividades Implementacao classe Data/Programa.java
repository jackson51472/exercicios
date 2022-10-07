public class Programa {
    public static void main(String[] args) {
        Data d1 = new Data(24,04,2000);
        Data d2 = new Data(25,04,2002);
        Data d3 = new Data(26,04,2002);
        System.out.println("===========================================================================================");
        d1.normalData();
        d2.normalData();
        d3.normalData();
        System.out.println("===========================================================================================");
        d1.parametro();
        d2.parametro();
        d3.parametro();
        System.out.println("===========================================================================================");
        d1.isBissexto();
        d2.isBissexto();
        d3.isBissexto();


    }
}
