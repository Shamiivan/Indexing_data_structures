package a1;

public class SDictionary<K,V> implements ADTDictionary<K,V> {
    private SingleLinkedList<Entry<K,V>> list;


    /*Constructors*/
    SDictionary(){
        list = new SingleLinkedList<>();
    }

    @Override
    public void clear() {list.clear();}


    @Override
    public void insert(K key, V value) {
        Entry<K,V> newEntry = new Entry<>(key,value);
        list.append(newEntry);
    }


    //remove a value given the key
    @Override
    public V remove(K key) {
        V temp = find(key);
        if(temp != null) list.remove();
        return temp;
    }

    //Remove and return the last element of the array
    @Override
    public V removeAny() {
        if(size() != 0){
            list.moveToEnd();
            list.prev();
            Entry<K,V> removedEntry = list.remove();
            return removedEntry.getValue();
        }
        else return null;
    }

    //find and return an elem given a key
    public V find(K _key) {
        Entry<K,V> temp = new Entry<>();
        for(list.moveToStart();list.currPos() < list.length(); list.next()){
           temp = list.getValue();
            K key = temp.getKey();
//            boolean keysMatch = (_key == key);
           if(_key.equals(key)){return temp.getValue();}
        }
        return null;
    }

    public int size() {
        return list.length();
    }

    public void print() {
        Entry<K,V> temp = new Entry<>();
        for(list.moveToStart();list.currPos() < list.length(); list.next()){
            temp = list.getValue();
            System.out.println(temp.getKey() + ":  " + temp.getValue());
        }
    }
}
