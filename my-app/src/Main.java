import org.la4j.Matrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.*;
import	java.util.Scanner;
import	java.lang.Object;

public class Main{
	public static final int MIN_OWN_VALUE = -1;

	public static final int MIN_TYPE_EXEC = 0;
	public static final int MAX_TYPE_EXEC = 3;

	public static final Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		double[][] array = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        // Create a CRSMatrix with the same dimensions as the array
        CRSMatrix matrix = new CRSMatrix(array.length, array[0].length);

        // Populate the CRSMatrix with values from the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0.0) {
                    matrix.set(i, j, array[i][j]);
                }
            }
        }

        // Print the matrix
        System.out.println(matrix);


			// Print the matrix
/*		if (args.length > 0)
			NonIterative(args);
		else
			Iterative(); */
	}

	public static void NonIterative(String[] arguments)
	{
	}

	public static void Iterative()
	{
		int		type;
		int		own_values;
		String	path;

		type = TypeOfExecution();
		own_values = OwnValues();
		path = FilePath();
	}

	//=========Prints & Scan=========//
	public static int TypeOfExecution()
	{
		int	read;

		read = 100;
		System.out.printf("Enter the type of execution:\n");
		System.out.println("(0) Exit Program");
		System.out.println("(1) Decomposition of images");
		System.out.println("(2) Rebuild images");
		System.out.println("(3) Identify closest");

		while(!(read <= MAX_TYPE_EXEC && read >= MIN_TYPE_EXEC))
		{
			read = input.nextInt();
			if (!(read <= 3 && read > 0))
				System.out.println("You've entered a wrong value. Try it again: ");
		}
		return (read);
	}

	public static int OwnValues()
	{
		int	read;

		System.out.printf("Enter the own value(columns):\n");
		read = input.nextInt();
		input.nextLine();
		return read;
	}

	public static String FilePath()
	{
		String	path;

		System.out.printf("Enter the file PATH of execution:\n");
		path = input.nextLine();
		return (path);
	}

/* 	public static String[][] CSVtoMatrix(String filename)
	{
		String[] csv;
	}

	public static String[][] ReadingDir()
	{
	} */
	//==================Functionalities==================//
	//=========1=========//
	public static void Decomposition()
	{

	}

	//=========2=========//
	public static void Recomposition()
	{

	}

	//=========3=========//
	public static void SearchClosest()
	{

	}

}

