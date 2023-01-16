package com.bridgelabz.day16.UC_Day16and17_Datastructure;

import java.util.Scanner;

public class BalancedParenthesis<T> {
	class Node {
		String element;
		Node next;

		public Node(String element) {
			this.element = element;
			this.next = null;
			BalancedParenthesis.size++;
		}
	}

	private T t;
	static int size;
	Node head;

	public BalancedParenthesis(T t) {
		this.t = t;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void push(String data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void pop() {
		// System.out.println(head.element);
		deleteFirst();
	}

	private void deleteFirst() {
		if (isEmpty()) {
			return;
		}
		head = head.next;
		size--;
	}

	public void peek() {
		if (isEmpty()) {
			return;
		}
		System.out.println(head.element);
	}

	public int getSize() {
		System.out.println();
		return size;
	}

	public boolean checkParanthesis() {
		String expression = (String) t;
		String[] str = expression.split("(?!^)");
		for (String element : str) {
			if (element.hashCode() == "(".hashCode()) {
				push(element);
			} else if (element.hashCode() == ")".hashCode()) {
				pop();
			}
		}
		if (isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the expression:");
		String expression = scan.nextLine();
		BalancedParenthesis<String> balancedParenthesis = new BalancedParenthesis<>(expression);
		System.out.println(balancedParenthesis.checkParanthesis());
	}
}
