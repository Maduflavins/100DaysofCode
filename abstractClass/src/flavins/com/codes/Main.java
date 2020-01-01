package flavins.com.codes;

public class Main {

    public static void main(String[] args) {

        myLinkedList list = new myLinkedList(null);
        list.tranverseItem(list.getRoot());
	    String stringData = "Darwin Brisbane Perth Melborne Camberra Adelaide Sydney Camberra";

	    String[] data = stringData.split(" ");
	    for(String s: data){
            list.addItem(new Node(s));
        }

	    list.tranverseItem(list.getRoot());
    }
}
