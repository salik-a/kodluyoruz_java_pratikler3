/**
 * @author This code written by salika
 */


import java.util.Scanner;
public class pratikler3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------------------Practice 1---------------------------------------");

        int a,ort=0,count=0;
        System.out.println("Enter number : ");
        a = scan.nextInt();
        int sum=0;
        for (int i=1; i<=a;i++){

            if(i%12==0){
                sum += i;
                count++;

            }
        }
        ort=sum/count;
        System.out.println(ort);




        /*
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        System.out.println("------------------------------Practice 2---------------------------------------");
        System.out.println();

        boolean status = true;
        int b,total=0;
        do {
            System.out.println("Enter number : ");
            b= scan.nextInt();
            if(b%2 == 1)
                status=false;
            if(b%4 == 0)
                total+=b;

        }while (status);
        System.out.println();
        System.out.println("Total: "+total);

        */


        /*
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------------------------------Practice 3---------------------------------------");
        System.out.println();

        int c;
        System.out.println("Enter number : ");
        c= scan.nextInt();
        System.out.println("Forces of 4 : ");
        for (int i=1;i<=c;i*=4){
            System.out.println(i);
        }
        System.out.println("Forces of 5 : ");
        for (int j=1;j<=c;j*=5) {
            System.out.println(j);
        }


         */

        /*
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        System.out.println("------------------------------Practice 4---------------------------------------");
        System.out.println();




        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        System.out.println("------------------------------Practice 5---------------------------------------");
        System.out.println();


        int total=1;
        System.out.println("Enter base number : ");
        int d= scan.nextInt();
        System.out.println("Enter power number : ");
        int f= scan.nextInt();
        for (int k=1;k<=f;k++)
            total*=d;
        System.out.println(d+" to the power of "+f+": "+total);


         */

/*
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------------------------------Practice 6---------------------------------------");
        System.out.println();

        System.out.print("Sayı Giriniz :");
        int number = scan.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }


*/

        /*

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------------------------------Practice 7---------------------------------------");
        System.out.println();

        System.out.println("Enter number N :");
        double n = scan.nextInt();
        double result = 0;
        while (n > 0) {
            result += (1.0 / n);
            n--;
        }

        System.out.println(result);


         */
        /*

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------------------------------Practice 8---------------------------------------");
        System.out.println();


        System.out.println("Enter number :");
        int n = scan.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = n-2; i >= 0 ; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

         */

        /*
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------------------------------Practice 9---------------------------------------");
        System.out.println();

        String userName, password;

        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = scan.nextLine();
            System.out.print("Parolanız : ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scan.nextInt();
                    int price;
                    switch (select){

                        case 1:
                            System.out.print("Para miktarı : ");
                            price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        default: break;

                    }

                    System.out.println();
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }


         */

        /*
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------------------------------Practice 10---------------------------------------");
        System.out.println();

        int ebob=1;
        System.out.println("Enter n1 number : ");
        int n1= scan.nextInt();
        System.out.println("Enter n2 number : ");
        int n2= scan.nextInt();


        int i=1,border;
        if(n1<n2)
            border=n1;
        else
            border=n2;
        while(i<=border){

            if(n1 % i ==0 && n2 % i ==0)
                ebob = i;
            i++;
        }

        System.out.println("EBOB : "+ebob);
        System.out.println("EKOK : "+(n1*n2/ebob));

        */



    }
}