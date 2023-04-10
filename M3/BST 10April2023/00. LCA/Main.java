public static Node lca(Node root, int v1, int v2) {
        if(root == null)
            return null;
        
      	Node lca = root;
        
        while(true){
            if(v1 > lca.data && v2 > lca.data){
                //1. right
                lca = lca.right;
            }
            else if(v1 < lca.data && v2 < lca.data){
                //2. left
                lca = lca.left;
            }
            else{
                return lca;
            }
        }
        
    }