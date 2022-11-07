package a1;


public class WarehouseInventory {
    static DDictionary<String, Inventory> collection = new DDictionary<>();


    void clear() {
        collection.clear();
    }

    //insert a record
    void insert(String _key, Inventory _inventory){
        collection.insert(_key,_inventory);
    }

    //given keys remove and return elem
    public Inventory remove(String _key){
        Inventory elem = collection.remove(_key);
        return elem;
    }
    //remove arbitrary record from dict and return the record remove
    public Inventory removeAny(){

        Inventory elemToRemove = collection.removeAny();
        return elemToRemove;
    }

    public Inventory find(String _key){
        return collection.find(_key);
    }

    public int size(){
        return collection.size();
    }
    public void print(){
        collection.print();}

}
