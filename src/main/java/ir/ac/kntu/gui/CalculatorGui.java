package ir.ac.kntu.gui;

import ir.ac.kntu.logic.Calculator;
import ir.ac.kntu.logic.Operator;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * @author sina rostami
 */
public class CalculatorGui {
    private ImageView imageView0;

    private ImageView imageView1;

    private ImageView imageView2;

    private ImageView imageView3;

    private ImageView imageView4;

    private ImageView imageView5;

    private ImageView imageView6;

    private ImageView imageView7;

    private ImageView imageView8;

    private ImageView imageView9;

    private ImageView imageViewEqual;

    private ImageView imageViewPlus;

    private ImageView imageViewMinus;

    private ImageView imageViewDivide;

    private ImageView imageViewMultiply;

    private ImageView imageViewClear;

    private Text text;

    private StringBuilder operand1;

    private StringBuilder operand2;

    private StringBuilder operator;

    public CalculatorGui() {
        imageView0 = new ImageView(new Image("buttons/0.jpg", 60, 60, false, false));
        imageView1 = new ImageView(new Image("buttons/1.jpg", 60, 60, false, false));
        imageView2 = new ImageView(new Image("buttons/2.jpg", 60, 60, false, false));
        imageView3 = new ImageView(new Image("buttons/3.jpg", 60, 60, false, false));
        imageView4 = new ImageView(new Image("buttons/4.jpg", 60, 60, false, false));
        imageView5 = new ImageView(new Image("buttons/5.jpg", 60, 60, false, false));
        imageView6 = new ImageView(new Image("buttons/6.jpg", 60, 60, false, false));
        imageView7 = new ImageView(new Image("buttons/7.jpg", 60, 60, false, false));
        imageView8 = new ImageView(new Image("buttons/8.jpg", 60, 60, false, false));
        imageView9 = new ImageView(new Image("buttons/9.jpg", 60, 60, false, false));
        imageViewEqual = new ImageView(new Image("buttons/equal.jpg", 60, 60, false, false));
        imageViewPlus = new ImageView(new Image("buttons/plus.jpg", 60, 60, false, false));
        imageViewMinus = new ImageView(new Image("buttons/minus.jpg", 60, 60, false, false));
        imageViewDivide = new ImageView(new Image("buttons/divide.jpg", 60, 60, false, false));
        imageViewMultiply = new ImageView(new Image("buttons/multiply.jpg", 60, 60, false, false));
        imageViewClear = new ImageView(new Image("buttons/clear.jpg", 60, 60, false, false));
        text = new Text(250, 30, "");
        operand1 = new StringBuilder();
        operand2 = new StringBuilder();
        operator = new StringBuilder();
    }

    public void setEventsHandlers() {
        setNumbersEventHandler();
        setOperatorsEventHandlers();
        setEqualButtonEventHandler();
    }

    private void setOperatorsEventHandlers() {
        imageViewClear.setOnMouseClicked(mouseEvent -> {
            if (operand1.compareTo(new StringBuilder("")) > 0) {
                operand2.delete(0, operand2.length());
            } else {
                operand1.delete(0, operand1.length());
            }
            text.setText("");
        });
        imageViewPlus.setOnMouseClicked(mouseEvent -> {
            operand1.append(text.getText());
            text.setText("");
            operator.append(Operator.PLUS.toString());
        });
        imageViewMinus.setOnMouseClicked(mouseEvent -> {
            operand1.append(text.getText());
            text.setText("");
            operator.append(Operator.MINUS.toString());
        });
        imageViewDivide.setOnMouseClicked(mouseEvent -> {
            operand1.append(text.getText());
            text.setText("");
            operator.append(Operator.DIVIDE.toString());
        });
        imageViewMultiply.setOnMouseClicked(mouseEvent -> {
            operand1.append(text.getText());
            text.setText("");
            operator.append(Operator.MULTIPLY.toString());
        });
    }

    private void setEqualButtonEventHandler() {
        imageViewEqual.setOnMouseClicked(mouseEvent -> {
            if (operand1.compareTo(new StringBuilder("")) > 0) {
                operand2.append(text.getText());

                Double result = Calculator.calculate(operand1, operand2, operator);

                text.setText(Double.toString(result));
                operand2.delete(0, operand2.length());
                operand1.delete(0, operand1.length());
                operator.delete(0, operator.length());
            }
        });
    }

    private void setNumbersEventHandler() {
        imageView0.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "0"));
        imageView1.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "1"));
        imageView2.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "2"));
        imageView3.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "3"));
        imageView4.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "4"));
        imageView5.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "5"));
        imageView6.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "6"));
        imageView7.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "7"));
        imageView8.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "8"));
        imageView9.setOnMouseClicked(mouseEvent -> text.setText(text.getText() + "9"));
    }

    public void addNodesToPane(GridPane gp, VBox vBox) {
        gp.setHgap(5);
        gp.setVgap(5);
        gp.add(imageView7, 0, 0);
        gp.add(imageView8, 1, 0);
        gp.add(imageView9, 2, 0);
        gp.add(imageViewPlus, 3, 0);
        gp.add(imageView4, 0, 1);
        gp.add(imageView5, 1, 1);
        gp.add(imageView6, 2, 1);
        gp.add(imageViewMinus, 3, 1);
        gp.add(imageView1, 0, 2);
        gp.add(imageView2, 1, 2);
        gp.add(imageView3, 2, 2);
        gp.add(imageViewDivide, 3, 2);
        gp.add(imageViewClear, 0, 3);
        gp.add(imageView0, 1, 3);
        gp.add(imageViewEqual, 2, 3);
        gp.add(imageViewMultiply, 3, 3);

        vBox.setSpacing(10);
        vBox.setMargin(text, new Insets(10, 10, 10, 10));
        vBox.setMargin(gp, new Insets(10, 10, 10, 10));
        ObservableList list = vBox.getChildren();
        list.addAll(text, gp);
    }
}