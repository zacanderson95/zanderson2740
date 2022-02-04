import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String city = JOptionPane.showInputDialog("Enter your city: ");
        String strPopulation = JOptionPane.showInputDialog("Enter your city population: ");
        int population = Integer.parseInt(strPopulation);

        String strSalesTaxRate = JOptionPane.showInputDialog("Enter your city sales tax rate: ");
        double salesTaxRate = Double.parseDouble(strSalesTaxRate);
        showLength(city);
        showUpperCase(city);
        showLower(city);
        showFirstChar(city);
        showPopulation(population);
        showSalesTaxRate(salesTaxRate);

        sampOperators();

    }

    public static void showLength(String s) {
        JOptionPane.showMessageDialog( null, "Count of characters in " + s + ": " +
                s.length());
    }

    public static void showUpperCase(String s) {
        JOptionPane.showMessageDialog( null, "Upper case: " +
                s.toUpperCase());
    }

    public static void showLower(String s) {
        JOptionPane.showMessageDialog( null, "Lower case: " +
                s.toLowerCase());
    }

    public static void showFirstChar(String s) {
        JOptionPane.showMessageDialog( null, "First character in "  + s
          + ": " +  s.charAt(0));
    }

    public static void showPopulation(int p) {
        JOptionPane.showMessageDialog( null, "Population: "  + p);
    }

    public static void showSalesTaxRate(double t) {
        JOptionPane.showMessageDialog( null, "Sales tax rate: " + t);
    }



    public static void sampOperators()
    {
        int i = 5, j = 4, k = 2;
        double d = 2.0;
        boolean t = true, f = false;
        char c = 'A', sp = 32;
        JOptionPane.showMessageDialog(null,
                "1) i / k = " + i / k + '\n' +		//An integer in java can't do decimals. I could cast to a double to get the right result
                        "2) i / d = " + i / d + '\n' +		//d is a double, which converts the answer to double.
                        "3) c++ = " + c++ + '\n' +		//there is not another operation
                        "4) ++c = " + ++c + '\n' +		//This time the previous operation adds on to this operation making c = C instead of B
                        "5) c + sp = '" + c + sp + "'\n" +	//My guess is that the parentheses are needed?
                        "6) (c + sp) = " + (c + sp) + '\n' +	//the unicode integer of c is 67, sp = 32. 67 + 32 = 99
                        "7) (c += sp) = " + (c += sp) + '\n' +	//I believe this is just the loss of data with the += assignment operator with the different data types
                        "8) (i > j) && (j > k) = " + (((i > j) && (j > k)) ? "true" : "false") + '\n' +
                        // 5 > 4. 4 > 2 which makes this true
                        "9) (i < j) && (j > k) = " + (((i < j) && (j > k)) ? "true" : "false") + '\n' +
                        //i is not less than j
                        "10) (i < j) || (j > k) = " + (((i < j) || (j > k)) ? "true" : "false") + '\n' +
                        //|| is an or operator. so i is not less than j but j IS greater than k
                        "11) i + j / k = " + (i + j / k) + '\n' +	//5 + 2 = 7
                        "12) j / k + i = " + (j / k + i) + '\n' +	//2 + 5 = 7
                        "13) j / (k + i) = " + (j / (k + i)) + '\n' +	//rounded to 0
                        "14) f && t || t = " + ((f && t || t) ? "true" : "false") + '\n' +
                        //I think it goes left to right. So false and true or true which would then be true?
                        "15) 100001000 - 100000900 = " + (100001000 - 100000900) + '\n' +
                        "16) 100001000f - 100000900f = " + (100001000f - 100000900f) + '\n' +
                        //I believe that since the numbers are converted to float, it creates rounding errors that muck it all up
                        "17) 1.000001f - 1.0000009f = " + (1.000001f - 1.0000009f) );
        //Not sure on this one either, my guess again is float creates rounding errors of some sort. Also the number is shorter which makes it 0 from where the f is placed
    }
}
