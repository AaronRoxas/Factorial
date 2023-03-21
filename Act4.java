import javax.swing.JOptionPane;

public class Act4 
{
    //declaring and initializing static variable
    static int result=1; 
    static int getNum = 0; 
    static String display = "";
    public static void main(String[] args)
    {
        //creating an object of class Act4
        Act4 sys = new Act4();
        
        getNum= Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        sys.factorial(); //calling the 'factorial' method of the Act4 object
    }

    public void factorial ()
    {
        //loop to calculate factorial of the input number
        for(int i = 1; i <=getNum; i++)
        {
          //multiplying each number in the loop to get the factorial value
          result *= i;
          display+=result;
        }
        JOptionPane.showMessageDialog(null, "The factorial of " +getNum + " is "+ display);
    }
}
