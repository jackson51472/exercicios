public class Data {
    private int dia;
    private int mes;
    private int ano;


    public Data(int dia, int mes, int ano){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);


        if (ano < 1900 || ano > 2022) {
            this.ano = 01;
            this.dia = 01;
            this.mes = 0001;
        }
        if (mes < 1 || mes > 12) {
            this.ano = 01;
            this.dia = 01;
            this.mes = 0001;
        }

        if (this.mes == 01 || this.mes == 03 || this.mes == 05 || this.mes == 07 || this.mes == 8 || this.mes == 10 || this.mes ==12) {

            if (this.dia < 01 || this.dia > 31) {
                this.ano = 01;
                this.dia = 01;
                this.mes = 0001;
            }
        }
        if (this.mes == 04 || this.mes == 06 || this.mes == 9 || this.mes == 11) {

            if (this.dia < 01 || this.dia > 30){
                this.ano = 01;
                this.dia = 01;
                this.mes = 0001;
            }
        }
        if (mes == 2) {

            if (this.dia < 01 || this.dia > 29){
                this.ano = 01;
                this.dia = 01;
                this.mes = 0001;
            }
        }
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void parametro(){
        boolean menos = false;
        boolean mais = false;
        boolean zero = true;

        if (this.ano != 2002){
            if (this.ano < 2002){
                menos = true;
                zero = false;
            }
            if (this.ano > 2002){
                mais = true;
                zero = false;
            }
        }

        if (zero == true) {
            if (this.mes != 04){
                if (this.mes < 04){
                    menos = true;
                    zero = false;
                }
                if (this.mes > 04){
                    mais = true;
                    zero = false;
                }
            }
        }

        if (zero == true){
            if (this.dia != 25){
                if (this.dia < 25){
                    menos = true;
                    zero = false;
                }
                if (this.dia > 25){
                    menos = true;
                    zero = false;
                }
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

}
