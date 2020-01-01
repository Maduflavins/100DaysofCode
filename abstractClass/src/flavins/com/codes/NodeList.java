package flavins.com.codes;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void tranverseItem(ListItem root);
}
