package testecucumber;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TesteInicial {

	WebDriver navegador;
	HomePage homePage;
	PreencheCampos preencheCampos;
	ValidaMensagem validaMensagem;
	
	
	
	
	

	@Dado("que acesso o site")
	public void que_acesso_o_site() {
		WebDriverManager.chromedriver().setup();
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		homePage = new HomePage(navegador);
		homePage.acessarPagina();
		

	}

	@E("clico no botão criar projeto")
	public void clico_no_botão_criar_projeto() {
		preencheCampos = new PreencheCampos(navegador);
		homePage.acessarPaginaProjeto();

	}

	@E("preencho todos os campos")
	public void preencho_todos_os_campos() {
		preencheCampos = new PreencheCampos(navegador);
		preencheCampos.cadastroProjeto("teste", "50000", "2");

	}

	@Quando("clico em criar projeto")
	public void clico_em_criar_projeto() {
		validaMensagem =new ValidaMensagem(navegador);
		homePage.botaoCriarProjeto();
		
		

	}

	@Então("meu projeto é criado")
	public void meu_projeto_é_criado() {
		String mensagemDeSucesso = validaMensagem.mensagemDeSucessoCriar();
		Assertions.assertEquals("Projeto Criado com sucesso!", mensagemDeSucesso);
		
		

	}

	

}
