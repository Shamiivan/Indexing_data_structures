package a1;

public class DDictionary<K,V> implements ADTDictionary<K,V> {
    private DoubleLinkedList<Entry<K,V>> list;
    /*Constructors*/
    DDictionary(){
        list = new DoubleLinkedList<>();
    }

    @Override
    public void clear() {list.clear();}


    @Override
    public void insert(K key, V value) {
        Entry<K,V> newEntry = new Entry<>(key,value);
        list.append(newEntry);
    }


    @Override
    public V remove(K key) {
        V temp = find(key);
        if(temp != null) list.remove();
        return temp;
    }


    public V removeAny() {
        if(size() != 0){
            list.moveToEnd();
            list.prev();
            Entry<K,V> removedEntry = list.remove();
            return removedEntry.getValue();
        }
        else return null;
    }

    //return an elem given a key
    public V find(K _key) {
        Entry<K,V> temp = new Entry<>();
        for(list.moveToStart();list.currPos() < list.length(); list.next()){
            temp = list.getValue();
            K key = temp.getKey();
            boolean theyMatch = key == _key;
            if(_key.equals(key)){
                System.out.println("Found the right keu");
                return temp.getValue();
            }
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
    public V[] createIndex(String attribute){
        //return an array of
        return null;
    }
}
