public class Cliente extends Pessoa {
    private double seguroFianca;

    public Cliente(String nome, String registro, String telefone,Endereco endereco, double seguroFianca){
        super(nome,registro,telefone,endereco);
        this.seguroFianca = seguroFianca;
    }

    public double getSeguroFianca() {
        return seguroFianca;
    }

    public void setSeguroFianca(double seguroFianca) {
        this.seguroFianca = seguroFianca;
    }
}
