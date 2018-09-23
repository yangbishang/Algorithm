import java.util.Scanner;

public class Main3 {

    private static int[][] direct = {{0,1},{0,-1},{1,0},{-1,0}};
    private static boolean[][] visited;
    private static  int m , n;

    public static void main(String[] args) {

        //输入部分
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        char[][] board = new char[m][n];
        String[] strings = new String[m];
        for(int i=0; i< m; i++){
            strings[i] = scanner.next();
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<strings[i].length(); j++){
                board[i][j] = strings[i].charAt(j);
            }
        }
        String word = scanner.next();


        //逻辑开始
        visited = new boolean[m][n];

        boolean retFlag = false;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(findWord(board,0,i,j,m,n,word,visited))
                    retFlag = true;
            }
        }

        System.out.println(retFlag);


    }


    public static boolean findWord(char[][] board,int index, int x, int y,int m , int n , String word ,boolean[][] visted){
        if(index == word.length()-1)
            return board[x][y] == word.charAt(index);

        if(word.charAt(index) == board[x][y]){
            visted[x][y] = true;
            for(int i=0; i<4; i++){
                int newX = x + direct[i][0];
                int newY = y + direct[i][1];
                if(inArea(newX,newY,m,n) && visted[newX][newY] != true){
                    if(findWord(board,index+1, newX, newY, m, n, word, visted))
                        return true;
                }

            }
            visted[x][y] = false;
        }


        return false;


    }

    public static boolean inArea(int x, int y, int m , int n){
        return x<m && x>=0 && y<n && y>=0;
    }
}
