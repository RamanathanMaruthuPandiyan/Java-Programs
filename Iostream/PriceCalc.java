import java.io.*;

public class PriceCalc {
    public static void main(String[] args){
        String line = "";  
        String splitBy = ",";
        try{
            BufferedReader BI=new BufferedReader(new FileReader("Priceodometer.csv"));
            BufferedWriter BO=new BufferedWriter(new FileWriter("PriceOutput.txt"));
            while((line=BI.readLine())!=null){
                String[] record = line.split(splitBy);
                double total_km=Double.parseDouble(record[4])-Double.parseDouble(record[3]);
                double total_gallons=Double.parseDouble(record[2])/Double.parseDouble(record[1]);
                double mpg=total_km/total_gallons;
                BO.write(record[0]+" ,you drove "+total_km+" miles using "+total_gallons+" gallons with an mpg of "+mpg+" \n");
            }
            BO.close();
        }catch(IOException e){
            e.printStackTrace(); 
        }

    }    
}
