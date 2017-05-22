package assessment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileHandler {
	
	File filePath; 
	
	public FileHandler(){
		
		String inputFilePath = (String)JOptionPane.showInputDialog("Enter the filepath of your coin-inventory.properties file."
				+ " (For example Users/emilyscomputer/Desktop)");
		String[] inputFilePathArray = inputFilePath.split("/");
		String trueFilePath = "//";	
		for(String path : inputFilePathArray){
			trueFilePath = trueFilePath + path + "//";
		}		
		this.filePath = new File(trueFilePath + "coin-inventory.properties");
		
	}
	
	public int[][] readCoinFile(int[][] coins){
		
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
            	for(int i =0; i<coins.length; i++){
            		if(coins[i][0] == Integer.parseInt(line.substring(0, line.indexOf("=")))){
            			coins[i][1] = Integer.parseInt(line.substring(line.indexOf("=") + 1, line.length()));
            		}
            	}
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		
		return coins;
	}
	
	public void writeCoinFile(int[][] coins){
		
		try {
			FileWriter fw = new FileWriter(filePath, false);
			for(int i = 0; i<coins.length; i++){
				fw.write(coins[i][0] + "=" + coins[i][1] + "\r\n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
