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
    Node myNode = new Node(value);
    if (this.size == 0) {
      this.start.setData(myNode.getData());
      this.end.setData(myNode.getData());
      this.size++;
      this.start.setPrev(null);
      this.start.setPrev(null);
      return true;
    } else {
      this.end.setNext(myNode);
      this.end.setData(myNode.getData());
      this.size++;
      this.end.setNext(null);
      return true;
    }
  }

  public void add(int index, String value){
    Node myNode = new Node(value);
    Node now = new Node(this.start.getData());
    for (int i = 0; i < this.size; i++) {
      if (i < index-1) {
        now.setData(now.getNext().getData());
      } else if (i == index - 1) {
        now.setNext(myNode);
        now.setData(now.getNext().getNext().getData());
      } else if (i == index) {
        now.setData(myNode.getData());
      } else if (i == index + 1) {
        now.setPrev(myNode);
        now.setData(now.getNext().getNext().getData());
      } else if (i > index + 1) {
        now.setData(now.getNext().getNext().getData());
      }
    }
    this.size++;
  }

  public String get(int index){
    Node now = new Node(this.start.getData());
    String answer = "";
    for (int i = 0; i < this.size; i++) {
      if (i == index) {
        answer += now.getData();
      } else {
        now.setData(now.getNext().getData());
      }
    }
    return answer;
  }

  public String set(int index, String value){
    Node myNode = new Node(value);
    Node now = new Node(this.start.getData());
    for (int i = 0; i < this.size; i++) {
      if (i == index) {
        if (i < index-1) {
          now.setData(now.getNext().getData());
        } else if (i == index - 1) {
          now.setNext(myNode);
        } else if (i == index) {
          now.setData(myNode.getData());
        } else if (i == index + 1) {
          now.setPrev(myNode);
        }
      }
    }
    return value;
  }

  public String toString(){
    String answer = "[";
    Node now = new Node(this.start.getData());
    for (int i = 0; i < this.size-1; i++) {
      answer += now.getData();
      answer += ", ";
      now.setData(now.getNext().getData());
    }
    answer += this.end.getData();
    return answer + "]";
  }

  public String remove(int index) {
    Node now = new Node(this.start.getData());
    String answer = "";
    for (int i = 0; i < this.size; i++) {
      if (i < index-1) {
        now.setData(now.getNext().getData());
      } else if (i == index - 1) {
        now.setData(now.getNext().getData());
        now.setNext(now.getNext().getNext());
      } else if (i == index) {
        answer += now.getData();
        now.setData(now.getNext().getNext().getData());
      } else if (i > index - 1) {
        now.setData(now.getNext().getNext().getData());
      }
    }
    this.size--;
    return answer;
  }

  /*
  *@postcondition: All of the elements from other are removed from the other, and connected to the end of this linked list.
  *@postcondition: The size of other is reduced to 0.
  *@postcondition: The size of this is now the combined sizes of both original lists
  */
  public void extend(MyLinkedList other){
    Node now = new Node(other.start.getData());
    this.end.setNext(now);
    for (int i = 0; i < other.size; i++) {
      this.add(now.getData());
      now.setData(now.getNext().getData());
    }
    this.size += other.size;
  }

  //Any helper method that returns a Node object MUST BE PRIVATE!
}
