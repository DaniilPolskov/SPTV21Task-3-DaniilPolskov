/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task.pkg3.daniilpolskov;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SPTV21Task3DaniilPolskov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.next();
        System.out.println("Введите фамилию: ");
        String surname = scanner.next();
        System.out.println("Введите личный код: ");
        String isikukood = scanner.next();
        String gender = isikukood.substring(0); //гендер+век
        String year = isikukood.substring(1,3); //гг
        String month = isikukood.substring(3,5); //мм
        String day = isikukood.substring(5,7); //дд
        
        if(month == "01"){
            month="января";
        }else if(month == "02"){
            month="февраля";
        }else if(month == "03"){
            month="марте";
        }else if(month == "04"){
            month="апреля";
        }else if(month == "05"){
            month="мая";
        }else if(month == "06"){
            month="июня";
        }else if(month =="07"){
            month="июля";
        }else if(month=="08"){
            month="августа";
        }else if(month=="09"){
            month="сентября";
        }else if(month=="10"){
            month="октября";
        }else if(month=="11"){
            month="ноября";
        }else if(month=="12"){
            month="декабря";
        }
            if (gender == "4") {
                System.out.println("19"+year);
            }else{
                System.out.println(name+" "+surname+ " родился "+day+" "+month+" "+"20"+year + " года");

            }
    }
}
