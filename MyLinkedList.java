public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){/*create a constructor*/
    this.size = 0;
    this.start = null;
    this.end = null;
  }

  public int size(){
    return this.size;
  }

  public boolean add(String value){
    Node myNode = Node(value);
    if (this.size == 0) {
      this.start = myNode;
      this.end = myNode;
      this.size++;
      this.start.prev = null;
      this.start.next = null;
      return true;
    } else {
      this.end.next = myNode;
      this.end = myNode;
      this.size++;
      this.end.next = null;
      return true;
    }
    return false;
  }

  public void add(int index, String value){
    Node myNode = Node(value);
    for (int i = 0; i < size; i++) {
      if (i == index) {

      }
    }
  }

  public String get(int index){

  }

  public String set(int index, String value){
    Node myNode = Node(value);
    for (int i = 0; i < this.size; i++) {
      if (i == index) {

      }
    }
  }

  public String toString(){
    String answer = "";
    Node now = this.start;
    for (int i = 0; i < this.size; i++) {
      answer += now.getData();
      now = now.next;
    }
    return answer;
  }

  //Any helper method that returns a Node object MUST BE PRIVATE!
}
