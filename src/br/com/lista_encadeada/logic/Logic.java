package br.com.lista_encadeada.logic;

public class Logic {
	private Node head;

	public Logic() {
		this.head = null;
	}

	public void inserir(int data) {
		head = inserirFuncaoRecursiva(head, data);
	}

	private Node inserirFuncaoRecursiva(Node current, int data) {
		if (current == null) {
			return new Node(data);
		}
		Node newNode = new Node(data);
		newNode.setNext(current);
		return newNode;
	}

	public boolean buscar(int data) {
		return buscarFuncaoRecursiva(head, data);
	}

	private boolean buscarFuncaoRecursiva(Node current, int data) {
		if (current == null) {
			return false;
		}
		if (current.getData() == data) {
			return true;
		}
		return buscarFuncaoRecursiva(current.getNext(), data);
	}

	public boolean remover(int data) {
		if (head == null) {
			return false;
		}
		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}
		return removerFuncaoRecursiva(head, data);
	}

	private boolean removerFuncaoRecursiva(Node current, int data) {
		if (current.getNext() == null) {
			return false;
		}
		if (current.getNext().getData() == data) {
			current.setNext(current.getNext().getNext());
			return true;
		}
		return removerFuncaoRecursiva(current.getNext(), data);
	}
}
