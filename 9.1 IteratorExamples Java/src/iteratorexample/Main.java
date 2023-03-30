package iteratorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Integer[] myArr = {3,4,7,5,2,6};
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

        for(int v : myArr){ // Enhanced for loop
            System.out.println(v);
        }

        for(Iterator<Integer> iterator = Arrays.stream(myArr).iterator(); iterator.hasNext();){
            Integer x = iterator.next();
            System.out.println(x);
        }

        Iterator<Integer> iterator = Arrays.stream(myArr).iterator();
        while(iterator.hasNext()){
            Integer x = iterator.next();
        }

        List<Integer> intList = new ArrayList<>(Arrays.asList(myArr));
        Iterator<Integer> iteratorList = intList.iterator();
        while(iteratorList.hasNext()){
            Integer x = iteratorList.next();
        }

    }
}
