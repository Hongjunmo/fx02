package checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public void start(Stage arg0) throws Exception {

		VBox vbox = new VBox(10);
		CheckBox chk1 = new CheckBox("chk1");
		CheckBox chk2 = new CheckBox("chk2");
		
		
		chk1.setText("오락");
		chk2.setText("게임");
		
		chk2.setSelected(true);
		vbox.getChildren().addAll(chk1,chk2);
		
		arg0.setScene(new Scene(vbox,300,200));
		arg0.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
