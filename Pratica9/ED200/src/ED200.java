import java.util.Scanner;

public class ED200 {
    public static int t(String[][] m,boolean[][] visited,int y, int x) {
        int L=m.length;
        int C= m[0].length;
        if (y<0 || y>=L || x<0 || x>=C) return 0;// Caso base: fora dos limites
        if (visited[y][x]) return 0; // Caso base: célula já visitada
        if (m[y][x].equals(".")) return 0; // Caso base: célula vazia
        int count = 1; // célula não vazia
        visited[y][x] = true;
        count += t(m,visited,y-1, x-1);// Adicionando células não vizinhas
        count += t(m,visited,y-1, x+1);
        count += t(m,visited,y+1, x-1);
        count += t(m,visited,y+1, x+1);
        count += t(m,visited,y-1, x);
        count += t(m,visited,y+1, x);
        count += t(m,visited,y,x+1);
        count += t(m,visited,y,x -1);
        return count;
    }

    public static String[][] read_array(Scanner input,int L,int C) {
        String[] m= new String[L];
        String[][] m_final= new String[L][C];
        for (int i=0;i< L;i++){
            m[i]=input.nextLine();
            for (int j=0;j<C;j++){
                m_final[i][j]= String.valueOf(m[i].charAt(j));
            }
        }
        return m_final;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        input.nextLine();
        int L;
        int C;
        String[][] m;
        boolean[][] visited;
        int highest_bacteria_count=0;
        int bacteria_count=0;
        for (int k=0;k<n;k++){
            L= input.nextInt();
            C= input.nextInt();
            input.nextLine();
            m = read_array(input,L,C);
            visited = new boolean[L][C];
            for (int i=0;i<L;i++){
                for (int j=0;j<C;j++){
                    if (!visited[i][j]){
                        bacteria_count=t(m,visited,i,j);
                        highest_bacteria_count=Math.max(highest_bacteria_count,bacteria_count);
                    }
                }
            }
            System.out.println(highest_bacteria_count);
            highest_bacteria_count=0;
            bacteria_count=0;
        }

    }
}