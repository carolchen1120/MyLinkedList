public class Node{
  private String data;
  private Node next,prev;

  public Node(String value){
    this.data = value;
  }

  public String getData() {
    return this.data;
  }

  public String setData(String change) {
    this.data = change;
    return change;
  }

  public String getNext() {
    return this.next;
  }

  public String setNext(String change) {
    this.next = change;
    return change;
  }

  public String getPrev() {
    return this.prev;
  }

  public String setPrev(String change) {
    this.prev = change;
    return change;
  }

  //write get/set methods for all three instance variables.
}
