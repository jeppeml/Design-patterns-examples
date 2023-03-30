/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatterntest;

/**
 *
 * @author jeppjleemoritzled
 */
public class TextDecorationStrategyWideSpacing implements TextDecorationStrategy
{

    @Override
    public String decorateText(String input)
    {
        char[] charsInString = input.toCharArray();
        String decoratedString = "";
        for (char c : charsInString)
        {
            decoratedString += c + " ";
        }
        return decoratedString;
    }
    
}
