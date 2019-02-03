package com.company;
import java.util.Scanner;
        public class Main {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                Scanner a = new Scanner(System.in);
                Scanner rgb = new Scanner(System.in);

                System.out.println("What will you be inputting? Enter the " +
                        "number of your choice: \n 1: RGB triplet \n 2: Hexadecimal value \n 3: Color Name");
                int x = input.nextInt();

                if (x == 3){
                    System.out.println("Now please input your value");
                    String y = a.next();
                    String xx = Colors.HexFromName(y);
                    System.out.println(xx);
                    System.out.println(Colors.rgbFromHex(xx));
                }
                else if (x == 2){
                    System.out.println("Now please input your value");
                    String y = a.next();
                    System.out.println(Colors.NamefromHex(y));
                    System.out.println(Colors.rgbFromHex(y));
                }
                else if (x == 1){
                    System.out.println("Please input the R value:");
                    int r = rgb.nextInt();
                    System.out.println("Please input the G value:");
                    int g = rgb.nextInt();
                    System.out.println("Please input the B value:");
                    int b = rgb.nextInt();
                    String hexRGB = Colors.hexFromRGB(r);
                    hexRGB += Colors.hexFromRGB(g);
                    hexRGB += Colors.hexFromRGB(b);
                    System.out.println(Colors.NamefromHex(hexRGB));
                }
            }
        }
    }
}
