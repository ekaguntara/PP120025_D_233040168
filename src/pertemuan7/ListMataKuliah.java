package Tugas7;

public class ListMataKuliah {

    Node HEAD;
    
    public void addHead(MataKuliah data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail (MataKuliah data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) 
		{
			HEAD = newNode;
		}
		else
		{
			Node posNode = null;
			Node curNode = HEAD;
			
			while (curNode != null)
			{
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
	  }


    }

    public void AddMid(MataKuliah data, int position) {
        Node  posNode = null, curNode = null;
        double i;

        Node newNode = new Node( data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
        }

        if (position == 1) {
            newNode.next = curNode;
            HEAD = newNode;

        } else {
            i = 1;
            while (curNode != null && i < position) {
                posNode = curNode;
                curNode = curNode.next;
                i++;
            }
            posNode.next = newNode;
            newNode.next = curNode;
        }
    
    }

    public void removeHead() {
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeTail() {
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node lastNode = HEAD;
            Node preNode = null;

            while (lastNode.getNext() != null) {
                preNode = lastNode;
                lastNode = lastNode.getNext();
            }

            preNode.setNext(null);
            dispose(lastNode);
        }
    }

   public void removeMid(int data) {
    if (isEmpty()) {
        System.out.println("List is empty");
        return;
    }

    Node tempNode = HEAD;
    Node preNode = null;

    while (tempNode != null) {
        if (tempNode.getData().getSks() == data) {
            // Data ditemukan
            if (preNode == null) {
                // Data ada di HEAD
                HEAD = tempNode.getNext();
            } else {
                preNode.setNext(tempNode.getNext());
            }

            System.out.println("Data dengan SKS " + data + " berhasil dihapus");
            return;
        }

        preNode = tempNode;
        tempNode = tempNode.getNext();
    }

    System.out.println("Data dengan SKS " + data + " tidak ditemukan");
}

    public boolean isEmpty() {
        return HEAD == null;
    }

    private void dispose(Node node) {
        node.setNext(null);
        node = null;
    }

    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;
        
        while (curNode != null && !ketemu) {
            if (curNode.getData().getSks() == x) {
                ketemu = true;
            } else {
                curNode = curNode.getNext();
            }

        }
            return ketemu;
    }

    public int count() {
        Node curNode = HEAD;
        int jumlah = 0;

        while (curNode != null) {
            jumlah++;
            curNode = curNode.next;
        }

        return jumlah;
    }

    public void displayElement() {
    if (isEmpty()) {
        System.out.println("List Kosong");
    } else {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.println( "Matakuliah: " +
                curNode.getData().getKode() + " - " +
                curNode.getData().getNama() + " - " +
                curNode.getData().getSks()
            );
            curNode = curNode.getNext();
        }
    }
}


}
