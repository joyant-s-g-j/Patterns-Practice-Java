public class hollow_rect {
    
    public static void main(String[] args) {
        /* pattern 2
        *****
        *   *
        *   *
        *****
         */
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i == 1 || j == 1 || i == 4 || j == 5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");   
                }
            }
            System.out.print("\n");
        }
    }
}
