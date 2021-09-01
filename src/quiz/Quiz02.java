package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz02 extends Application {
	@Override
	public void start(Stage arg0) throws Exception {

		HBox hbox = new HBox();
		Label iv = new Label("Search", new ImageView("/img/search.png"));
		iv.setFont(new Font("Arial",25));
		iv.setTextFill(Color.BLUE);
	iv.setOnMouseEntered(e->{
		iv.setScaleX(1.5);
		iv.setScaleY(1.5);
	});
		iv.setOnMouseExited(e->{
			iv.setScaleX(1.0);
			iv.setScaleY(1.0);
		});
		
		
		Label la2 = new Label("Values");
		la2.setFont(new Font("Arial",35));
		la2.setRotate(270);
		la2.setTranslateY(60);
		
		la2.setOnMouseEntered(e->{
			la2.setScaleX(1.5);
			la2.setScaleX(1.5);
		});
		
		la2.setOnMouseExited(e->{
			la2.setScaleX(1.0);
			la2.setScaleY(1.0);
		});
		Label wrap = new Label("A label that needs to be wrapped");
		wrap.setWrapText(true);
		
		
		HBox wrappedHbox = new HBox();
		wrappedHbox.setPadding(new Insets(40, 0, 0, 0));
		wrappedHbox.setPrefSize(100, 100);
		wrappedHbox.getChildren().add(wrap);
		wrap.setOnMouseEntered(e->{
			wrap.setScaleX(1.5);
			wrap.setScaleX(1.5);
		});
		
		wrap.setOnMouseExited(e->{
			wrap.setScaleX(1.0);
			wrap.setScaleY(1.0);
		});
		
		
		hbox.getChildren().addAll(iv,la2,wrappedHbox);
		arg0.setScene(new Scene(hbox,400,170));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
