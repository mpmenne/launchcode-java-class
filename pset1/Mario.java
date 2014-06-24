// put imports here

public class Mario
{
    // initializations?
    private String space;
    private String brick;
    private String chasm;
    private String nline;
    private int num_rows;
    
    public Mario(int height)
    {
        space = " ";
        brick = "#";
        chasm = "\t";
        nline = "\n";
        num_rows = height;
    }
    
    public void printRow(int num_sp, int num_br)
    {
        // count down for spaces
        for (int s = num_sp; s > 0; s--)
            System.out.print(space);
        // count up for bricks
        for (int b = 0; b < num_br; b++)
            System.out.print(brick);
    }

    public void printReversedRow(int num_sp, int num_br)
    {
        // count up for bricks
        for (int b = 0; b < num_br; b++)
            System.out.print(brick);
        // count down for spaces
        for (int s = num_sp; s > 0; s--)
            System.out.print(space);
    }

    public void printPyramid(boolean doubled)
    {
        // print out the pyramid
        for (int i = 0; i < num_rows; i++)
        {
            int num_sp = num_rows - i;
            int num_br = 2 + i;
            printRow(num_sp, num_br);
        
            if (doubled == true)
            {
                System.out.print(chasm);
                printReversedRow(num_sp, num_br);
            }

            System.out.print(nline);
        }
    }

    public static void main(String[] args)
    {
        // validate user input
        if (args.length == 0)
            System.out.println("Usage: java Mario height");

        int height = Integer.parseInt(args[0]);
        
        Mario mario = new Mario(height);
        mario.printPyramid(false);
    }

}
