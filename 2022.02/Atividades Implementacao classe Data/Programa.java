public class Programa {
    public static void main(String[] args) {
        Data d1 = new Data(24,04,2000);
        Data d2 = new Data(25,04,2002);
        Data d3 = new Data(26,04,2001);
        System.out.println("===========================================================================================");
        d1.normalData();
        d2.normalData();
        d3.normalData();
        System.out.println("===========================================================================================");
        d1.parametro(d2);
        d2.parametro(d2);
        d3.parametro(d2);
        System.out.println("===========================================================================================");
        d1.isBissexto();
        d2.isBissexto();
        d3.isBissexto();
        System.out.println("===========================================================================================");
        System.out.println(d1.mesExtenso(d1));
        System.out.println(d2.mesExtenso(d2));
        System.out.println(d3.mesExtenso(d3));


    }
}
