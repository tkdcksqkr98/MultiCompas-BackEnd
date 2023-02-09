package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class For3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("커피*우유3개");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "짱!");
		}
	}

}
