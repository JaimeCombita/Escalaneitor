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
