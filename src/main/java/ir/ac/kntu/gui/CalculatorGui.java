package ir.ac.kntu.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class CalculatorGui {
    private TextField textField;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button equal;
    private Button multiplication;
    private Button plus;
    private Button minus;
    private Button division;
    private Button clear;

    private HBox colOne;
    private HBox colTwo;
    private HBox colThree;
    private HBox colFour;
    private HBox colFive;
    private VBox vBox;

    public CalculatorGui() {
        textField = new TextField();
        zero = new Button();
        one = new Button();
        two = new Button();
        three = new Button();
        four = new Button();
        five = new Button();
        six = new Button();
        seven = new Button();
        eight = new Button();
        nine = new Button();
        equal = new Button();
        multiplication = new Button();
        division = new Button();
        plus = new Button();
        minus = new Button();
        clear = new Button();
    }

    public void setEventsHandlers() {
        //todo: set your fields event handler on mouse clicked.
        //todo: use lambdas as much as possible :)
    }

    public void setRows() {
        colOne = new HBox(textField);
        colTwo = new HBox(seven, eight, nine, plus);
        colThree = new HBox(four, five, six, minus);
        colFour = new HBox(one, two, three, division);
        colFive = new HBox(clear, zero, equal, multiplication);
        colTwo.setPadding(new Insets(10,0,0,30));
        colTwo.setSpacing(10);
        colThree.setPadding(new Insets(10,0,0,30));
        colThree.setSpacing(10);
        colFour.setPadding(new Insets(10,0,0,30));
        colFour.setSpacing(10);
        colFive.setPadding(new Insets(10,0,0,30));
        colFive.setSpacing(10);
        textField.setPrefSize(500,100);
        zero.setPrefSize(100, 100);
        ImageView view0 = new ImageView(new Image("file:0.jpg"));
        view0.setPreserveRatio(true);
        zero.setGraphic(view0);
        one.setPrefSize(100, 100);
        ImageView view1 = new ImageView(new Image("file:0.jpg"));
        view1.setPreserveRatio(true);
        one.setGraphic(view1);
        two.setPrefSize(100, 100);
        ImageView view2 = new ImageView(new Image("file:0.jpg"));
        view2.setPreserveRatio(true);
        two.setGraphic(view2);
        two.setPrefSize(100, 100);
        ImageView view3 = new ImageView(new Image("file:0.jpg"));
        view3.setPreserveRatio(true);
        two.setGraphic(view3);
        three.setPrefSize(100, 100);
        ImageView view4 = new ImageView(new Image("file:0.jpg"));
        view4.setPreserveRatio(true);
        three.setGraphic(view4);
        four.setPrefSize(100, 100);
        ImageView view5 = new ImageView(new Image("file:0.jpg"));
        view5.setPreserveRatio(true);
        four.setGraphic(view5);
        five.setPrefSize(100, 100);
        ImageView view6 = new ImageView(new Image("file:0.jpg"));
        view6.setPreserveRatio(true);
        five.setGraphic(view6);
        six.setPrefSize(100, 100);
        ImageView view7 = new ImageView(new Image("file:0.jpg"));
        view7.setPreserveRatio(true);
        six.setGraphic(view7);
        seven.setPrefSize(100, 100);
        ImageView view8 = new ImageView(new Image("file:0.jpg"));
        view8.setPreserveRatio(true);
        seven.setGraphic(view8);
        eight.setPrefSize(100, 100);
        ImageView view9 = new ImageView(new Image("file:0.jpg"));
        view9.setPreserveRatio(true);
        eight.setGraphic(view9);
        nine.setPrefSize(100, 100);
        ImageView view10 = new ImageView(new Image("file:0.jpg"));
        view10.setPreserveRatio(true);
        nine.setGraphic(view10);
        equal.setPrefSize(100, 100);
        ImageView view11 = new ImageView(new Image("file:0.jpg"));
        view11.setPreserveRatio(true);
        equal.setGraphic(view11);
        minus.setPrefSize(100, 100);
        ImageView view12 = new ImageView(new Image("file:0.jpg"));
        view12.setPreserveRatio(true);
        minus.setGraphic(view12);
        multiplication.setPrefSize(100, 100);
        ImageView view13 = new ImageView(new Image("file:0.jpg"));
        view13.setPreserveRatio(true);
        multiplication.setGraphic(view13);
        clear.setPrefSize(100, 100);
        ImageView view14 = new ImageView(new Image("file:0.jpg"));
        view14.setPreserveRatio(true);
        clear.setGraphic(view14);
        plus.setPrefSize(100, 100);
        ImageView view15 = new ImageView(new Image("file:0.jpg"));
        view15.setPreserveRatio(true);
        plus.setGraphic(view15);
        division.setPrefSize(100, 100);
        ImageView view16 = new ImageView(new Image("file:0.jpg"));
        view16.setPreserveRatio(true);
        division.setGraphic(view16);
    }

    public void addNodesToPane(Pane pane) {
        setRows();
        vBox = new VBox(colOne, colTwo, colThree, colFour, colFive);
        vBox.setAlignment(Pos.CENTER);
        pane.getChildren().add(vBox);

        //todo: add your fields to pane in an appropriate order :)
        //todo: cast the pane to which child you need, eg. GridPane, VBox, etc.
        //todo: you can change signature of this method if you need more than a single pane.
    }
}
