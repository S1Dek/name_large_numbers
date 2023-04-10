public class tablica6 extends tablica5 {
    void tablica6()
    {
        switch (skwadecylion) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("sto ");
                break;
            case 2:
                System.out.print("dwieście ");
                break;
            case 3:
                System.out.print("trzysta ");
                break;
            case 4:
                System.out.print("czterysta ");
                break;
            case 5:
                System.out.print("pięćset ");
                break;
            case 6:
                System.out.print("sześćset ");
                break;
            case 7:
                System.out.print("siedemset ");
                break;
            case 8:
                System.out.print("osiemset ");
                break;
            case 9:
                System.out.print("dziewięćset ");
                break;
        }
        if(dkwadecylion==1&& kwadecylion==1) {
            System.out.print("jedenaście kwatourdecylionów ");
        } else if(dkwadecylion==1&& kwadecylion==2) {
            System.out.print("dwanaście kwatourdecylionów ");
        } else if(dkwadecylion==1&& kwadecylion==3) {
            System.out.print("trzynaście kwatourdecylionów ");
        } else if(dkwadecylion==1&& kwadecylion==4) {
            System.out.print("czternaście kwatourdecylionów ");
        } else if(dkwadecylion==1&& kwadecylion==5) {
            System.out.print("piętnaście kwatourdecylionów ");
        } else if(dkwadecylion==1&& kwadecylion==6) {
            System.out.print("szesnaście kwatourdecylionów ");
        } else if(dkwadecylion==1&& kwadecylion==7) {
            System.out.print("siedemnaście kwatourdecylionów ");
        } else if(dkwadecylion==1&& kwadecylion==8) {
            System.out.print("osiemmnaście kwatourdecylionów ");
        } else if(dkwadecylion==1&& kwadecylion==9) {
            System.out.print("dziewiętnaście kwatourdecylionów ");
        } else {
            switch (dkwadecylion) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("dziesięć ");
                    break;
                case 2:
                    System.out.print("dwadzieścia ");
                    break;
                case 3:
                    System.out.print("trzydzieści ");
                    break;
                case 4:
                    System.out.print("czterydzieści ");
                    break;
                case 5:
                    System.out.print("pięćdziesiąt ");
                    break;
                case 6:
                    System.out.print("sześćdziesiąt ");
                    break;
                case 7:
                    System.out.print("siedemdziesiąt ");
                    break;
                case 8:
                    System.out.print("osiemdziesiąt ");
                    break;
                case 9:
                    System.out.print("dziewięćdziesiąt ");
                    break;
            }
            switch (kwadecylion) {
                case 0:
                    if(dkwadecylion>0||skwadecylion>0) {
                        System.out.print("kwatourdecylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(skwadecylion>0||dkwadecylion>0||kwadecylion>1){
                        System.out.print("jeden kwatourdecylionów  ");}
                    else {
                        System.out.print("kwatourdecylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa kwatourdecyliony ");
                    break;
                case 3:
                    System.out.print("trzy kwatourdecyliony ");
                    break;
                case 4:
                    System.out.print("cztery kwatourdecyliony ");
                    break;
                case 5:
                    System.out.print("pięć kwatourdecylionów ");
                    break;
                case 6:
                    System.out.print("sześć kwatourdecylionów ");
                    break;
                case 7:
                    System.out.print("siedem kwatourdecylionów ");
                    break;
                case 8:
                    System.out.print("osiem kwatourdecylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć kwatourdecylionów ");
                    break;
            }
        }
    }
}




