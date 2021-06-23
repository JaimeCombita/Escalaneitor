/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.model;

/**
 *
 * @author jaicom025
 */

/**
 * esta clase hace referencia al objeto que modela las preguntas de dificultad media
 * contiene los atributos junto con sus respectivos metodos getter y setter
 */
public class ModelQuestionHalf {
    
    private double term1;
    private double term2;
    private double term3;
    private String operator1;
    private String operator2;
    private double result;

    public double getTerm1() {
        return term1;
    }

    public void setTerm1(double term1) {
        this.term1 = term1;
    }

    public double getTerm2() {
        return term2;
    }

    public void setTerm2(double term2) {
        this.term2 = term2;
    }

    public double getTerm3() {
        return term3;
    }

    public void setTerm3(double term3) {
        this.term3 = term3;
    }

    public String getOperator1() {
        return operator1;
    }

    public void setOperator1(String operator1) {
        this.operator1 = operator1;
    }

    public String getOperator2() {
        return operator2;
    }

    public void setOperator2(String operator2) {
        this.operator2 = operator2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
}
