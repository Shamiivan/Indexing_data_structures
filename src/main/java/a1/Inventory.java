package a1;


public class Inventory {
    private String Id;
    private String name;
    private String description;
    private double unitPrice;

    private int quantityInStock;
    private double inventoryValue;
    private int reorderLevel; // amount of reorders made
    private int reorderTime; // time to reoder in days
    private int quantityInReorder;



    /*Constructors*/
    Inventory(){}
    Inventory(String _id, String _name, String _description, double _unityPrice, int _quantityInStock, double _inventoryValue,
              int _reorderLevel,int _reorderTime, int _quantityReorder, boolean discontinued){
        Id = _id;
        name = _name;
        description = _description;
        unitPrice = _unityPrice;
        quantityInStock = _quantityInStock;
        inventoryValue = _inventoryValue;
        reorderLevel = _reorderLevel;
        reorderTime = _reorderTime;
        quantityInStock = _quantityReorder;
    }

    //getters and setters
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getInventoryValue() {
        return inventoryValue;
    }

    public void setInventoryValue(double inventoryValue) {
        this.inventoryValue = inventoryValue;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public int getReorderTime() {
        return reorderTime;
    }

    public void setReorderTime(int reorderTime) {
        this.reorderTime = reorderTime;
    }

    public int getQuantityInReorder() {
        return quantityInReorder;
    }

    public void setQuantityInReorder(int quantityInReorder) {
        this.quantityInReorder = quantityInReorder;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    boolean discontinued;

}
