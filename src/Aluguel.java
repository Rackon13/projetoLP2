import java.util.Date;

public class Aluguel {
    private double valorAcertado;
    private int vencimento;
    private Date validadeContrato;
    private int numeroContrato;
    private double pagamentosMensais;

    public Aluguel(double valorAcertado, int vencimento, Date validadeContrato, int numeroContrato, double pagamentosMensais){
        this.valorAcertado = valorAcertado;
        this.vencimento = vencimento;
        this.validadeContrato = validadeContrato;
        this.numeroContrato = numeroContrato;
        this.pagamentosMensais = pagamentosMensais;
    }

    public Date getValidadeContrato() {
        return validadeContrato;
    }

    public double getValorAcertado() {
        return valorAcertado;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public void setValidadeContrato(Date validadeContrato) {
        this.validadeContrato = validadeContrato;
    }

    public void setValorAcertado(double valorAcertado) {
        this.valorAcertado = valorAcertado;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }
}

