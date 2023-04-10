public class tablica7 extends tablica6 {
    void tablica7()
    {
        switch (stridecd) {
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
        if(dtridecd==1&& tridecd==1) {
            System.out.print("jedenaście tridecyliardów ");
        } else if(dtridecd==1&& tridecd==2) {
            System.out.print("dwanaście tridecyliardów ");
        } else if(dtridecd==1&& tridecd==3) {
            System.out.print("trzynaście tridecyliardów ");
        } else if(dtridecd==1&& tridecd==4) {
            System.out.print("czternaście tridecyliardów ");
        } else if(dtridecd==1&& tridecd==5) {
            System.out.print("piętnaście tridecyliardów ");
        } else if(dtridecd==1&& tridecd==6) {
            System.out.print("szesnaście tridecyliardów ");
        } else if(dtridecd==1&& tridecd==7) {
            System.out.print("siedemnaście tridecyliardów ");
        } else if(dtridecd==1&& tridecd==8) {
            System.out.print("osiemmnaście tridecyliardów ");
        } else if(dtridecd==1&& tridecd==9) {
            System.out.print("dziewiętnaście tridecyliardów ");
        } else {
            switch (dtridecd) {
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
            switch (tridecd) {
                case 0:
                    if(dtridecd>0||stridecd>0) {
                        System.out.print("tridecyliardów");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(stridecd>0||dtridecd>0||tridecd>1){
                        System.out.print("jeden tridecyliardów  ");}
                    else {
                        System.out.print("tridecyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa tridecyliardy ");
                    break;
                case 3:
                    System.out.print("trzy tridecyliardy ");
                    break;
                case 4:
                    System.out.print("cztery tridecyliardy ");
                    break;
                case 5:
                    System.out.print("pięć tridecyliardów ");
                    break;
                case 6:
                    System.out.print("sześć tridecyliardów ");
                    break;
                case 7:
                    System.out.print("siedem tridecyliardów ");
                    break;
                case 8:
                    System.out.print("osiem tridecyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć tridecyliardów ");
                    break;
            }
        }
    }
}




