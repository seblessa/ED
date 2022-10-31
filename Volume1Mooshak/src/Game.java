import java.util.Scanner;
import java.lang.Math;
// Classe para representar um jogo
class Game {
    final char DEAD  = '.';  // Constante que indica uma celula morta
    final char ALIVE = 'O';  // Constante que indica uma celula viva
    private int rows, cols;  // Numero de linhas e colunas
    private char m[][];      // Matriz para representar o estado do jogo

    // Construtor: inicializa as variaveis tendo em conta a dimensao dada
    Game(int r, int c) {
        rows = r;
        cols = c;
        m = new char[r][c];
    }

    // Metodo para ler o estado inicial para a matriz m[][]
    public void read(Scanner in) {
        for (int i=0; i<rows; i++)
            m[i] = in.next().toCharArray();
    }

    // Metodo para escrever a matriz m[][]
    public void write() {
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

    // Deve devolver o numero de celulas vivas que sao vizinhas de (y,x)
    private int countAlive(int y, int x) {
        int count = 0;

        if (rows==1 && cols==1){
            return 0;
        }
        int yliminf=Math.max(0,y-1);
        int ylimsup=Math.min(rows-1,y+1);
        int xliminf=Math.max(0,x-1);
        int xlimsup=Math.min(cols-1,x+1);
        for (int i=yliminf;i<=ylimsup;i++){
            for (int j=xliminf;j<=xlimsup;j++){
                if (m[i][j]==ALIVE){
                    count++;
                }
            }
        }
        if (m[y][x]==ALIVE && count>0)
            count--;
        return count;
    }

    // Deve fazer uma iteracao: cria nova geracao a partir da actual
    public void iterate() {
        char[][] n = new char[rows][cols];
        for (int i=0;i<m.length;i++) {
            for (int j = 0; j < m[0].length; j++) {
                n[i][j] = DEAD;
            }
        }
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++){
                if (m[i][j]==ALIVE){
                    switch (countAlive(i, j)) {
                        case 0,1:
                            n[i][j] = DEAD;
                            break;
                        case 2,3:
                            n[i][j] = ALIVE;
                            break;
                        case 4,5,6,7,8:
                            n[i][j] = DEAD;
                            break;
                    }
                } else if (countAlive(i,j)==3) {
                    n[i][j]=ALIVE;
                }
            }
        }
        m=n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ler linhas, colunas e numero de iteracoes
        int rows = in.nextInt();
        int cols = in.nextInt();
        int n    = in.nextInt();

        // Criar objecto para conter o jogo e ler estado inicial
        Game g = new Game(rows, cols);
        g.read(in);

        for (int i=0;i<n;i++){
            g.iterate();

        }
        g.write();
    }
}

