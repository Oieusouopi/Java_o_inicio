package linguagemdosistema;
import java.util.Locale;

public class LinguagemDoSistema {

    public static void main(String[] args) {
      Locale local = Locale.getDefault();
      System.out.println("Linguagem do sistema:");
      System.out.print(local.getDisplayLanguage());
    }
}
