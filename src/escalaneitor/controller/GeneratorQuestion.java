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
public class GeneratorQuestion {
    
    private final String[] OPERATORS = {"+", "-", "/", "*"};
    CalculateResult resultado;
    
    public ModelQuestionEasy generateQuestionEasy(){
        ModelQuestionEasy question = new ModelQuestionEasy();
        question.setTerm1(generateNumberRandom());
        question.setOperator(generateOperatorRandom());
        question.setTerm2(generateNumberRandom());
        question.setResult(resultado.calculateResultEasy(question));
        return question;
    }
    
    public ModelQuestionHalf generateQuestionHalf(){
        ModelQuestionHalf question = new ModelQuestionHalf();
        question.setTerm1(generateNumberRandom());
        question.setOperator1(generateOperatorRandom());
        question.setTerm2(generateNumberRandom());
        question.setOperator2(generateOperatorRandom());
        question.setTerm3(generateNumberRandom());
        question.setResult(resultado.calculateResultHalf(question));
        return question;
    }
    
    public ModelQuestionHard generateQuestionHard(){
        ModelQuestionHard question = new ModelQuestionHard();
        question.setTerm1(generateNumberRandom());
        question.setOperator1(generateOperatorRandom());
        question.setTerm2(generateNumberRandom());
        question.setOperator2(generateOperatorRandom());
        question.setTerm3(generateNumberRandom());
        question.setOperator3(generateOperatorRandom());
        question.setTerm4(generateNumberRandom());
        question.setResult(resultado.calculateResultHard(question));
        return question;
    }
    
    private String generateOperatorRandom(){
        int indexOperator = (int) Math.floor(Math.random()*6);
        return OPERATORS[indexOperator];
    }
    
    private double generateNumberRandom(){
        return Math.floor(Math.random()*100);
    }
    
}
