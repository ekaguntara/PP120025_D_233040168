package Tugas6;

public class StrukturList {

    Node HEAD;

      public void addHead(int data) {
		Node newNode = new Node(data);
		if (HEAD==null) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}

     public void addTail (int data) {
		Node newNode = new Node(data);
		
		if (HEAD==null) 
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

     public void AddMid(int data, int position) {
        Node  posNode = null, curNode = null;
        double i;

        Node newNode = new Node( data);

        if (HEAD == null) {
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


    public boolean isEmpty() {
        return HEAD == null;
    }

    private void dispose(Node node) {
        node.setNext(null);
        node = null;
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
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node preNode = null;
            Node tempNode = HEAD;
            boolean ketemu = false;
            int i = 1;

            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getData() == data) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (tempNode.getNext() == null && tempNode.getData() == data) {
                ketemu = true;
            }

            if (ketemu) {
                if (i == 1) {
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            } else {
                System.out.println("Data "+ data + "tidak ditemukan");
            }
        }
    }

    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;
        
        while (curNode != null && !ketemu) {
            if (curNode.getData() == x) {
                ketemu = true;
            } else {
                curNode = curNode.getNext();
            }

        }
            return ketemu;
    }

    public int size() {
        Node curNode = HEAD;
        int jumlah = 0;

        while (curNode != null) {
            jumlah++;
            curNode = curNode.next;
        }

        return jumlah;
    }

    public void clear() {
        HEAD = null;
        System.out.println("List kosong");
    }

     public void displayElement() {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getData()+ "  ");
			curNode = curNode.getNext();
		}
	}
}
