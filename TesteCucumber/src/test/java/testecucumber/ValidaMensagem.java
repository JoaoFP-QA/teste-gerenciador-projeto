package testecucumber;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.*;

public class ValidaMensagem extends BasePage {

	

	public ValidaMensagem(WebDriver navegador) {
		super(navegador);

	}

	public String mensagemDeSucessoCriar() {
		return navegador.findElement(By.xpath("//*[contains(text(), 'Projeto Criado com sucesso!')]")).getText();
	}
	
	public void ImprimirEvidencia() throws IOException{
		File printFinal = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(printFinal, new File("Target/evidencia.png"));
        
	}

}
