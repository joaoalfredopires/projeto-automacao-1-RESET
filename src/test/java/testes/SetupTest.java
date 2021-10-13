package testes;

import org.junit.Test;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTestes{

    @Test
    public void testOpeningBrowserandLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e abrimos a URL");
    }
}
