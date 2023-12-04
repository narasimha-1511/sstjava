 import java.util.Scanner;
 public class Matrix {
    // Define properties here
	int rows;
	int cols;
	int matrix[][];
		
	// Define constructor here
	public Matrix(int a,int b){
      this.rows =a;
	  this.cols = b;
      this.matrix = new int[a][b    ];
    }
	
	
	void input(Scanner sc){
	    // Use the Scanner object passed as argument for taking input and not a new Scanner object
		// Complete the function
        //int matrixaa[][] = new int[this.rows][this.cols];
        sc.nextLine();
		for(int i=0;i<this.rows;i++){
			for(int j=0;j<this.cols;j++){
             matrix[i][j]=sc.nextInt();
			}
		}	
	}
	
	Matrix add(Matrix x){
		// Complete the function
		Matrix add = new Matrix(this.rows,this.cols);

		for(int i=0;i<this.rows;i++){
			for(int j=0;j<this.cols;j++){
             add.matrix[i][j]=this.matrix[i][j]+x.matrix[i][j];
			}
		}

		return add;
		
	}
	
	Matrix subtract(Matrix x){
		// Complete the function
		Matrix sub = new Matrix(this.rows,this.cols);

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
             sub.matrix[i][j]=this.matrix[i][j]-x.matrix[i][j];
			}
		}

		return sub;
		
	}
		
	Matrix transpose(){
		// Complete the function
		Matrix trans = new Matrix(this.cols,this.rows);
		
     for(int i=0;i<cols;i++){// i is for columns
            for(int j=0;j<rows;j++){//j is for rows
             trans.matrix[i][j]=this.matrix[j][i];
            }
        }
		return trans;
	}
	
	void print(){
		// Complete the function
     for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++){
             System.out.print(this.matrix[i][j]+" ");
            }System.out.println();
        }
		
	}
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
     Matrix a = new Matrix(10, 5);  // 10 rows, 5 columns
	 a.input(in);
    }
}

/*
    Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
	a.input() 
	Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
	b.input()
    Matrix c1 = a.add(b)
    Matrix c2 = a.subtract(b)
    Matrix c3 = a.transpose()
    a.print()
*/