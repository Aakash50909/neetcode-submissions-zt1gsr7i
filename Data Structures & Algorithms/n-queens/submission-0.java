class Solution {
    public List<List<String>> solveNQueens(int n) 
    {
        char[][] board= new char[n][n];
        for(char[] row:board)
        {
            Arrays.fill(row,'.');
        }
        List<List<String>> result=new ArrayList<>();
        Set<Integer> cols= new HashSet<>();
        Set<Integer> posDiag= new HashSet<>();
        Set<Integer> negDiag= new HashSet<>();
        backtrack(result,board,cols,posDiag,negDiag,0);
        return result;
    }
    void backtrack(List<List<String>> result,char[][] board,Set<Integer> cols,Set<Integer> posDiag,Set<Integer> negDiag, int row)
    {
        if (row == board.length) {
            List<String> solution = new ArrayList<>();

            for (char[] r : board) {
                solution.add(new String(r));
            }

            result.add(solution);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            int pos = row + col;
            int neg = row - col;

            if (cols.contains(col) ||
                posDiag.contains(pos) ||
                negDiag.contains(neg)) {
                continue;
            }

            // choose
            board[row][col] = 'Q';
            cols.add(col);
            posDiag.add(pos);
            negDiag.add(neg);

            // recurse
            backtrack(result, board, cols, posDiag, negDiag, row + 1);

            // undo
            board[row][col] = '.';
            cols.remove(col);
            posDiag.remove(pos);
            negDiag.remove(neg);
        }
    }
}
