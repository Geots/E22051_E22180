package E22051_E22180.JavaCinema;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
 Stage primaryStage;
 Scene mainScene,ShowScene,PartyScene,SearchScene;
 FlowPane rootFlowPane;
 Button showBtn, partyBtn, searchBtn;
    @Override
    public void start(Stage primaryStage) {
    	
    	this.primaryStage = primaryStage;
    	rootFlowPane = new FlowPane();
    	showBtn = new Button("manage");
    	partyBtn = new Button("party");
    	searchBtn = new Button("search");
    	
    	//setup FlowPane
    	rootFlowPane.setHgap(10);
    	rootFlowPane.setAlignment(Pos.CENTER);
    	
    	//add show, party, search
    	rootFlowPane.getChildren().add(showBtn);
    	rootFlowPane.getChildren().add(partyBtn);
    	rootFlowPane.getChildren().add(searchBtn);
    	
        //var javaVersion = SystemInfo.javaVersion();
        //var javafxVersion = SystemInfo.javafxVersion();

        //var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        //var scene = new Scene(new StackPane(label), 640, 480);
    	
    	//set mainScene
    	mainScene = new Scene(rootFlowPane, 650, 300);
    	ShowScene = new Scene(new GridPane(), 650, 300);
    	
        primaryStage.setTitle("Java Cinema");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}