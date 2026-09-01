class Solution {
    public boolean exist(char[][] board, String word) 
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if (board[i][j] == word.charAt(0)) 
                {
                    if (search(board, word, i, j, 0))
                        return true;
                }
            }
        }
        return false;
        
    }
    boolean search(char[][] board, String word, int row, int col,int k)
    {
        if(row>=board.length || col>=board[0].length || row<0 || col<0)
        return false;
        if(board[row][col]!=word.charAt(k))
        return false;
        if(k==word.length()-1)
        return true;
        //mark visited
        char x=board[row][col];
        board[row][col]=' ';
        boolean found=search(board,word,row+1,col,k+1)||                      search(board,word,row-1,col,k+1)||
        search(board,word,row,col+1,k+1)||
        search(board,word,row,col-1,k+1);
        
        if(found==true)
        {  
            board[row][col]=x;
            return true;
        }
        board[row][col]=x;
        return false;
    }
}
