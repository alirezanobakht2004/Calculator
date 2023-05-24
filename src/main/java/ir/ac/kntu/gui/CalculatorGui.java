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
        colTwo.setPadding(new Insets(10, 0, 0, 30));
        colTwo.setSpacing(10);
        colThree.setPadding(new Insets(10, 0, 0, 30));
        colThree.setSpacing(10);
        colFour.setPadding(new Insets(10, 0, 0, 30));
        colFour.setSpacing(10);
        colFive.setPadding(new Insets(10, 0, 0, 30));
        colFive.setSpacing(10);
        textField.setPrefSize(500, 100);
        zero.setPrefSize(100, 100);
        System.out.println(getClass().getResourceAsStream("0.jpg"));
        ImageView view0 = new ImageView(new Image("buttons/0.jpg"));
        view0.setPreserveRatio(true);
        view0.setFitHeight(100);
        zero.setGraphic(view0);
       zero.setPadding(Insets.EMPTY);
         one.setPrefSize(100, 100);
        ImageView view1 = new ImageView(new Image("buttons/1.jpg"));
        view1.setPreserveRatio(true);
        view1.setFitHeight(100);
        one.setPadding(Insets.EMPTY);
        one.setGraphic(view1);
        two.setPrefSize(100, 100);
        ImageView view2 = new ImageView(new Image("buttons/2.jpg"));
        view2.setPreserveRatio(true);
        view2.setFitHeight(100);
        two.setPadding(Insets.EMPTY);
        two.setGraphic(view2);
        three.setPrefSize(100, 100);
        ImageView view3 = new ImageView(new Image("buttons/3.jpg"));
        view3.setPreserveRatio(true);
        three.setGraphic(view3);
        view3.setFitHeight(100);
        three.setPadding(Insets.EMPTY);
        four.setPrefSize(100, 100);
        ImageView view4 = new ImageView(new Image("buttons/4.jpg"));
        view4.setPreserveRatio(true);
        view4.setFitHeight(100);
        four.setPadding(Insets.EMPTY);
        four.setGraphic(view4);
        five.setPrefSize(100, 100);
        ImageView view5 = new ImageView(new Image("buttons/5.jpg"));
        view5.setPreserveRatio(true);
        view5.setFitHeight(100);
        five.setPadding(Insets.EMPTY);
        five.setGraphic(view5);
        six.setPrefSize(100, 100);
        ImageView view6 = new ImageView(new Image("buttons/6.jpg"));
        view6.setPreserveRatio(true);
        view6.setFitHeight(100);
        six.setPadding(Insets.EMPTY);
        six.setGraphic(view6);
        seven.setPrefSize(100, 100);
        ImageView view7 = new ImageView(new Image("buttons/7.jpg"));
        view7.setPreserveRatio(true);
        view7.setFitHeight(100);
        seven.setPadding(Insets.EMPTY);
        seven.setGraphic(view7);
        eight.setPrefSize(100, 100);
        ImageView view8 = new ImageView(new Image("buttons/8.jpg"));
        view8.setPreserveRatio(true);
        view8.setFitHeight(100);
        eight.setPadding(Insets.EMPTY);
        eight.setGraphic(view8);
        nine.setPrefSize(100, 100);
        ImageView view9 = new ImageView(new Image("buttons/9.jpg"));
        view9.setPreserveRatio(true);
        view9.setFitHeight(100);
        nine.setPadding(Insets.EMPTY);
        nine.setGraphic(view9);
        equal.setPrefSize(100, 100);
        ImageView view10 = new ImageView(new Image("buttons/equal.jpg"));
        view10.setPreserveRatio(true);
        view10.setFitHeight(100);
        equal.setPadding(Insets.EMPTY);
        equal.setGraphic(view10);
        minus.setPrefSize(100, 100);
        ImageView view11 = new ImageView(new Image("buttons/minus.jpg"));
        view11.setPreserveRatio(true);
        view11.setFitHeight(100);
        minus.setPadding(Insets.EMPTY);
        minus.setGraphic(view11);
        multiplication.setPrefSize(100, 100);
        ImageView view12 = new ImageView(new Image("buttons/multiply.jpg"));
        view12.setPreserveRatio(true);
        view12.setFitHeight(100);
        multiplication.setPadding(Insets.EMPTY);
        multiplication.setGraphic(view12);
        clear.setPrefSize(100, 100);
        ImageView view13 = new ImageView(new Image("buttons/clear.jpg"));
        view13.setPreserveRatio(true);
        view13.setFitHeight(100);
        clear.setPadding(Insets.EMPTY);
        clear.setGraphic(view13);
        plus.setPrefSize(100, 100);
        ImageView view14 = new ImageView(new Image("buttons/plus.jpg"));
        view14.setPreserveRatio(true);
        view14.setFitHeight(100);
        plus.setPadding(Insets.EMPTY);
        plus.setGraphic(view14);
        division.setPrefSize(100, 100);
        ImageView view15 = new ImageView(new Image("buttons/divide.jpg"));
        view15.setPreserveRatio(true);
        view15.setFitHeight(100);
        division.setPadding(Insets.EMPTY);
        division.setGraphic(view15);
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
