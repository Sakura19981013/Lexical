package com.cifa;

public class Sortclass {
    public String getSortclass(String word){
        String sortclass;
        switch(word) {
            case "NUM":
                sortclass = "数字";
            case "+":
                sortclass = "加号";
            case "-":
                sortclass = "减号";
            case "*":
                sortclass = "乘号";
            case "/":
                sortclass = "除号";
            case "<<":
                sortclass = "左移";
            case ">>":
                sortclass = "右移";
            case "(":
                sortclass = "左括号";
            case ")":
                sortclass = "右括号";
                default:
                    sortclass = " ";
                    break;

        }
        return sortclass;
    }
}
