package ir.ac.kntu.gui;

import ir.ac.kntu.logic.Calculator;
import ir.ac.kntu.logic.Operator;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
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

    public void keyboardBan() {
        textField.addEventFilter(KeyEvent.KEY_TYPED, Event::consume);
        textField.addEventFilter(KeyEvent.KEY_PRESSED, Event::consume);
    }

    public void setEventsHandlers() {
        keyboardBan();
        setEventsHandlersOne();
        setEventsHandlersTwo();
        plus.setOnMouseClicked(e -> {
            if (!textField.getText().isEmpty() && !operandContainer(textField.getText())) {
                textField.setText(textField.getText() + "+");
            }
        });
        division.setOnMouseClicked(e -> {
            if (!textField.getText().isEmpty() && !operandContainer(textField.getText())) {
                textField.setText(textField.getText() + "/");
            }
        });
        multiplication.setOnMouseClicked(e -> {
            if (!textField.getText().isEmpty() && !operandContainer(textField.getText())) {
                textField.setText(textField.getText() + "*");
            }
        });
        clear.setOnMouseClicked(e -> {
            textField.setText("");
        });
        equal.setOnMouseClicked(e -> {
            textField.setText(mathEqual(textField.getText()));

        });
    }

    public void setEventsHandlersOne() {
        zero.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            if (!textField.getText().contains("0")) {
                textField.setText(textField.getText() + "0");
            }
        });
        one.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            textField.setText(textField.getText() + "1");
        });
        two.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            textField.setText(textField.getText() + "2");
        });
        three.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            textField.setText(textField.getText() + "3");
        });
        four.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            textField.setText(textField.getText() + "4");
        });
    }

    public void setEventsHandlersTwo() {
        five.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            textField.setText(textField.getText() + "5");
        });
        six.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            textField.setText(textField.getText() + "6");
        });
        seven.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            textField.setText(textField.getText() + "7");
        });
        eight.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            textField.setText(textField.getText() + "8");
        });
        nine.setOnMouseClicked(e -> {
            afterEqual(textField.getText());
            textField.setText(textField.getText() + "9");
        });
        minus.setOnMouseClicked(e -> {
            if (!textField.getText().isEmpty() && !operandContainer(textField.getText())) {
                textField.setText(textField.getText() + "-");
            }
        });
    }

    public boolean operandContainer(String str) {
        if (str.contains("/") || str.contains("+") || str.contains("*")) {
            return true;
        }
        if (str.contains("-")) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '-') {
                    count++;
                }
            }
            if (count == 1 && str.charAt(0) == '-') {
                return false;
            }
            return true;
        }
        return false;
    }

    public String mathEqual(String str) {
        if (operandContainer(str) && Character.isDigit(str.charAt(str.length() - 1))) {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.') {
                    if (str.charAt(i) == '-' && i == 0) {
                        continue;
                    }
                    StringBuilder firstNum = new StringBuilder(str.substring(0, i));
                    StringBuilder secondNum = new StringBuilder(str.substring(i + 1));
                    StringBuilder operator = new StringBuilder(operatorSwitch(str.charAt(i)));
                    return String.valueOf(Calculator.calculate(firstNum, secondNum, operator));
                }
            }
            return str;
        }
        return str;
    }

    public void afterEqual(String str) {
        if (str.contains(".") && !operandContainer(str)) {
            textField.setText("");
        }
    }

    public String operatorSwitch(char opr) {
        switch (opr) {
            case '+':
                return String.valueOf(Operator.PLUS);
            case '-':
                return String.valueOf(Operator.MINUS);
            case '*':
                return String.valueOf(Operator.MULTIPLY);
            case '/':
                return String.valueOf(Operator.DIVIDE);
            default:
                return "";
        }
    }

    public void setRows() {
        multiplication.setPrefSize(100, 100);
        ImageView view12 = new ImageView(new Image("multiply.jpg"));
        view12.setPreserveRatio(true);
        view12.setFitHeight(100);
        multiplication.setPadding(Insets.EMPTY);
        multiplication.setGraphic(view12);
        clear.setPrefSize(100, 100);
        ImageView view13 = new ImageView(new Image("clear.jpg"));
        view13.setPreserveRatio(true);
        view13.setFitHeight(100);
        clear.setPadding(Insets.EMPTY);
        clear.setGraphic(view13);
        plus.setPrefSize(100, 100);
        ImageView view14 = new ImageView(new Image("plus.jpg"));
        view14.setPreserveRatio(true);
        view14.setFitHeight(100);
        plus.setPadding(Insets.EMPTY);
        plus.setGraphic(view14);
        division.setPrefSize(100, 100);
        ImageView view15 = new ImageView(new Image("divide.jpg"));
        view15.setPreserveRatio(true);
        view15.setFitHeight(100);
        division.setPadding(Insets.EMPTY);
        division.setGraphic(view15);
    }

    public void setRowZero() {
        setRowOne();
        setRowTwo();
        setRowThree();
        minus.setPrefSize(100, 100);
        ImageView view11 = new ImageView(new Image("minus.jpg"));
        view11.setPreserveRatio(true);
        view11.setFitHeight(100);
        minus.setPadding(Insets.EMPTY);
        minus.setGraphic(view11);
    }

    public void setRowOne() {
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
        ImageView view0 = new ImageView(new Image("0.jpg"));
        view0.setPreserveRatio(true);
        view0.setFitHeight(100);
        zero.setGraphic(view0);
        zero.setPadding(Insets.EMPTY);
        one.setPrefSize(100, 100);
        ImageView view1 = new ImageView(new Image("1.jpg"));
        view1.setPreserveRatio(true);
        view1.setFitHeight(100);
        one.setPadding(Insets.EMPTY);
        one.setGraphic(view1);
    }

    public void setRowTwo() {
        two.setPrefSize(100, 100);
        ImageView view2 = new ImageView(new Image("2.jpg"));
        view2.setPreserveRatio(true);
        view2.setFitHeight(100);
        two.setPadding(Insets.EMPTY);
        two.setGraphic(view2);
        three.setPrefSize(100, 100);
        ImageView view3 = new ImageView(new Image("3.jpg"));
        view3.setPreserveRatio(true);
        three.setGraphic(view3);
        view3.setFitHeight(100);
        three.setPadding(Insets.EMPTY);
        four.setPrefSize(100, 100);
        ImageView view4 = new ImageView(new Image("4.jpg"));
        view4.setPreserveRatio(true);
        view4.setFitHeight(100);
        four.setPadding(Insets.EMPTY);
        four.setGraphic(view4);
        five.setPrefSize(100, 100);
        ImageView view5 = new ImageView(new Image("5.jpg"));
        view5.setPreserveRatio(true);
        view5.setFitHeight(100);
        five.setPadding(Insets.EMPTY);
        five.setGraphic(view5);
        six.setPrefSize(100, 100);
        ImageView view6 = new ImageView(new Image("6.jpg"));
        view6.setPreserveRatio(true);
        view6.setFitHeight(100);
        six.setPadding(Insets.EMPTY);
        six.setGraphic(view6);
    }

    public void setRowThree() {
        seven.setPrefSize(100, 100);
        ImageView view7 = new ImageView(new Image("7.jpg"));
        view7.setPreserveRatio(true);
        view7.setFitHeight(100);
        seven.setPadding(Insets.EMPTY);
        seven.setGraphic(view7);
        eight.setPrefSize(100, 100);
        ImageView view8 = new ImageView(new Image("8.jpg"));
        view8.setPreserveRatio(true);
        view8.setFitHeight(100);
        eight.setPadding(Insets.EMPTY);
        eight.setGraphic(view8);
        nine.setPrefSize(100, 100);
        ImageView view9 = new ImageView(new Image("9.jpg"));
        view9.setPreserveRatio(true);
        view9.setFitHeight(100);
        nine.setPadding(Insets.EMPTY);
        nine.setGraphic(view9);
        equal.setPrefSize(100, 100);
        ImageView view10 = new ImageView(new Image("equal.jpg"));
        view10.setPreserveRatio(true);
        view10.setFitHeight(100);
        equal.setPadding(Insets.EMPTY);
        equal.setGraphic(view10);
    }

    public void addNodesToPane(Pane pane) {
        setRows();
        vBox = new VBox(colOne, colTwo, colThree, colFour, colFive);
        vBox.setAlignment(Pos.CENTER);
        vBox.setMaxHeight(Double.MAX_VALUE);
        vBox.setMaxWidth(Double.MAX_VALUE);
        pane.getChildren().add(vBox);

    }
}
