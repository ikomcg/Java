package login;
import java.util.*;

 class prac {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         boolean response = true;
         String[] user_respo;
        String[] Rows = { "Row 1 ", "Row 2 ", "Row 3 ", "Row 4 ", "Row 5 ", "Row 6 ", "Row 7 ", "Row 8 ", "Row 9 ", "Row 10 "};
        String [][] table = {
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},   
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"}

        };
         

         
        do{ 
           System.out.println("Bus Reservation");
          String[] columns = { "Col 1",  "Col 2",  "Col 3",  "Col 4" };
        for(int i = 0; i < columns.length; i++){
            System.out.print("\t" + columns[i]);

        }

       
        System.out.println();   
        
        for(int row = 0; row < table.length; row++){
            System.out.print(Rows[row]);
            for(int col = 0; col < table[row].length; col++){
                
                System.out.print("\t" + table[row][col]);

            }

            System.out.println();
        }
        

        System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
        
        user_respo = sc.nextLine().split(" ");
        
        int row1 = Integer.parseInt(user_respo[0]);
        int col2 = Integer.parseInt(user_respo[1]);
       
        if(Integer.parseInt(user_respo[0]) > 0 && Integer.parseInt(user_respo[1]) > 0){
          
             table[row1-1][col2-1] = "X";
        }
        else{
        response = false;

        }
        
        }
        while(response == true);
        
        }
}