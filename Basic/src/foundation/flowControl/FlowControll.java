package foundation.flowControl;

public class FlowControll {
      public static void main(String[] args) {
//          int a = 9;
//          int b = 5;
//          if (a == 1) {
//              System.out.println("1");
//              if (b == 5) {
//                  System.out.println("5");
//              }
//          } else if (a == 2){
//              System.out.println("2");
//          } else if (a == 3) {
//            System.out.println("3");
//          } else {
//              System.out.println("--");
//          }
//
//          switch (a) {
//              case 1:
//                  System.out.println(1);
//                  break;
//              case 2:
//                  System.out.println(2);
//                  break;
//              case 3:
//                  System.out.println(3);
//                  break;
//              default:
//                  System.out.println("--");
//                  break;
//
//          }

//            int index = 5;
//            while (index > 0) {
//                System.out.println(index);
//                  index--;
//            }
//              do {
//                  System.out.println(index);
//                  index--;
//              } while (index > 0);

                for (int i = 0; i < 5; i++) {
                    System.out.println("i = " + i);
                    for (int j = 0; j < 5; j++){
                        if (j == 0) {
                            continue;
                        }
                        System.out.println("j = " + j);
                    }
                }

      }
}
