public class Funcionario {

    private double salario;
    private int tempoEmpresa;
    private double comissao;

    private double vendas;

    public Funcionario( int tempo, double vendas){
        this.setTempoEmpresa(tempo);
        this.setVendas(vendas);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTempo() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(int tempo) {
        this.tempoEmpresa = tempo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {

        this.vendas = vendas;
    }
    public void definicoes(){
        if (tempoEmpresa <= 12)
            salario = 1500;
        if (tempoEmpresa == 24 || tempoEmpresa >= 13)
            salario = 2000;
        if (tempoEmpresa == 36 || tempoEmpresa >= 25)
            salario = 2500;
        if (tempoEmpresa >= 37)
            salario = 3000;

        if(vendas < 10000)
            comissao = 0.03;
        if (vendas > 10000 || vendas == 50000);
        comissao = 0.05;
        if (vendas > 50000)
            comissao = 0.10;

        double salarioFinal;
        salarioFinal = comissao * vendas;
        salarioFinal += salario;

        System.out.println(salarioFinal);
    }
}
