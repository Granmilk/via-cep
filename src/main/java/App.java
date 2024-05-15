import com.gtbr.ViaCepClient;
import com.gtbr.domain.Cep;

public class App {
  public static void main(String[] args) {
    Cep cep = ViaCepClient.findCep("30130010");

    System.out.println("\nResultado do consumo da API: " + cep.toString());
    System.out.println("\nAcessando elementos do objeto: ");
    System.out.println("CEP: " + cep.getLogradouro());
    System.out.println("Logradouro: " + cep.getLogradouro());
    System.out.println("Bairro: " + cep.getLogradouro());
    System.out.println("Localidade: " + cep.getLogradouro());
  }
}
