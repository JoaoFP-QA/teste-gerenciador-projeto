package testecucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage{

	public HomePage(WebDriver navegador) {
		super(navegador);
		
	}
	
	public void acessarPagina() {
		navegador.get("http://localhost:3000/");
		
	}

	public void acessarPaginaProjeto() {
		navegador.findElement(By.className("LinkButton_btn__HyI2M")).click();
	}
    
	public void botaoCriarProjeto() {
		navegador.findElement(By.className("SubmitButton_btn__FdvaJ")).click();
	}
	
    
 
   
}