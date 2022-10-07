public class Data {
    private int dia;
    private int mes;
    private int ano;

    private String[] nomeMes = {"Janeiro" ,"Fevereiro" ,"Março" ,"Abril" ,"Maio" ,"Junho" ,"Julho" ,"Agosto" ,"Setembro" ,"Outubro" ,"Novembro" ,"Dezembro"};


    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (isValida() == false){
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
    }
    public boolean  isValida(){
    return (isAno() && isMes() && isDia());
    }

    public boolean isAno(){
        if (ano < 1900 || ano > 2022) {

                return false;
        }
        return true;
    }

    public boolean isMes(){
        if (mes < 1 || mes > 12) {
            return false;
        }
        return true;
    }
    public boolean isDia(){
        if (this.mes == 01 || this.mes == 03 || this.mes == 05 || this.mes == 07 || this.mes == 8 || this.mes == 10 || this.mes ==12) {
            if (this.dia < 01 || this.dia > 31) {
                return false;
            }
        }

        if (this.mes == 04 || this.mes == 06 || this.mes == 9 || this.mes == 11) {
            if (this.dia < 01 || this.dia > 30){
                return false;
            }
        }

        if (mes == 2) {
            if (this.dia < 01 || this.dia > 29){
                return false;
            }
        }
        return true;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void parametro(Data x){
        boolean menos = false;
        boolean mais = false;
        boolean zero = true;

        if (this.ano != x.ano){
            if (this.ano < x.ano){
                menos = true;
                zero = false;
            }
            if (this.ano > x.ano){
                mais = true;
                zero = false;
            }
        }

        if (zero == true) {
            if (this.mes != x.mes){
                if (this.mes < x.mes){
                    menos = true;
                    zero = false;
                }
                if (this.mes > x.mes){
                    mais = true;
                    zero = false;
                }
            }
        }

        if (zero == true){
            if (this.dia != x.dia){
                menos = false;
                zero = true;
            }
            if (this.dia < x.dia){
                menos = true;
                zero = false;
            }
            if (this.dia > x.dia){
                mais = true;
                zero = false;
                }
            }


        if (zero == true)
            System.out.println("0");
        if (menos == true)
            System.out.println("-1");
        if (mais == true)
            System.out.println("1");

    }
    public void isBissexto(){
        int bi;

        bi = this.ano % 4;

        if (bi != 0)
            System.out.println("Não Bissexto.");
        else
            System.out.println("Bissexto.");
    }
    public void normalData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public String mesExtenso (Data x){
        return nomeMes[x.mes - 1];
    }

}
