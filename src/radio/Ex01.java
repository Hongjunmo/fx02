package radio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public void start(Stage arg0) throws Exception {

		HBox hbox = new HBox(20);

		RadioButton rd1 = new RadioButton("rb1");
		RadioButton rd2 = new RadioButton("rb2");

		rd1.setSelected(true);

		rd1.setText("10대");

		hbox.setPadding(new Insets(20));
		hbox.getChildren().addAll(rd1, rd2);
		hbox.setPrefSize(300, 200);

		ToggleGroup tg = new ToggleGroup();
		rd1.setToggleGroup(tg);
		rd2.setToggleGroup(tg);

	
		
		hbox.setStyle("-fx-background-color:red");
		HBox.setMargin(rd2, new Insets(50,20,20,50));

		arg0.setScene(new Scene(hbox));
		arg0.show();
	}

	public static void main(String[] args) {

		launch(args);
	}
}
