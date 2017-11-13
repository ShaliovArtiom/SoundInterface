package main.java.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * Created by shali on 19.10.2017.
 */
public class Window extends Application {
    private static Stage primaryStage;
    private AnchorPane layout;


    public Window() {
    }

        @Override
        public void start(Stage primaryStage) throws Exception {
            this.primaryStage = primaryStage;
            initLayout();
        }

    public void bind() {launch();}

    private void initLayout() throws IOException {
        URL resource = Window.class.getResource("/main/resource/view.fxml");
        FXMLLoader loader = new FXMLLoader(resource);
        layout = loader.load();
        Scene scene = new Scene(layout);
        primaryStage.setTitle("Speaker");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
