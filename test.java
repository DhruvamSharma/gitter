class test {
    public static void main(String...args) {
      test.printNumbers();
      //test.printStars();
      
    }

    public static void printStars() {
        int k =1;
      for (int i=0;i<5;i++) {
          for (int j = 1; j <= 5; j++) {
              if (j >= k)
            System.out.print("*");
          }
          k++;
          System.out.println();
      }
    }

    public static void printNumbers() {
        int k = 1;
        for (int i=0;i<5;i++) {
            
            for (int j=1;j<=5;j++) {
                if (j<=k)
                System.out.print(j);
                
            }
            k++;
            System.out.println();
        }
    }
    
}

