public class Imovel {
    private boolean status;
    private double valorAluguel;
    private String registro;
    private Endereco endereco;

    public Imovel(boolean status, double valorAluguel, String registro, Endereco endereco){
        this.status = status;
        this.valorAluguel = valorAluguel;
        this.registro = registro;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getRegistro() {
        return registro;
    }

    public boolean isStatus() {
        return status;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
