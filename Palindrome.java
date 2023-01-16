package com.bridgelabz.day16.UC_Day16and17_Datastructure;

import java.util.Scanner;

public class Palindrome<K> {

	class Node {
		Node next;
		String letter;

		public Node(String letter) {
			this.next = null;
			this.letter = letter;
		}
	}

	private K k;
	Node head;
	static int size;

	public Palindrome(K k) {
		this.k = k;
	}

	public boolean palindromeChecker() {
		String[] s = ((String) k).split("(?!^)");
		if (s.length == 1) {
			return true;
		}
		for (String letter : s) {
			addFirst(letter);
		}
		while (head.next != null) {
			if (removeFirst().hashCode() != removeLast().hashCode()) {
				return false;
			}
			if (head == null) {
				return true;
			}
		}
		return true;
	}

	private boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	private void addFirst(String letter) {
		Node newNode = new Node(letter);
		if (isEmpty()) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	public void addLast(String letter) {
		Node newNode = new Node(letter);
		if (isEmpty()) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public String removeFirst() {
		if (isEmpty()) {
			return " ";
		}
		Node temp = head;
		head = head.next;
		size--;
		return temp.letter;
	}

	public String removeLast() {
		if (isEmpty()) {
			return " ";
		}
		size--;
		if (head.next == null) {
			Node temp = head;
			head = null;
			return temp.letter;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node temp1 = temp.next;
		temp.next = null;
		return temp1.letter;
	}

	public int getSize() {
		System.out.println();
		return size;
	}
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the string : ");
	        String str = scan.nextLine();
	        Palindrome<String> palindrome = new Palindrome<String>(str);
	        System.out.println(palindrome.palindromeChecker());
	}
}
