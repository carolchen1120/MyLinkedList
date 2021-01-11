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

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node change) {
    this.next = change;
  }

  public Node getPrev() {
    return this.prev;
  }

  public void setPrev(Node change) {
    this.prev = change;
  }

  //write get/set methods for all three instance variables.
}
