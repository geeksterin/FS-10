public static void levelOrder(Node root) {
        
        Queue<Node> qu = new LinkedList();
        qu.add(root);    //seeding
        
        while(qu.size() != 0){      //if there is something in ur qu
            //rwa
            //remove
            Node rem = qu.remove();   
            //work
            System.out.print(rem.data + " ");
            //add children
            if(rem.left != null)
                qu.add(rem.left);
            if(rem.right != null)
                qu.add(rem.right);
        }
        
      
      
    }