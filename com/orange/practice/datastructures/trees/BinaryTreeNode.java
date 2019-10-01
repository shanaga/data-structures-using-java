package com.orange.practice.datastructures.trees;

public class BinaryTreeNode {

    public String value;
    public BinaryTreeNode rightChild;
    public BinaryTreeNode leftChild;


    BinaryTreeNode(String value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public boolean hasLeftChild() {
        // Return true if the node has left child
        if (this.getLeftChild() == null) {
            return false;
        }
        return true;
    }

    public boolean hasRightChild() {
        // Returns true if the node has right child
        if (this.getRightChild() == null) {
            return false;
        }
        return true;
    }

    /*public boolean getRoot(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return false;
        } else {
            return true;
        }
    }*/

    /*public BinaryTreeNode getRoot() {
        if (this.hasRightChild() == false || this.hasLeftChild() == false) {
            return null;
        } else {
            return
        }
    }*/

    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode0 = new BinaryTreeNode("apple");
        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode("banana");
        BinaryTreeNode binaryTreeNode2 = new BinaryTreeNode("pear");

        System.out.println("Has Left Child ? " + binaryTreeNode0.hasLeftChild());
        System.out.println("Has Right Child ? " + binaryTreeNode0.hasRightChild());

        System.out.println("Adding Left & Right Children");
        binaryTreeNode0.setLeftChild(binaryTreeNode1);
        binaryTreeNode0.setRightChild(binaryTreeNode2);

        System.out.println("Has Left Child ? " + binaryTreeNode0.hasLeftChild());
        System.out.println("Has Right Child ? " + binaryTreeNode0.hasRightChild());

        System.out.println("Node 0 : " + binaryTreeNode0.value);
        System.out.println("Node 0 Left Child : " + binaryTreeNode0.leftChild.value);
        System.out.println("Node 0 Right Child : " + binaryTreeNode0.rightChild.value);
    }


}







