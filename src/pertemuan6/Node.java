package Tugas6;

    public class Node {
    private int data;
	Node next;
		
		//inisialisasi node
		public Node(int data) {
			this.data = data;
		}
		
		
		// getter & setter
		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
    }


