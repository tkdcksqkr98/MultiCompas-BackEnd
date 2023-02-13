package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(1000, 500);
		String header[] = {"국어", "영어", "수학", "과탐", "사탐"};
		String contents[][] = {
				{"1", "2", "3", "4", "5"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				{"11", "22", "33", "44", "55"},
				
		};
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
