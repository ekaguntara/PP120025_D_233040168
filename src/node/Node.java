package node;

public class Node {
	private int nilai;
	private Node next;
	
	// getter & setter
	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	//inisialisasi node
	public Node(int nilai) {
		this.nilai = nilai;
	}
	
}