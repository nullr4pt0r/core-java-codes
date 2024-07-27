package multithreading.binaryTree;

import java.util.concurrent.*;

class Node{
    int data;
    Node left;
    Node right;
}

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService es;
    TreeSizeCalculator(Node node, ExecutorService es){
        root = node;
        this.es = es;
    }
    public Integer call() throws ExecutionException, InterruptedException {
        if(root == null){
            return 0;
        }

        Future<Integer> leftFuture = es.submit(new TreeSizeCalculator(root.left, es));
        Future<Integer> rightFuture = es.submit(new TreeSizeCalculator(root.right,es));

        return leftFuture.get()+rightFuture.get()+1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Node root = new Node();
        root.data = 1;
        root.left = new Node();
        root.left.data = 2;
        root.right = new Node();
        root.right.data = 3;

        ExecutorService es = Executors.newCachedThreadPool();
        System.out.println(es.submit(new TreeSizeCalculator(root, es)).get());
    }
}