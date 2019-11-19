public class ArrayList<E>  implements List {

    private Object[] array;

    int size = 0;

    public ArrayList() {
        this.array = new Object[10];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object o) {
        if (o == null) return false;
        array[size] = o;
        size++;
        return true;
    }

    @Override
    public boolean remove() {
        return remove(0);
    }

    public boolean remove(int index){
        if (size == 0 || index < 0) return false;
        for (int i = index; i < size - 1; i++){
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) return false;
        int index = -1;
        for (int i = 0; i < size; i++){
            if (array[i] == o) {
                index = i;
                break;
            }
        }
        return remove(index);
    }

    @Override
    public Object get(int index) {
        if (index >= size || index < 0) return null;
        return array[index];
    }

    @Override
    public void add(int index, Object element) {

        if (index >= 0 && index < size){
            for (int i = size - 1; i > index; i--){
                array[i + 1] = array[i];
            }
            array[index] = element;
            size++;
        }

    }

}
