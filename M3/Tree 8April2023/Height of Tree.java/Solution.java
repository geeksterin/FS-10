public static int height(Node root) {
        if(root == null)
            return -1;
        
      	int leftH = height(root.left);
        int rightH = height(root.right);
        
        return Math.max(leftH, rightH) + 1;
        
    }