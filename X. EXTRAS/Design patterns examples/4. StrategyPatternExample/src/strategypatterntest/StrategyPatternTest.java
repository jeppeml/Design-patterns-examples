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
public class StrategyPatternTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String text = "all carneys are evil!";
        TextDecorationStrategy capsStrategy = new TextDecorationStrategyAllCaps();
        TextDecorator deco = new TextDecorator(capsStrategy);
        System.out.println(deco.applyStrategies(text));
        
        TextDecorationStrategy wideSpaceStrategy = new TextDecorationStrategyWideSpacing();
        TextDecorator decoWide = new TextDecorator(wideSpaceStrategy);
        System.out.println(decoWide.applyStrategies(text));
        
        System.out.println(deco.applyStrategies(decoWide.applyStrategies(text)));
        
        TextDecorationStrategy altCapsStrategy = new TextDecorationStrategyAltCaps();
        TextDecorator decoAltCaps = new TextDecorator(altCapsStrategy);
        System.out.println(decoAltCaps.applyStrategies(text));
        
        TextDecorator decoMulti = new TextDecorator(wideSpaceStrategy, altCapsStrategy);
        System.out.println(decoMulti.applyStrategies(text));
        
    }
    
}
