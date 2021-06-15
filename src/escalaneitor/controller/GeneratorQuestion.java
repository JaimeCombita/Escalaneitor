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
    
    /**
     * arreglo que contiene los tipos de operadores aritmeticos
     */
    private final String[] OPERATORS = {"+", "-", "/", "*"};
    /**
     * Instancia de la clase calculateResult para calcular el resultado de las operaciones generadas
     */
    CalculateResult resultado;
    
    /**
     * este metodo se encarga de generar la pregunta de dificultad baja
     * seteando los terminos y operdores de manera aleatoria
     * @return retorna un objeto de tipo ModelQuestionEasy es cual contiene todos los terminos de la operacion
     */
    public ModelQuestionEasy generateQuestionEasy(){
        ModelQuestionEasy question = new ModelQuestionEasy();
        question.setTerm1(generateNumberRandom());
        question.setOperator(generateOperatorRandom());
        question.setTerm2(generateNumberRandom());
        question.setResult(resultado.calculateResultEasy(question));
        return question;
    }
    
    /**
     * este metodo se encarga de generar la pregunta de dificultad media
     * seteando los terminos y operdores de manera aleatoria
     * @return retorna un objeto de tipo ModelQuestionHalf es cual contiene todos los terminos de la operacion
     */
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
    
    /**
     * este metodo se encarga de generar la pregunta de dificultad alta
     * seteando los terminos y operdores de manera aleatoria
     * @return retorna un objeto de tipo ModelQuestionHard es cual contiene todos los terminos de la operacion
     */
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
    
    /**
     * Este metodo se encarga de generar un operador aritmetico de forma aleatoria
     * los operadores que contiene son suma, resta, multiplicacion y division
     * @return Retorna una cadena de tipo String la cual contiene el caracter que corresponde con el operador
     */
    private String generateOperatorRandom(){
        int indexOperator = (int) Math.floor(Math.random()*6);
        return OPERATORS[indexOperator];
    }
    
    /**
     * Este metodo es quien genera un numero aleatorio para asignar a los objetos de las preguntas
     * @return Retorna un tipo de dato entero entre 1 y 100
     */
    private double generateNumberRandom(){
        return Math.floor(Math.random()*100+1);
    }
    
}
