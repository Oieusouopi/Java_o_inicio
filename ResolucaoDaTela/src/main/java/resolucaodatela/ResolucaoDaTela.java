package resolucaodatela;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucao = toolkit.getScreenSize();
        System.out.println("Resolução da tela:");
        System.out.print(resolucao.height + "x" + resolucao.width);
    }
}
