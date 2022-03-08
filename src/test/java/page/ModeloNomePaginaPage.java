package page;

import core.BasePage;
import core.DriverFactory;

public class ModeloNomePaginaPage extends BasePage {

    public void acessarTelaInicial() {
        DriverFactory.getDriver().navigate().to("");
    }

}
