public class Corretor extends Pessoa{
    private String creci;
    private double taxaCorretagem;

    public Corretor(String nome, String registro, String telefone,Endereco endereco, String creci, double taxaCorretagem){
        super(nome,registro,telefone,endereco);
        this.creci = creci;
        this.taxaCorretagem = taxaCorretagem;
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public double getTaxaCorretagem() {
        return taxaCorretagem;
    }

    public void setTaxaCorretagem(double taxaCorretagem) {
        this.taxaCorretagem = taxaCorretagem;
    }

    public String toString(){
        return super.toString() + "\nCreci: " + creci + "\nTaxa Corretagem: " + taxaCorretagem;
    }
}
