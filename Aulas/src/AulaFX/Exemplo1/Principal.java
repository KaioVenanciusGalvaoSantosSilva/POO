import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Principal extends Application {

	@Override
	public void start(Stage Stage) throws Exception {// Sobrescreve o metodo Start
		// STAGE - PALCO
		// PANE - FUNDO
		// SCENE - CENA

		Pane panel = new Pane();
		Scene scn = new Scene(panel);

		Stage.setScene(scn);
		// Label hello = new Label("Hello");
		// panel.getChildren().add(hello);

		Label nome = new Label("Nome do usuario");// Texto
		// panel.getChildren().add(nome);

		TextField txt = new TextField();// Caixa de texto
		txt.relocate(0, 20);
		// panel.getChildren().add(txt);

		Button btn = new Button("Continuar"); // Botão
		btn.autosize();
		btn.relocate(0, 60);

		Button btnCancelar = new Button("Cancelar");
		btnCancelar.autosize();
		btnCancelar.relocate(90, 60);
		
		panel.getChildren().addAll(nome, txt, btn, btnCancelar);// Adiciona todos a cena
		
		Stage.setTitle("Titulo da Janela"); // Titulo da Janela
		Stage.show();

	}
		

	public static void main(String[] args) {
		Principal.launch(args);// Executa Janela
	}
}