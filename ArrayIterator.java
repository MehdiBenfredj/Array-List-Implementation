import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {


    Object[] copy;
    int index = 0;
    Object current = null;
    int size;

    public ArrayIterator(MyArrayList<T> myArrayList){
        copy = new  Object[myArrayList.size()];
        this.size = myArrayList.size();
        for(int i = 0; i<size;i++){
            copy[i] = myArrayList.get(i);
        }
        if (size != 0)
            this.current = copy[index];
    }


    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        Object data =  current;

        try {
            if(index >= size)
                throw new ArrayIndexOutOfBoundsException();
            index++;
            current =  copy[index];

        }
        catch (ArrayIndexOutOfBoundsException e){
            current = null;
        }
        return (T) data;


    }


}
