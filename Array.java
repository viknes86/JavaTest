
public class Array {

private int [] items;
private int count = 0;

public Array(int length) {
    items = new int [length];

}

public void insert(int item){
    //If the array if full, resize it
if (items.length == count){
    //Create a new array (twice the size)
    int [] newItems = new int[count*2];

    //Copy all the existing items
    for (int i = 0; i < count; i++)
     newItems[i] = items [i];
    //set "items" to this new array
    items = newItems;
}
    //Add the new item at the end
    items[count] = item;
    count++;
}

public void print(){
    for (int i = 0; i < items.length; i++)
    System.out.println(items[i]);
}

}