public class TicTacToe
{   
    String[][] ticTacToe = new String[3][3];
    
    public TicTacToe()
    {
        String[][] ticTacToe = {
                    {"-", "-","-"},
                    {"-", "-","-"},
                    {"-", "-","-"}
                    };
        this.ticTacToe = ticTacToe;
    }
    
    public String[][] getBoard()
    {
        return ticTacToe;
    }
    
}
