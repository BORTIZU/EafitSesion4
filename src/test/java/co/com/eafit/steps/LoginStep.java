package co.com.eafit.steps;

import co.com.eafit.pageobject.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
	
LoginPage loginPage;
@Step
	public void AbrirPagina() {
		// TODO Auto-generated method stub
	loginPage.open();
		
	}
@Step
public void IngresarCredenciales(String user, String pass) {
	// TODO Auto-generated method stub
	loginPage.realizarLogin(user, pass);
	
}
public void verificarTitulo(String tituloPagina) {
	loginPage.AccesoExitoso(tituloPagina);
	
}

}
