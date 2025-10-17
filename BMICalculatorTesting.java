import javax.swing.JFrame;

public class BMICalculatorTesting {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My BMI Calculator");
		BMICalculator panel = new BMICalculator(); //create an object of BMICaculator
		frame.add(panel); //add JPanel into JFrame
		frame.setSize(400, 200); //set a frame's resolution
		frame.setLocationRelativeTo(null); //set a location at center the frame
		frame.setVisible(true); //set visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set default Close
		

	}

}
