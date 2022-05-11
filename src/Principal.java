import java.util.Date;

public class Principal {

    public static void main(String[] args){
        Endereco endereco1 = new Endereco("Av Cristovão Colombo",940,"401","Floresta", "Porto Alegre", "90560000");
        Endereco endereco2 = new Endereco("Av França",840,"1","Navegantes", "Porto Alegre", "90230030");
        System.out.println(endereco1);

        Corretor corretor1 = new Corretor("Roberto", "1", "981047729", endereco1, "99.999", 0.7);
        System.out.println(corretor1);

        Cliente pessoa1 = new Cliente("José", "2", "987564422", endereco2, 1000);
        System.out.println(pessoa1);

        Date data = new Date();

        Imovel imovel1 = new Imovel(true, 700, "2903", endereco1);
        System.out.println(imovel1);

        Anuncio anuncio1 = new Anuncio(pessoa1, imovel1, corretor1, 500, data);
        System.out.println(anuncio1);

        Aluguel aluguel1 = new Aluguel(1200, 2026, data, 202, new double[]{100,100,100,100,100,100,100,100,100,100,100,100});
        System.out.println(aluguel1);

    }

}
