/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum14;

import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Praktikan
 */
public class Praktikum14 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
//        n
//        Scene scene = new Scene(root);
//        
//        stage.setScene(scene);
//        stage.show();
//        Button btn = new Button("Click!");
//        Button btn1 = new Button("Click me!");
//        Label txt = new Label("");
        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
        
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                txt.setText("Hello"); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
        
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.getChildren().add(txt);
//        root.getChildren().add(btn);
//        root.getChildren().add(btn1);
        
        Scene scene = new Scene(root);
        
//        stage.setHeight(300);
//        stage.setWidth(300);
        stage.setScene(scene);
//        stage.setTitle("Hello");
        stage.setTitle("John Wilken-2117051024");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
