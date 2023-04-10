public class tablica11 extends tablica10 {
    void tablica11() {
        switch (sund) {
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
        if(dund==1&&und==1) {
            System.out.print("jedenaście undecyliardów ");
        } else if(dund==1&&und==2) {
            System.out.print("dwanaście undecyliardów ");
        } else if(dund==1&&und==3) {
            System.out.print("trzynaście undecyliardów ");
        } else if(dund==1&&und==4) {
            System.out.print("czternaście undecyliardów ");
        } else if(dund==1&&und==5) {
            System.out.print("piętnaście undecyliardów ");
        } else if(dund==1&&und==6) {
            System.out.print("szesnaście undecyliardów ");
        } else if(dund==1&&und==7) {
            System.out.print("siedemnaście undecyliardów ");
        } else if(dund==1&&und==8) {
            System.out.print("osiemmnaście undecyliardów ");
        } else if(dund==1&&und==9) {
            System.out.print("dziewiętnaście undecyliardów ");
        } else {
            switch (dund) {
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
            switch (und) {
                case 0:
                    if(dund>0||sund>0) {
                        System.out.print("undecyliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sund>0||dund>0||und>1){
                        System.out.print("jeden undecyliardów ");}
                    else {
                        System.out.print("undecyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa undecyliardy ");
                    break;
                case 3:
                    System.out.print("trzy undecyliardy ");
                    break;
                case 4:
                    System.out.print("cztery undecyliardy ");
                    break;
                case 5:
                    System.out.print("pięć undecyliardów ");
                    break;
                case 6:
                    System.out.print("sześć undecyliardów ");
                    break;
                case 7:
                    System.out.print("siedem undecyliardów ");
                    break;
                case 8:
                    System.out.print("osiem undecyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć undecyliardów ");
                    break;
            }
        }
    }
}



