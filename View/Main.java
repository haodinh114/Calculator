package View;
import Controller.BWCalculator;
import Controller.BinaryCalculator;
import Controller.HexadecimalCalculator;
import Model.Binary;
import Model.Hexadecimal;
import Model.Number;

import java.io.File;
import java.io.FileNotFoundException;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Ask user to input file
        Scanner scanf = new Scanner(System.in);

        System.out.println("File or keyboard: ");

        String file = scanf.nextLine().trim();

        // Get file name from user

        if (file.equals("File")) {
            System.out.println("Enter a file name: ");
            String fileName = scanf.nextLine();      // Get file name
            scanf.close();  // close Scanner

            // Try to create file
            try {

                // Create a file path
                File currentFile = new File(fileName); // Create file path by user input

                // Read until the end of file
                // Read line by line

                // File exist
                if (currentFile.exists()) {
                    Scanner fileReader = new Scanner(currentFile);  // Use to read each line in file

                    // Read until the end of file
                    // Read line by line
                    while (fileReader.hasNextLine()) {
                        String data = fileReader.nextLine();

                        // Analyze text
                        analyzeText(data.toLowerCase()); // Lower all character
                    }
                    fileReader.close(); // Close Scanner
                }

                // File is not exist
                else {
                    System.out.println("File is not exist");
                }

                // If false to create file
            } catch (FileNotFoundException e) {
                System.out.println("File error occurred.");
            }
        }else {

                Scanner fileReader = new Scanner(System.in);  // Use to read each line in file

                // Read until the end of file
                // Read line by line
            System.out.println("* Binary number *\n" +
                    "------ For calulate function: ------\n" +
                    "Type: Calculate Binary (+/-/*//) (num) (num) \n"+
                    "EXAMPLE: Calculate Binary + 10101010 11001100\n\n"+
                    "------ For convert function: ------\n" +
                    "Type: Convert Binary/Decimal to Decimal/Binary (num) \n" +
                    "EXAMPLE: Convert Binary to Decimal 10101010\n\n"+
                    "* Hexadecimal number *\n" +
                    "------ For calulate function: ------\n" +
                    "Type: Calculate Hexadecimal (+/-/*//) (num) (num) \n"+
                    "EXAMPLE: Calculate Hexadecimal + 8AB B78\n\n"+
                    "------ For convert function: ------\n" +
                    "Type: Convert Hexadecimal/Decimal to Decimal/Hexadecimal (num) \n"+
                    "EXAMPLE: Convert Hexadecimal to Decimal DAD\n\n" +
                    "* Bandwidth: *\n" +
                    "------ For Data converter: ------\n" +
                    "Type: Convert Data Unit to (file size's unit) (num)\n" +
                    "EXAMPLE: Convert Data Unit to kilobits 500\n\n"+
                    "------ For Download/Upload calculator: ------\n" +
                    "Type: Calculate Download/Upload Time (num) (file size's unit) (num) (bandwidth's unit)\n" +
                    "EXAMPLE: Calculate Download/Upload Time 500 Gigabytes 5 Mbit/s \n\n" +
                    "------ For Website Bandwidth calculator: ------\n"+
                    "Type: Calculate Website Bandwidth (num) (time) (num) (file size's unit) (redundancy)\n" +
                    "EXAMPLE: Calculate Website Bandwidth 5000 per day 500 Megabytes 2\n\n"+
                    "------ For Hosting Bandwidth Converter: ------\n" +
                    "Type: Convert Monthly Usage to Bandwidth (num) (file size's unit) (num) (bandwidth's unit) \n"+
                    "EXAMPLE: Convert Monthly Usage to Bandwidth 1000 Terabytes 1 Tbit/s\n\n"+
                    "--- TYPE 0 TO EXIT ---\n");

            while (fileReader.hasNextLine()) {

                    String data = fileReader.nextLine();
                        // Analyze text
                        analyzeText(data.toLowerCase()); // Lower all character

                     if(data.equals("0")) {

                         System.exit(0);
                         fileReader.close();

                    }
                }

                fileReader.close(); // Close Scanner

        }
    }



    // This is invoked in main
    public static void analyzeText(String text) {
        System.out.println(text);
        // Ignore // comment
        if (!text.isEmpty()) {

            // Tokenize string
            // Convert case
            if (text.contains("convert")) convert(text);

            // Calculate case
            if (text.contains("calculate")) calculate(text);

            // Ignore other case
        }
    }

    // This is invoked in analyzeText
    public static void convert(String text) {
        //Calculator cal = new BinaryCalculator();
        if (text.contains("binary to decimal")) {

            // result
            // call method convertBiToDec
            BinaryCalculator cal = new BinaryCalculator();
            String[] split = text.split(" ");
            String x = split[4];
            int result = cal.convertToDec(x);
            System.out.println("Convert binary to decimal result: " + result);
        } else if (text.contains("decimal to binary")) {

            // result
            // call method convertDecToBi
            BinaryCalculator cal = new BinaryCalculator();
            String[] split = text.split(" ");
            int x   = parseInt(split[4]);
            String result = cal.convertFromDec(x);
            System.out.println("convert decimal to binary result:" + result);
        } else if (text.contains("hexadecimal to decimal")) {

            // result
            //call method convertHecToDec
            HexadecimalCalculator cal = new HexadecimalCalculator();
            String[] split = text.split(" ");
            String x = split[4];
            int result = cal.convertToDec(x);
            System.out.println("Convert hexadecimal to decimal: " + result);
        } else if (text.contains("decimal to hexadecimal")) {

            // result
            // call method convertDecToHex
            HexadecimalCalculator cal = new HexadecimalCalculator();
            String[] split = text.split(" ");
            int x = parseInt(split[4]);
            String result = cal.convertFromDec(x);
            System.out.println("Convert decimal to hexadecimal result: " + result);
        } else if (text.contains("data unit to")) {

            // result
            // call method convertDataUnit
            BWCalculator cal = new BWCalculator();
            String[] split = text.split(" ");
            String unit = split[4];
            double x = parseInt(split[5]);
            String result = cal.UnitConvert(x, unit);
            System.out.println("Convert data unit to result: " + result);
        }
        else if (text.contains("monthly usage to bandwidth")) {
            BWCalculator cal = new BWCalculator();
            // result
            // call method convertMonthlyUsageToBandW
            String[] split = text.split("\\s+");
            double size = parseInt(split[5]);
            String unit1 = split[6];
            double bandWidth = parseInt(split[7]);
            String unit2 = split[8];
            String result = cal.MonthlyUsage(size, unit1, bandWidth, unit2);
            System.out.println("Convert monthly usage to bandwidth result: \n" + result);
        }
    }

    // This is invoked in analyzeText
    public static void calculate(String text) {

        if (text.contains("binary")) {

            // Input operator and value
            BinaryCalculator cal = new BinaryCalculator();
            String[] split = text.split(" ");
            String operator = split[2];
            String x = split[3];
            String y = split[4];
            Binary newBin1 = new Binary(x);
            Binary newBin2 = new Binary(y);

            Number result = null;
            switch (operator) {
                case "+":
                    result = cal.add(newBin1, newBin2);
                    break;
                case "-":
                    result = cal.subtract(newBin1, newBin2);
                    break;
                case"*":
                    result = cal.multiply(newBin1, newBin2);
                    break;
                case"/":
                    result = cal.divide(newBin1, newBin2);
                    break;
            }
            // result
            System.out.println("Calculate binary result: " + result);

        } else if (text.contains("hexadecimal")) {

            // Input operator and value
            HexadecimalCalculator cal = new HexadecimalCalculator();
            String[] split = text.split(" ");
            String operator = split[2];
            String x = split[3];
            String y = split[4];
            Hexadecimal newHex1 = new Hexadecimal(x);
            Hexadecimal newHex2 = new Hexadecimal(y);
            Number result = null;

            switch (operator) {
                case "+":
                    result = cal.add(newHex1, newHex2);
                    System.out.println(result);
                    break;
                case "-":
                    result = cal.subtract(newHex1, newHex2);
                    break;
                case"*":
                    result = cal.multiply(newHex1, newHex2);
                    break;
                case"/":
                    result = cal.divide(newHex1, newHex2);
                    break;
            }
            // result
            System.out.println("Calculate hexadecimal result: " + result);

        } else if (text.contains("download/upload time")) {

            BWCalculator cal = new BWCalculator();
            // Input operator and value
            String[] split = text.split(" ");

            // size value
            String temp1 = split[3];
            double size = parseDouble(temp1);

            // Unit
            String unit1 = split[4];

            // Bandwidth value
            String temp2 = split[5];
            double bandWidth = parseDouble(temp2);

            // Unit
            String unit2 = split[6];

            double result = cal.calculateUpAndDownBW(size, unit1, bandWidth, unit2);

            // result
            System.out.println("Calculate download/upload time result: " + result + "s");

        } else if (text.contains("website bandwidth")) {

            BWCalculator cal = new BWCalculator();
            // Input operator and value
            String[] split = text.split("\\s+");

            // view value
            String temp1 = split[3];
            double view = parseDouble(temp1);

            // Unit
            String unit1 = split[5];

            // size value
            String temp2 = split[6];
            double size = parseDouble(temp2);

            // Unit
            String unit2 = split[7];

            // redundancy value
            String temp3 = split[8];
            int redundancy = parseInt(temp3);
            String result = cal.calculateWebsiteBW(view, unit1, size, unit2, redundancy);

            // result
            System.out.println("Website Bandwidth: " + result);


        }
    }
}

