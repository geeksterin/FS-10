public static void preOrder(Node root) {
        if(root == null)
            return;
        
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);

    }

    public static void inOrder(Node root) {
         if(root == null)
            return;
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        
    }

    public static void postOrder(Node root) {
        if(root == null)
            return;
        
        postOrder(root.left);
        postOrder(root.right);
        
        System.out.print(root.data + " ");
    }