public class tablica5 extends tablica4 {
    void tablica5()
    {
        switch (skwadecyliard) {
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
        if(dkwadecyliard==1&& kwadecyliard==1) {
            System.out.print("jedenaście kwatourdecyliardów ");
        } else if(dkwadecyliard==1&& kwadecyliard==2) {
            System.out.print("dwanaście kwatourdecyliardów ");
        } else if(dkwadecyliard==1&& kwadecyliard==3) {
            System.out.print("trzynaście kwatourdecyliardów ");
        } else if(dkwadecyliard==1&& kwadecyliard==4) {
            System.out.print("czternaście kwatourdecyliardów ");
        } else if(dkwadecyliard==1&& kwadecyliard==5) {
            System.out.print("piętnaście kwatourdecyliardów ");
        } else if(dkwadecyliard==1&& kwadecyliard==6) {
            System.out.print("szesnaście kwatourdecyliardów ");
        } else if(dkwadecyliard==1&& kwadecyliard==7) {
            System.out.print("siedemnaście kwatourdecyliardów ");
        } else if(dkwadecyliard==1&& kwadecyliard==8) {
            System.out.print("osiemmnaście kwatourdecyliardów ");
        } else if(dkwadecyliard==1&& kwadecyliard==9) {
            System.out.print("dziewiętnaście kwatourdecyliardów ");
        } else {
            switch (dkwadecyliard) {
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
            switch (kwadecyliard) {
                case 0:
                    if(dkwadecyliard>0||skwadecyliard>0) {
                        System.out.print("kwatourdecyliardów");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(skwadecyliard>0||dkwadecyliard>0||kwadecyliard>1){
                        System.out.print("jeden kwatourdecyliardów  ");}
                    else {
                        System.out.print("kwatourdecyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa kwatourdecyliardy ");
                    break;
                case 3:
                    System.out.print("trzy kwatourdecyliardy ");
                    break;
                case 4:
                    System.out.print("cztery kwatourdecyliardy ");
                    break;
                case 5:
                    System.out.print("pięć kwatourdecyliardów ");
                    break;
                case 6:
                    System.out.print("sześć kwatourdecyliardów ");
                    break;
                case 7:
                    System.out.print("siedem kwatourdecyliardów ");
                    break;
                case 8:
                    System.out.print("osiem kwatourdecyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć kwatourdecyliardów ");
                    break;
            }
        }
    }
}



