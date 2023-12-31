package com.example.calcfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public Label Text;
    @FXML
    private StringBuilder concatenatedText = new StringBuilder();

    @FXML
    protected void onButtonClick0() {
        num(0);
    }
    @FXML
    protected void onButtonClick1() {
        num(1);
    }
    @FXML
    protected void onButtonClick2() {
        num(2);
    }
    @FXML
    protected void onButtonClick3() {
        num(3);
    }
    @FXML
    protected void onButtonClick4() {
        num(4);
    }
    @FXML
    protected void onButtonClick5() {
        num(5);
    }
    @FXML
    protected void onButtonClick6() {
        num(6);
    }
    @FXML
    protected void onButtonClick7() {
        num(7);
    }
    @FXML
    protected void onButtonClick8() {
        num(8);
    }
    @FXML
    protected void onButtonClick9() {
        num(9);
    }
    @FXML
    protected void onButtonClickDelete() {
        concatenatedText.delete(0,concatenatedText.length());
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
    @FXML
    protected void onButtonClickMulti() {
        simbolo("*");
    }
    @FXML
    public void onButtonClickSolution() {
        String All = String.valueOf(concatenatedText);
        if(All.matches(".*[+].*")){
            Solution("\\+", All);
        } else if (All.matches(".*[-].*")){
            Solution("-", All);
        } else if (All.matches(".*[*].*")){
            Solution("\\*", All);
        } else if (All.matches(".*[/].*")){
            Solution("/", All);
        }
    }

    private void updateLabel() {
        Text.setText(concatenatedText.toString());
    }

    private void simbolo (String simbolo) {
        String subLastChar = concatenatedText.substring(concatenatedText.length()-1);
        String stringMatches = String.valueOf(concatenatedText);

//        if(stringMatches.matches(".*[-+*/].*")){
//            onButtonClickSolution();
//            concatenatedText.append(simbolo);
//            updateLabel();
//        }else{
            int numCom = -1;
            try {
                numCom = Integer.parseInt(subLastChar);
            } catch (Exception ignored) { }

            if (numCom == -1) {
                String subWithoutLast = concatenatedText.substring(0, concatenatedText.length() - 1);
                concatenatedText = new StringBuilder(subWithoutLast);
            }
            concatenatedText.append(simbolo);
            updateLabel();
        //}
    }

    private void num (int num) {
        String buttonText = String.valueOf(num);
        concatenatedText.append(buttonText);
        updateLabel();
    }

    private  void Solution (String simbolo, String All) {
        String[] parts;
        parts = All.split(simbolo);
        int part1 = Integer.parseInt(parts[0]);
        int part2 = Integer.parseInt(parts[1]);
        if (simbolo.length()>1){
            simbolo = simbolo.substring(1);
        }
        int solucion = switch (simbolo) {
            case "+" -> part1 + part2;
            case "-" -> part1 - part2;
            case "*" -> part1 * part2;
            case "/" -> part1 / part2;
            default -> 0;
        };
        concatenatedText.delete(0,concatenatedText.length());
        concatenatedText.append(solucion);
        updateLabel();
    }

}