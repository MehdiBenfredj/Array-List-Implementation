import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

    private int size;
    private int capacity;
    Object[] myArrayList;



    @SuppressWarnings("unchecked")
    public MyArrayList(int capacity) {
        try {
            this.capacity = capacity;
            this.size = 0;
            if (capacity < 0){
                throw new IllegalArgumentException("Valeur negative");
            }
            this.myArrayList = (T[]) new Object[capacity];
        }
        catch (IllegalArgumentException e){
            System.out.println("Valeur negative");
        }
    }
    @SuppressWarnings("unchecked")
    public MyArrayList(){
        this(10);
    }

    @Override
    public boolean add(T element) {
        ensureCapacity(size+1);
        myArrayList[size] = element;
        size += 1;

        return true;
    }



    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }


    @Override
    public T get(int index) {
	return (T) myArrayList[index];
    }




    @Override
    public Iterator iterator() {
        ArrayIterator arrayIterator =  new ArrayIterator(this);
	return arrayIterator;
    }
    
    
    @Override
    public T remove(int index) {
        T retour = (T) myArrayList[index];
        for(int i=index;i<size;i++){
            myArrayList[i] = myArrayList[i+1];
        }
        myArrayList[size-1] = null;
        size--;
        ensureCapacity(size-1);
	return retour;
    }


    public boolean contains(Object o) {
        int found = 0;
        for (Object element: myArrayList) {
            if (element == o) {
                found++;
            }
        }
        if (found > 0) {
            return true;
        }
        else{
            return false;
        }
    }



    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<size ; i++){
            stringBuilder.append(myArrayList);
            stringBuilder.append(", ");
        }
	    return stringBuilder.toString();
    }

    public void ensureCapacity(int capacity){
        if (this.capacity <= capacity){
            Object[] copyArrayList = myArrayList;
            myArrayList = new Object[this.capacity*2];
            for(int i = 0; i<size;i++){
                myArrayList[i] = copyArrayList[i];
            }
        }
    }
    
    @Override
    public Object[] toArray() {
	return null;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == -1)
            return false;
        else{
            remove(index);
            return true;
        }
    }

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object set(int position, Object o) {
        Object retour = this.get(position);
        myArrayList[position] = o;
        return retour;
    }

    @Override
    public void add(int position, Object o) {
        ensureCapacity(size+1);
        size++;
        for(int i = size-1; i>=position; i--){
            myArrayList[i+1] = myArrayList[i];
        }
        myArrayList[position] = o;
    }

    @Override
    public int indexOf(Object o) {
        if(!contains(o)) {
            return -1;
        }
        else {
            int index = 0;
            for (int i = 0; i < myArrayList.length; i++) {
                if (myArrayList[i] == o) {
                    index = i;
                    break;
                }
            }
            return index;
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        if(!contains(o)) {
            return -1;
        }
        else {
            int index = 0;
            for (int i = 0; i < myArrayList.length; i++) {
                if (myArrayList[i] == o) {
                    index = i;
                }
            }
            return index;
        }
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof List<?>)){
            return false;
        }
        else {
            List<?> other = (List<?>) obj;
            if(this.size == other.size()){
                int equalities = 0;
                for (int i=0;i<this.size();i++){
                    if (other.get(i).equals(this.get(i))){
                        equalities++;
                    }
                }
                if (equalities == this.size){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
    }

}
