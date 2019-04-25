package br.edu.unifacear.projetointegrador3.telas;

import java.util.HashMap;
import java.util.List;

import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;
import br.edu.unifacear.projetointegrador3.entidade.Usuario;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Main extends Application {

	@FXML TextField login;
	@FXML TextField senha;
	private Usuario usuarioLogado = null;
	
	@FXML public void logar(ActionEvent event) {
		String txtLogin = login.getText();
		String txtSenha = senha.getText();
		
		Dao<Usuario> daoUsuario = new GenericDao<>();
		
		HashMap<String,Object> argumentos = new HashMap<>();
		argumentos.put("login", txtLogin);
		argumentos.put("senha", txtSenha);
		
		List<Usuario> usuarios = daoUsuario.listarWhere(Usuario.class, 
				"where t.login = :login and t.senha = :senha", 
				argumentos);
		
		if (usuarios.size() > 0) {
			usuarioLogado = usuarios.get(0);
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Alerta");
			alert.setHeaderText(null);
			alert.setContentText("Login ou senha inválido!");

			alert.showAndWait();
		}
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new 
					FXMLLoader(getClass().
							getResource("/br/edu/unifacear/projetointegrador3/view/Main.fxml"));

			Scene scene = new Scene(loader.load());

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
