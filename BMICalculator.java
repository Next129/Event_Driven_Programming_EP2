import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMICalculator extends JPanel {
	JPanel panel1_UserInformation = new JPanel();
	JPanel panel2_HeightAndWeight = new JPanel();
	JPanel panel3_BMIResult = new JPanel();
	JLabel info = new JLabel("Enter your information");
	JLabel height = new JLabel("Your heihgt(cm): ");
	JTextField tf1 = new JTextField();
	JLabel weight = new JLabel("Your weihgt(kg): ");
	JTextField tf2 = new JTextField();
	JButton compute = new JButton("Compute BMI");
	JLabel BMI = new JLabel("BMI = ");

	public BMICalculator() {
		this.setLayout(new GridLayout(3, 1));
		this.add(panel1_UserInformation);
		this.add(panel2_HeightAndWeight);
		this.add(panel3_BMIResult);

		panel1_UserInformation.setLayout(new GridLayout(2, 1));
		panel1_UserInformation.add(info);
		panel2_HeightAndWeight.setLayout(new GridLayout(2, 2));
		panel2_HeightAndWeight.add(height);
		panel2_HeightAndWeight.add(tf1);
		panel2_HeightAndWeight.add(weight);
		panel2_HeightAndWeight.add(tf2);
		panel3_BMIResult.setLayout(new GridLayout(2, 1));
		panel3_BMIResult.add(compute);
		panel3_BMIResult.add(BMI);

//		new ActionInterpretor();
		compute.addActionListener(new ActionInterpretor());	}

	public class ActionInterpretor implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double h = Double.parseDouble(tf1.getText());
			double w = Double.parseDouble(tf2.getText());
			BMI.setText("BMI = " + String.format("%.2f", ComputeBMI(h,w)));

		}

		double ComputeBMI(double h, double w) {
			return w / ((h*0.01) * (h*0.01));
		}
	}

}
