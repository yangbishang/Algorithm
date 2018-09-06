/**
 给定一个二维网格和一个单词，找出该单词是否存在于网格中。

 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

 示例:

 board =
 [
 ['A','B','C','E'],
 ['S','F','C','S'],
 ['A','D','E','E']
 ]

 给定 word = "ABCCED", 返回 true.
 给定 word = "SEE", 返回 true.
 给定 word = "ABCB", 返回 false.
 */
public class Solution_79 {
    private int d[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    private int m,n;
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        if(board == null || word == null)
            throw new IllegalArgumentException("board or word can not be null");

        m = board.length;
        n = board[0].length;

        visited = new boolean[m][n];
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                if(searchWord(board,word,0,i,j))
                    return true;

        return false;
    }

    private boolean inArea(int x, int y){
        return x>=0 && x<m && y>=0 && y<n;
    }

    private boolean searchWord(char[][] board, String word, int index , int startx , int starty){
        if(index == word.length() - 1)
            return board[startx][starty] == word.charAt(index);

        if(board[startx][starty] == word.charAt(index)){
            visited[startx][starty] = true;
            for(int i=0; i<4 ; i++){
                int newx = startx + d[i][0];
                int newy = starty + d[i][1];
                if(inArea(newx,newy) && !visited[newx][newy])
                    if(searchWord(board , word , index+1 , newx, newy))
                        return true;
            }
            visited[startx][starty] = false;
        }
        return false;
    }




    public static void main(String args[]){

        char[][] b1 = { {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};

        String words[] = {"ABCCED", "SEE", "ABCB" };
        for(int i = 0 ; i < words.length ; i ++)
            if((new Solution_79()).exist(b1, words[i]))
                System.out.println("found " + words[i]);
            else
                System.out.println("can not found " + words[i]);

        // ---

        char[][] b2 = {{'A'}};
        if((new Solution_79()).exist(b2,"AB"))
            System.out.println("found AB");
        else
            System.out.println("can not found AB");
    }
}
