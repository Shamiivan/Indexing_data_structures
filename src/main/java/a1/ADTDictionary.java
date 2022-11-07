package a1;

public interface ADTDictionary<K, V>  {
    /*Reinitialize dict*/
    void clear();

    //insert a record
    void insert(K key, V value);

    //given keys remove and return elem
    V remove(K key);
    //remove arbitrary record from dict and return the record remove
    V removeAny();

    V find(K key);

    int size(); // return number of record

    //print whole collection
    void print();
}

