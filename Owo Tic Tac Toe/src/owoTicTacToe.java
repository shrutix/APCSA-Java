/*basically prints
+-----------+-----------+-----------+
|   o w o   |   o w o   |   o w o   |
+-----------+-----------+-----------+
|   o w o   |   o w o   |   o w o   |
+-----------+-----------+-----------+
|   o w o   |   o w o   |   o w o   |
+-----------+-----------+-----------+
 */
public class owoTicTacToe {

	public static final int SIZE = 3;
	   
    public static void main(String[] args){
        for (int i=0; i<SIZE; i++) {
            createOwO();
        }
        outline();
        System.out.print("+");
    }
    public static void createOwO(){
        outline();
        System.out.println("+");
        owo();
        System.out.println("|");
    }
    public static void outline(){
        repeat("+-----------", SIZE);
    }
    public static void owo(){
        repeat("|   o w o   ", SIZE);
    } 
    public static void repeat(String s, int n){
        for(int i=0; i < n; i++) 
        	System.out.print(s);
    }
}
