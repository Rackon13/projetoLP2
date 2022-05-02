import java.util.Date;

public class Anuncio {
    private Pessoa locatario;
    private Imovel imovel;
    private Corretor corretor ;
    private double valor;
    private Date data;

    public Anuncio(Pessoa locatario, Imovel imovel, Corretor corretor, double valor, Date data){
        this.locatario = locatario;
        this.imovel = imovel;
        this.corretor = corretor;
        this.valor = valor;
        this.data = data;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Pessoa getLocatario() {
        return locatario;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public void setLocatario(Pessoa locatario) {
        this.locatario = locatario;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
