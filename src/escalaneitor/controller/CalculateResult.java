/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.controller;

import escalaneitor.model.ModelQuestionEasy;
import escalaneitor.model.ModelQuestionHalf;
import escalaneitor.model.ModelQuestionHard;

/**
 *
 * @author jaicom025
 */
public class CalculateResult {
    
    /**
     * este metodo calcula el resultado de una operacion con dificultad facil 
     * es decir 2 terminos y un operador
     * @param oper es de tipo ModelQuestionEasy el cual tiene los 2 terminos numericos double y 
     * un operador aritmetico
     * @return es el resultado de la operacion entre los terminos, de tipo double
     */
    public double calculateResultEasy(ModelQuestionEasy oper){
        switch (oper.getOperator()){
            case "+":
                oper.setResult(oper.getTerm1() + oper.getTerm2());
                break;
            case "-":
                oper.setResult(oper.getTerm1() - oper.getTerm2());
                break;
            case "/":
                oper.setResult(oper.getTerm1() / oper.getTerm2());
                break;
            case "*":
                oper.setResult(oper.getTerm1() * oper.getTerm2());
                break;
        }
        return oper.getResult();
    }
    
    /**
     * este metodo calcula el resultado de una operacion con dificultad media 
     * es decir 3 terminos y 2 operadores
     * @param oper es de tipo ModelQuestionHalf el cual tiene los 3 terminos numericos double y 
     * dos operadores aritmeticos
     * @return es el resultado de la operacion entre los terminos, de tipo double
     */
    public double calculateResultHalf(ModelQuestionHalf oper){
        switch (oper.getOperator1()){
            case "+":
                switch (oper.getOperator2()) {
                    case "+":
                        oper.setResult(oper.getTerm1() + oper.getTerm2() + oper.getTerm3());
                        break;
                    case "-":
                        oper.setResult(oper.getTerm1() + oper.getTerm2() - oper.getTerm3());
                        break;
                    case "/":
                        oper.setResult(oper.getTerm1() + oper.getTerm2() / oper.getTerm3());
                        break;
                    case "*":
                        oper.setResult(oper.getTerm1() + oper.getTerm2() * oper.getTerm3());
                        break;
                }
            case "-":
                switch (oper.getOperator2()) {
                    case "+":
                        oper.setResult(oper.getTerm1() - oper.getTerm2() + oper.getTerm3());
                        break;
                    case "-":
                        oper.setResult(oper.getTerm1() - oper.getTerm2() - oper.getTerm3());
                        break;
                    case "/":
                        oper.setResult(oper.getTerm1() - oper.getTerm2() / oper.getTerm3());
                        break;
                    case "*":
                        oper.setResult(oper.getTerm1() - oper.getTerm2() * oper.getTerm3());
                        break;
                }
            case "/":
                switch (oper.getOperator2()) {
                    case "+":
                        oper.setResult(oper.getTerm1() / oper.getTerm2() + oper.getTerm3());
                        break;
                    case "-":
                        oper.setResult(oper.getTerm1() / oper.getTerm2() - oper.getTerm3());
                        break;
                    case "/":
                        oper.setResult(oper.getTerm1() / oper.getTerm2() / oper.getTerm3());
                        break;
                    case "*":
                        oper.setResult(oper.getTerm1() / oper.getTerm2() * oper.getTerm3());
                        break;
                }
            case "*":
                switch (oper.getOperator2()) {
                    case "+":
                        oper.setResult(oper.getTerm1() * oper.getTerm2() + oper.getTerm3());
                        break;
                    case "-":
                        oper.setResult(oper.getTerm1() * oper.getTerm2() - oper.getTerm3());
                        break;
                    case "/":
                        oper.setResult(oper.getTerm1() * oper.getTerm2() / oper.getTerm3());
                        break;
                    case "*":
                        oper.setResult(oper.getTerm1() * oper.getTerm2() * oper.getTerm3());
                        break;
                }
        }
        return oper.getResult();
    }
    
    /**
     * este metodo calcula el resultado de una operacion con dificultad alta 
     * es decir 4 terminos y 3 operadores
     * @param oper es de tipo ModelQuestionHard el cual tiene los 4 terminos numericos double y 
     * tres operadores aritmeticos
     * @return es el resultado de la operacion entre los terminos, de tipo double
     */
    public double calculateResultHard(ModelQuestionHard oper){
        switch (oper.getOperator1()){
            case "+":
                switch (oper.getOperator2()) {
                    case "+":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() + oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() + oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() + oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() + oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "-":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() - oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() - oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() - oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() - oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "/":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() / oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() / oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() / oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() / oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "*":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() * oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() * oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() * oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() + oper.getTerm2() * oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                }
            case "-":
                switch (oper.getOperator2()) {
                    case "+":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() + oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() + oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() + oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() + oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "-":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() - oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() - oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() - oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() - oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "/":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() / oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() / oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() / oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() / oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "*":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() * oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() * oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() * oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() - oper.getTerm2() * oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                }
            case "/":
                switch (oper.getOperator2()) {
                    case "+":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() + oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() + oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() + oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() + oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "-":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() - oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() - oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() - oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() - oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "/":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() / oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() / oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() / oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() / oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "*":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() * oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() * oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() * oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() / oper.getTerm2() * oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                }
            case "*":
                switch (oper.getOperator2()) {
                    case "+":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() + oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() + oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() + oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() + oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "-":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() - oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() - oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() - oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() - oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "/":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() / oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() / oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() / oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() / oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                    case "*":
                        switch (oper.getOperator3()) {
                            case "+":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() * oper.getTerm3() + oper.getTerm4());
                                break;
                            case "-":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() * oper.getTerm3() - oper.getTerm4());
                                break;
                            case "/":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() * oper.getTerm3() / oper.getTerm4());
                                break;
                            case "*":
                                oper.setResult(oper.getTerm1() * oper.getTerm2() * oper.getTerm3() * oper.getTerm4());
                                break;
                        }
                }
        }
        return oper.getResult();
    }
    
}
