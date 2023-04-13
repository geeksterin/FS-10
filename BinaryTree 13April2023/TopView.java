/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

    static class QuObj{
        Node node;
        int ln;
        
        QuObj(Node n, int l){
            node = n;
            ln = l;
        }
    }

    
	public static void topView(Node root) {
      Queue<QuObj> qu = new LinkedList(); 
        
        TreeMap<Integer, Integer> tm = new TreeMap();
        
        //seeding
        qu.add(new QuObj(root, 0));
        
        while(qu.size() != 0){
            //remove
            QuObj rem = qu.remove();
            
            int key = rem.ln;
            int value = rem.node.data;
            
            //work
            if(!tm.containsKey(key)){
                tm.put(key, value);
            }
            
            //add child
            
            if(rem.node.left != null){
                qu.add(new QuObj(rem.node.left, rem.ln-1));
            }
            if(rem.node.right != null){
                qu.add(new QuObj(rem.node.right, rem.ln+1));
            }
            
            
        }
        
        //PrintANs
        for(int key : tm.keySet()){
            System.out.print(tm.get(key) + " ");
        }
        
        
      
    }