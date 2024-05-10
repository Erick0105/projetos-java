package models;

public class Segurado extends Veiculo implements ISeguroService{


    //Atributos
    private double seguro;


    //Getters e Setters
    public double getSeguro() {
        return seguro;
    }
    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }


    //Metodos
    public Segurado (double seguro){
        this.seguro = seguro;
    }

    @Override
    public double doDesconto(){
        return super.doTotal() * seguro /100;
    }

    @Override
    public double doTotal() {
        return super.doTotal() - doDesconto();
    }

    @Override
    public String doViewCupom() {
        return super.doViewCupom() + "\nValor de Desconto: R$" + this.doDesconto() +
                "\nNovo valor total a ser pago: R$" + this.doTotal();
    }
}