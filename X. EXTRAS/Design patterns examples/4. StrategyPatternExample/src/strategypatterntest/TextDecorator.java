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
public class TextDecorator
{
    private TextDecorationStrategy[] strategies;

    public TextDecorator(TextDecorationStrategy... strategies)
    {
        this.strategies = strategies;
    }
    
    public String applyStrategies(String input)
    {
        String returnString = input;
        for (TextDecorationStrategy strategy : strategies)
        {
            returnString = strategy.decorateText(returnString);
        }
        return returnString;
    }
}
