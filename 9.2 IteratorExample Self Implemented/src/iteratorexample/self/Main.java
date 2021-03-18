package iteratorexample.self;

public class Main {
    public static void main(String[] args){
        Integer[] intArr = {5,4,32,78,5,4,43,6};
        IterableCollection arr = new MyArray(intArr);
        printArray(arr);
    }

    public static void printArray(IterableCollection collection){
        IMyIterator mi = collection.createIterator();

        while(mi.hasMore()){
            System.out.println(mi.getNext());
        }
    }
}
