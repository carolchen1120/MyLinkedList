public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){/*create a constructor*/
    this.size = 0;
  }

  public int size(){
    return this.size;
  }

  public boolean add(String value){
    Node myNode = Node(value);
    if (this.size == 0) {
      this.start = myNode;
      this.end = myNode;
      return true;
    } else {
      this.end = myNode;
      return true;
    }
    return false;
  }

  public void add(int index, String value){

  }

  public String get(int index){

  }

  public String set(int index, String value){

  }

  public String toString(){

  }

  //Any helper method that returns a Node object MUST BE PRIVATE!
}
