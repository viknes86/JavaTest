
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

public void removeAt(int index){
    //Validatet the index
    if (index < 0 || index >= count){
    throw new IllegalArgumentException();
    }
    //Shift the items to left to fill the whole
    for (int i = index; i < count-1; i++){
     items[i] = items[i+1];
     
    }
items[count-1] = 0;    
count--;
}

public int indexOf(int item){

 for (int i = 0; i < count; i++)
 {
    if (items[i] == item)
    {
        return i;
    }

   
 }
 return -1;
 
}

public void print(){
    for (int i = 0; i < items.length; i++)
    System.out.println(items[i]);
}

}