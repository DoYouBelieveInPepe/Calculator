package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller  implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    // Чтобы реализовать полноценную логику программы, нам потребуется использовать нижеприведенные две переменные:
    // first_number и second_number. Мы будем воспринимать их, соответственно, как первое и второе число, участвующее в нашей операции.
    // first_number - это число, которое отображается в верхнем поле (там же, где результат операции)
    // second_number - это число, которое отображается в нижнем поле, его вводит пользователь в данный момент

    //Для начала реализуем математические операции только для целых чисел, поддержку чисел с запятой добавим позже

    // Дальнейший алгоритм будет происходить следующим образом:
    // 1. Когда пользователь только запускает программу или нажимает С first_number и second_number становятся равны 0
    // 2. Когда пользователь нажимает на любую цифру, она записывается в second_number. Если в second_number уже было отличное от нуля число,
    //     то сначала умножаем то, что было на 10, затем прибавляем то, что нажал пользователь. Таким образом у нас будет сдвигаться разряд прежне введенных цифру
    // 3. Когда пользователь нажимает на любой знак операции, то first_number становится равен результату соответствующей операции first_number и second_number.
    //     И этот результат оказывается в верхнем поле результата.

    int first_number = 0;
    int second_number = 0;
    int result;


    Float data = 0f;
    String operation = "";
    public Button btn_one;
    public Button btn_two;
    public Button btn_three;
    public Button btn_four;
    public Button btn_five;
    public Button btn_six;
    public Button btn_seven;
    public Button btn_eight;
    public Button btn_nine;
    public Button btn_zero;
    public Button btn_double_zero;
    public Button btn_floating_point;

    public Button btn_clear;
    public Button btn_clear_all;
    public Button btn_plus;
    public Button btn_minus;
    public Button btn_multiply;
    public Button btn_divide;

    public Button btn_equals;

    public TextField upper_field;
    public TextField lower_field;

    String number;
    String point;
    String sign;

    @FXML
    public void btn_action(ActionEvent event) {
        //lower_field.setText(value);
        if (event.getSource() == btn_one) {
            number = "1";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_two) {
            number = "2";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_three) {
            number = "3";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_four) {
            number = "4";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_five) {
            number = "5";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_six) {
            number = "6";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_seven) {
            number = "7";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_eight) {
            number = "8";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_nine) {
            number = "9";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_zero) {
            number = "0";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_double_zero) {
            number = "00";
            upper_field.setText(upper_field.getText() + number);
            lower_field.setText(lower_field.getText() + number);
        } else if (event.getSource() == btn_floating_point) {
            point = ".";
            upper_field.setText(upper_field.getText() + point);
            lower_field.setText(lower_field.getText() + point);
        }

        else if (event.getSource() == btn_plus) {
            sign = " + ";
            String value = lower_field.getText();
            int valuenumber = Integer.parseInt(value);
            this.first_number = valuenumber;
            //upper_field.setText(upper_field.getText() + sign);
            //data = Float.parseFloat(lower_field.getText());
            lower_field.setText("");
            upper_field.setText(value + sign);
            operation = "+"; //add

        } else if (event.getSource() == btn_minus) {
            sign = " - ";
            upper_field.setText(upper_field.getText() + sign);
            data = Float.parseFloat(lower_field.getText());
            operation = "-"; //subtraction
            lower_field.setText("");
        } else if (event.getSource() == btn_multiply) {
            sign = " * ";
            upper_field.setText(upper_field.getText() + sign);
            data = Float.parseFloat(lower_field.getText());
            operation = "*"; //multiplication
            lower_field.setText("");
        } else if (event.getSource() == btn_divide) {
            sign = " / ";
            upper_field.setText(upper_field.getText() + sign);
            data = Float.parseFloat(lower_field.getText());
            operation = "/"; //division
            lower_field.setText("");
        } else if (event.getSource() == btn_clear) {
            upper_field.setText("");
            lower_field.setText("");
            this.data = 0f;
        } else if (event.getSource() == btn_clear_all) {
            upper_field.setText("");
            lower_field.setText("");
            this.data = 0f;
        } else if (event.getSource() == btn_equals) {
            Float secondOperand = Float.parseFloat(lower_field.getText());
            switch (operation) {
                case "+":
                    Float ans;
                    //Float ans = data + secondOperand;
                    //lower_field.setText(String.valueOf(ans));
                    //String v = lower_field.getText();
                    this.second_number = Integer.parseInt(lower_field.getText());
                    int system = this.first_number + this.second_number;
                    lower_field.setText(String.valueOf(system));
                    //String oldprom = upper_field.getText();
                    //upper_field.setText(oldprom);
                    break;
                case "-":
                    ans = data - secondOperand;
                    lower_field.setText(String.valueOf(ans));
                    break;
                case "*":
                    ans = data * secondOperand;
                    lower_field.setText(String.valueOf(ans));
                    break;
                case "/":
                    ans = 0f;
                    try {
                        ans = data / secondOperand;
                    } catch (Exception e) {
                        lower_field.setText("Error");
                    }
                    /*
                    try {
                        secondOperand.equals(0);
                    } catch (Exception e) {
                        input.setText("Деление на 0 невозможно");
                    }*/
                    lower_field.setText(String.valueOf(ans));
                    break;
            }
        }
    }
}