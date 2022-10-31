import java.util.Scanner;
public class Matrix {
    int data[][]; // os elementos da matriz em si
    int rows;     // numero de linhas
    int cols;     // numero de colunas

    // construtor padrao de matriz
    Matrix(int r, int c) {
        data = new int[r][c];
        rows = r;
        cols = c;
    }

    // Ler os rows x cols elementos da matriz
    public void read(Scanner in) {
        for (int i=0; i<rows; i++)
            for (int j=0; j<cols; j++)
                data[i][j] = in.nextInt();
    }

    // Representacao em String da matriz
    public String toString() {
        String ans = "";
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++)
                ans += data[i][j] + " ";
            ans += "\n";
        }
        return ans;
    }

    public static Matrix identity(int n){
        Matrix m1 = new Matrix(n,n);
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j==i){
                    m1.data[j][i]=1;
                }
            }
        }
        return m1;
    }

    public Matrix transpose(){
        Matrix m = new Matrix(this.cols,this.rows);
        for (int i=0;i<this.cols;i++){
            for (int j=0;j<this.rows;j++){
                m.data[i][j]=data[j][i];
            }
        }
        return m;
    }


    public Matrix sum(Matrix m){
        if (this.rows==m.rows && this.cols==m.cols){
            Matrix soma = new Matrix(this.rows,this.cols);
            for (int i=0;i<soma.rows;i++){
                for (int j=0;j<soma.cols;j++){
                    soma.data[i][j]=this.data[i][j]+m.data[i][j];
                }
            }
            return soma;
        }else return null;
    }
    public Matrix multiply(Matrix m){
        if (this.cols==m.rows){
            Matrix mult = new Matrix(this.rows,m.cols);
            for (int i=0;i<mult.rows;i++){
                for (int j=0;j<mult.cols;j++){
                    for (int k=0;k<m.rows;k++){
                    mult.data[i][j]+=this.data[i][k]*m.data[k][j];
                    }
                }
            }
            return mult;
        }else return null;
    }
}
