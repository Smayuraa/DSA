package TRIE;

public class InsertTrie {
    static class Node{
        Node childern[]=new Node[26];
        boolean eow=false;

        Node()
        {
            for(int i=0;i<26;i++)
            {
                childern[i]=null;
            }
        }
        public static Node root=new Node();
    }
        public static void insertNode(String Word)
        {
            Node curr=Node.root;
            for(int i=0;i<Word.length();i++)
            {
                int idx=Word.charAt(i)-'a';
                if(curr.childern[idx]==null)
                {
                    curr.childern[idx]=new Node();
                }
                curr=curr.childern[idx];
            }
            curr.eow=true;
        }
        

    
    public static void main(String[]args)
    {
        String Word[]={"the","a","there","an","their"};
        for(int i=0;i<Word.length;i++)
        {
            insertNode(Word[i]);
        }
    }

}



