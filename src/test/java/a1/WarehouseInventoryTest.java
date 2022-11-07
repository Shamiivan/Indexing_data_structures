package a1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WarehouseInventoryTest {
    public static WarehouseInventory wi;
    public static Inventory inv;


    @BeforeAll
    public static void setUp() {
        wi = new WarehouseInventory();
        inv = new Inventory("IN0001",
                "Item 1", "Desc", 1.56,
                25, 1275.56, 29,
                13, 50, true);
    }

    @BeforeEach
    public void setup() {
        wi.clear();
        for (int i = 0; i < 3; i++) {
            inv = new Inventory();
            String newID = "IN0001" + (i + 1);
            String newDescription = "Desc" + (i + 1);
            inv.setDescription(newDescription);
            inv.setId(newID);
            wi.insert(inv.getId(), inv);
        }
    }

    @Test
    void clear() {
        wi.clear();
        assertEquals(0, wi.size());
    }

    @Test
    void insert() {

        String newID = "IN0001" + 11;
        String newDescription = "Desc" + 11;
        inv = new Inventory();
        inv.setDescription(newDescription);
        inv.setId(newID);
        wi.insert(inv.getId(), inv);
        assertEquals(4, wi.size(), "Insertion");
    }

    @Test
    void remove() {
        //remove the 9th element
        String elemToRemove = "IN00011" ;
        Inventory removed = wi.remove(elemToRemove);
        assertEquals(2, wi.size(), "Remove element by ID failed");
        assertEquals(elemToRemove, removed.getId(), "Remove element by ID failed");
    }

    //remove any removes the last element of the dictionary
    @Test
    void removeAny() {
        Inventory removed = wi.removeAny();
        assertEquals(2, wi.size(), "Remove element by ID failed");
        assertEquals("IN00013", removed.getId(), "Remove element by ID failed");

    }

    @Test
    void find() {
//        wi.print();
        System.out.println(wi.find("IN00011"));
        assertEquals("IN00011", wi.find("IN00011").getId(), "Find element failed");
    }

    @Test
    void size() {
    }
}
