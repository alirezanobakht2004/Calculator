package ir.ac.kntu;

import ir.ac.kntu.gui.CalculatorGui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        CalculatorGui calculatorGui = new CalculatorGui();
        // todo: create a CalculatorGui.
        calculatorGui.setEventsHandlers();
        // todo: set its EventsHandlers.
        Pane fatherPane = new Pane();
        fatherPane.setPrefSize(500, 550);
        // todo: create some Panes.
        calculatorGui.addNodesToPane(fatherPane);
        // todo: add your nodes to the panes (use CalculatorGui's interface (addNodesToPane)).
        Scene scene = new Scene(fatherPane);
        // todo: set your main pane to scene. (change argument of Scene constructor)
        primaryStage.setScene(scene);
        primaryStage.show();
        // todo: enjoy your graphical calculator.
    }
}