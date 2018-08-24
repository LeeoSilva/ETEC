import javax.swing.JOptionPane;
public class Variables{
	//Global Variables
	public static StringBuilder listNames = null; //Does what is called. '-'
	public static JOptionPane   window  = new JOptionPane();

	public static int           intervield = 0; //Number of intervield people.
	public static int           optioncount = 0; //Helps on the verification.
	public static int           mans = 0; //Countage of mans intervield.
	public static int           womans = 0; //Countage of womans intervield.
	public static int           overweightPeople = 0; //Total of overweight people
	public static int           overweightMans = 0;
	public static int           overweightWomans = 0;
	public static int[]         sex = new int[1000]; //Sex of each person.
	public static int[]         age = new int[1000]; //Age of each person.
	public static int[]         status  = new int[1000]; //Status of each person.

	public static double        avgMansWeight = 0; //Average of total mans weight.
	public static double        percentMansOverWeight = 0; //Percentage of mans who are overweight.
	public static double        avgWomansWeight = 0; //Average of total womans weight.
	public static double        percentWomansOverWeight = 0; //Porcentage of womans who are overweight.
	public static double        avgIntervieldPeople = 0; //Average of weignew String[1000]ht intervield people.
	public static double        imcIntervieldPeople = 0; //IMC of all the people intervield.
	public static double        percentOverWeightPeople = 0; //Percentage of overweight people.
	public static double[]      weight = new double[1000]; //Weight of each person.
	public static double[]      height =  new double[1000]; //Height of each person.
	public static double[]      imcMans = new double[1000]; // IMC of mans.
	public static double[]      imcWomans = new double[1000]; //IMC of the womans

	public static String[]      name = new String[1000]; //Name of each person.

	public static Object        desition = null; //Menu's user desition.
	public static Object[]      weightStatus = {"Abaixo do Normal", "Normal", "Obesidade leve", "Obesidade moderada", "Obesidade M\u00f3rbida"}; //Levels of weight.
	public static Object[]      userDecides = {"Exibir lista de entrevistados", //show the menu after the calculation its done
	                                           "Exibir os c\u00e1lculos dos homens adultos",
	                                           "Exibir os c\u00e1lculos das mulheres adultas",
	                                           "Exibir todos que est\u00e3o obesos",
	                                           "Exibir a lista de todos os pesquisados por ordem de situa\u00e7\u00e3o"};

	public static boolean      tableTests = true; //A function for adding table tests in the console.

	//Auxiliar variables.
	public static double       allWomansWeight = 0; //Helps on AVG and IMC calculation.
	public static double       allMansWeight = 0; //Helps on AVG and IMC calculation.
	public static double       totalWeight   = 0; //Helps on AVG and IMC calculation.
}
