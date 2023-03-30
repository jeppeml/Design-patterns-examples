package iteratorexample.self;

public class MyArray implements IterableCollection {
    private Integer[] arr;
    public MyArray(Integer[] arr) {
        this.arr = arr;
    }

    public Integer[] getArr() {
        return arr;
    }

    public void setArr(Integer[] arr) {
        this.arr = arr;
    }

    @Override
    public IMyIterator createIterator() {
        return new MyIterator(this);
    }
}
