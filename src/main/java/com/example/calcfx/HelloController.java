package com.example.calcfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.OverrunStyle;
import javafx.scene.paint.Paint;



public class HelloController {
    @FXML
    public Label Text;
    @FXML
    private StringBuilder concatenatedText = new StringBuilder();

    @FXML
    protected void onButtonClick0() {
        String buttonText = "0";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClick1() {
        String buttonText = "1";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClick2() {
        String buttonText = "2";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClick3() {
        String buttonText = "3";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClick4() {
        String buttonText = "4";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClick5() {
        String buttonText = "5";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClick6() {
        String buttonText = "6";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClick7() {
        String buttonText = "7";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClick8() {
        String buttonText = "8";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClick9() {
        String buttonText = "9";
        concatenatedText.append(buttonText);
        updateLabel();
    }
    @FXML
    protected void onButtonClickPlus() {
        simbolo("+");

    }
    @FXML
    protected void onButtonClickMinus() {
        simbolo("-");
    }
    private void updateLabel() {
        Text.setText(concatenatedText.toString());
    }

    private void simbolo (String simbolo)
    {
        String subLastChar = concatenatedText.substring(concatenatedText.length()-1);
        int numCom = -1;
        try {
            numCom = Integer.parseInt(subLastChar);
        } catch (Exception e) { }

        if(numCom != -1) {
            concatenatedText.append(simbolo);
            updateLabel();
        } else{
            String subWithoutLast = concatenatedText.substring(0, concatenatedText.length()-1);
            concatenatedText = new StringBuilder(subWithoutLast);
            concatenatedText.append(simbolo);
            updateLabel();
        }
    }
}