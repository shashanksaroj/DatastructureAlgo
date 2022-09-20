package com.shashank.main;

public class BinarySearchTree {
    class Node {

        int key;
        Node left, right;

        public Node(int item) {
            left = right = null;
        }

    }

    Node root;

    public BinarySearchTree() {

        root = null;

    }


    public static void main(String[] args) {

    }

    void insert(int key) {
        root = insertrec(root, key);

    }

    Node insertrec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;

        }

        if (key < root.key)
            root.left = insertrec(root.left, key);
        else if (key > root.key)
            root.right = insertrec(root.right, key);


        return root;

    }

    void deletekey(int key) {

        root = deleterec(root, key);

    }

    Node deleterec(Node root, int key) {

        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleterec(root.left, key);
        else if (key > root.key)
            root.right = deleterec(root.right, key);
        else {

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);
            root.right = deleterec(root.right, root.key);

        }
        return root;
    }

    int minValue(Node root) {


        int minv = root.key;

        while (root.left != null) {

            minv = root.left.key;

            root = root.left;


        }
        return minv;
    }


}
