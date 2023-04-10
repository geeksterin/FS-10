int prev = Integer.MIN_VALUE;  
    
    boolean checkBST(Node root) {
        if(root == null){
            return true;
        }
        
        boolean la = checkBST(root.left);
        if(la == false)
            return false;
        //process
        
        if(prev >= root.data){
            return false;
        }
        
        prev = root.data;
        
        boolean ra = checkBST(root.right);
        if(ra == false)
            return false;
        
        return true;
        
    
    
        
    }