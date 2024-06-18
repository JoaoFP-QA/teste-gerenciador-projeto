package testecucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PreencheCampos extends BasePage {
	
	private By localizadorNome = By.id("name");
	private By localizadorOrcamento = By.id("budget");
	private By localizadorTipoCategoria = By.id("category_id");

	public PreencheCampos(WebDriver navegador) {
		super(navegador);
		
	}
	
	public void cadastroProjeto (String nome, String budget, String tipoCategoria) {
		
		navegador.findElement(localizadorNome).sendKeys(nome);
		navegador.findElement(localizadorOrcamento).sendKeys(budget);
		
		WebElement dropdownTipoCategoria = navegador.findElement(localizadorTipoCategoria);
        Select selectTipoCategoria = new Select(dropdownTipoCategoria);
        selectTipoCategoria.selectByValue(tipoCategoria);
		
	}
	
}
