public class tablica3 extends tablica2 {
    void tablica3()
    {
        switch (skwindecyliard) {
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
        if(dkwindecyliard==1&&kwindecyliard==1) {
            System.out.print("jedenaście kwindecyliardów ");
        } else if(dkwindecyliard==1&&kwindecyliard==2) {
            System.out.print("dwanaście kwindecyliardów ");
        } else if(dkwindecyliard==1&&kwindecyliard==3) {
            System.out.print("trzynaście kwindecyliardów ");
        } else if(dkwindecyliard==1&&kwindecyliard==4) {
            System.out.print("czternaście kwindecyliardów ");
        } else if(dkwindecyliard==1&&kwindecyliard==5) {
            System.out.print("piętnaście kwindecyliardów ");
        } else if(dkwindecyliard==1&&kwindecyliard==6) {
            System.out.print("szesnaście kwindecyliardów ");
        } else if(dkwindecyliard==1&&kwindecyliard==7) {
            System.out.print("siedemnaście kwindecyliardów ");
        } else if(dkwindecyliard==1&&kwindecyliard==8) {
            System.out.print("osiemmnaście kwindecyliardów ");
        } else if(dkwindecyliard==1&&kwindecyliard==9) {
            System.out.print("dziewiętnaście kwindecyliardów ");
        } else {
            switch (dkwindecyliard) {
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
            switch (kwindecyliard) {
                case 0:
                    if(dkwindecyliard>0||skwindecyliard>0) {
                        System.out.print("kwindecyliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(skwindecyliard>0||dkwindecyliard>0||kwindecyliard>1){
                        System.out.print("jeden kwindecyliardów  ");}
                    else {
                        System.out.print("kwindecyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa kwindecyliardy ");
                    break;
                case 3:
                    System.out.print("trzy kwindecyliardy ");
                    break;
                case 4:
                    System.out.print("cztery kwindecyliardy ");
                    break;
                case 5:
                    System.out.print("pięć kwindecyliardów ");
                    break;
                case 6:
                    System.out.print("sześć kwindecyliardów ");
                    break;
                case 7:
                    System.out.print("siedem kwindecyliardów ");
                    break;
                case 8:
                    System.out.print("osiem kwindecyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć kwindecyliardów ");
                    break;
            }
        }
    }
}


