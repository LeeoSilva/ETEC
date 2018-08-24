import javax.swing.JOptionPane;

public class Exercicio15{
  public static void main (String args []){
    JOptionPane window = new JOptionPane();
    int flag = 0, dd = 0, mm = 0, yy = 0, maxdd = 0;
    Object dia = null;
    Object mouths[] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};


    while(flag == 0){
      dia = window.showInputDialog(null, "Informe uma data", "Data", window.INFORMATION_MESSAGE, null, mouths, mouths[0]);
      if(dia != null){
        break;
      }
    }

    // if you dont mind, this is just a notation for the quantities of days :)
    // PS: I Love U, pls work ;-;
    // January - 31 days
    // February - 28 days in a common year and 29 days in leap years
    // March - 31 days
    // April - 30 days
    // May - 31 days
    // June - 30 days
    // July - 31 days
    // August - 31 days
    // September - 30 days
    // October - 31 days
    // November - 30 days
    // December - 31 days

    //Changing variables
    if(dia == "Janeiro"){
      mm = 1;
      maxdd = 31;
    }else if(dia == "Fevereiro"){
      mm = 2;
      maxdd = 28;
    }else if(dia == "Marco"){
      mm = 3;
      maxdd = 31;
    }else if(dia == "Abril"){
      mm = 4;
      maxdd = 30;
    }else if(dia == "Maio"){
      mm = 5;
      maxdd = 31;
    }else if(dia == "Junho"){
      mm = 6;
      maxdd = 30;
    }else if(dia == "Julho"){
      mm = 7;
      maxdd = 31;
    }else if(dia == "Agosto"){
      mm = 8;
      maxdd = 31;
    }else if(dia == "Setembro"){
      mm = 9;
      maxdd = 30;
    }else if(dia == "Outubro"){
      mm = 10;
      maxdd = 31;
    }else if(dia == "Novembro"){
      mm = 11;
      maxdd = 30;
    }else if(dia == "Dezembro"){
      mm = 12;
      maxdd = 31;
    }else{
      mm = 0;
      maxdd = 0;
    }

    switch(mm){
      //Start of the switch

      case 1: //January 31 days
        while(flag == 0){
          System.out.println("Janeiro");
          dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-31): "));
          if(dd < 1){
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd > 31){
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd >= 1 && dd <= 31){
            flag = 1;
            break;
          }else{
            window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }
        }
        break;

      case 2: //February 28 days
      System.out.println("Fevereiro");
      while(flag == 0){
          dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-28):"));
          if(dd < 1){
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd > 28){
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd >= 1 && dd <= 28){
            flag = 1;
            break;
          }else{
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }
        }
        break;

      case 3: //March 31 days
      System.out.println("Marco");
      while(flag == 0){
          dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-31):"));
          if(dd < 1){
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd > 31){
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd >= 1 && dd <= 31){
            flag = 1;
            break;
          }else{
            window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }
        }
        break;
      case 4: //April 30 days
      System.out.println("Abril");
      while(flag == 0){
          dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-30):"));
          if(dd < 1){
          window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd > 30){
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd >= 1 && dd <= 30){
            flag = 1;
            break;
          }else{
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }
        }
        break;

        case 5: //May 31 days
        System.out.println("Maio");
        while(flag == 0){
            dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-31): "));
            if(dd < 1){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd > 31){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd >= 1 && dd <= 31){
              flag = 1;
              break;
            }else{
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }
          }
          break;

        case 6: //June 30 days
        System.out.println("Junho");
        while(flag == 0){
            dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-30):"));
            if(dd < 1){
            window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd > 30){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd >= 1 && dd <= 30){
              flag = 1;
              break;
            }else{
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }
          }
          break;

        case 7: //July 31 days
        System.out.println("Julho");
        while(flag == 0){
            dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-31):"));
            if(dd < 1){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd > 31){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd >= 1 && dd <= 31){
              flag = 1;
              break;
            }else{
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }
          }
          break;

        case 8: //August 31 days
        System.out.println("Agosto");
        while(flag == 0){
            dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-30):"));
            if(dd < 1){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd > 31){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd >= 1 && dd <= 31){
              flag = 1;
              break;
            }else{
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }
          }
          break;

        case 9: //September 30 days
        System.out.println("Setembro");
        while(flag == 0){
            dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-31):"));
            if(dd < 1){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd > 31){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd >= 1 && dd <= 30){
              flag = 1;
              break;
            }else{
              window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }
          }
          break;

        case 10:  // October - 31 days
        System.out.println("Outubro");
        while(flag == 0){
            dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-30):"));
            if(dd < 1){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd > 31){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd >= 1 && dd <= 31){
              flag = 1;
              break;
            }else{
              window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }
          }
          break;

        case 11:  // November - 30 days
        System.out.println("Novembro");
        while(flag == 0){
            dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-31):"));
            if(dd < 1){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd > 30){
              window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }else if(dd >= 1 && dd <= 30){
              flag = 1;
              break;
            }else{
              window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
            }
          }
          break;

        case 12:  // December - 31 days
        System.out.println("Dezembro");
        while(flag == 0){
          dd = Integer.parseInt(window.showInputDialog("Informe um dia do mes (1-30)"));
          if(dd < 1){
            window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd > 31){
            window.showInputDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }else if(dd >= 1 && dd <= 31){
            flag = 1;
            break;
          }else{
            window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
          }
        }
        break;

        default:
          System.out.println("Error");
          window.showMessageDialog(null, "Error", "Error", window.ERROR_MESSAGE);
          flag = 1;

    } //End of the switch
    flag = 0;
    while(flag == 0){
      yy = Integer.parseInt(window.showInputDialog("Informe o ano: "));
      if(yy < 0){
        yy = Math.abs(yy);
        window.showMessageDialog(null, dd +"/" +mm +"/" +yy +" A.C" +", " +maxdd +" dias no mes");
      }else if(yy > 2500){
        window.showMessageDialog(null, "Numero Invalido", "Error", window.ERROR_MESSAGE);
      }else{
        break;
      }
    }


    window.showMessageDialog(null, dd +"/" +mm +"/" +yy + ", " +maxdd +"dias no mes");
    System.exit(0);
  }
}
