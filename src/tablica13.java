public class tablica13 extends tablica12 {
    void tablica13() {
        switch (sdecd) {
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
        if(ddecd==1&&decd==1) {
            System.out.print("jedenaście decyliardów ");
        } else if(ddecd==1&&decd==2) {
            System.out.print("dwanaście decyliardów ");
        } else if(ddecd==1&&decd==3) {
            System.out.print("trzynaście decyliardów ");
        } else if(ddecd==1&&decd==4) {
            System.out.print("czternaście decyliardów ");
        } else if(ddecd==1&&decd==5) {
            System.out.print("piętnaście decyliardów ");
        } else if(ddecd==1&&decd==6) {
            System.out.print("szesnaście decyliardów ");
        } else if(ddecd==1&&decd==7) {
            System.out.print("siedemnaście decyliardów ");
        } else if(ddecd==1&&decd==8) {
            System.out.print("osiemmnaście decyliardów ");
        } else if(ddecd==1&&decd==9) {
            System.out.print("dziewiętnaście decyliardów ");
        } else {
            switch (ddecd) {
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
            switch (decd) {
                case 0:
                    if(ddecd>0||sdecd>0) {
                        System.out.print("decylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sdecd>0||ddecd>0||decd>1){
                        System.out.print("jeden decyliardów ");}
                    else {
                        System.out.print("decyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa decyliardy ");
                    break;
                case 3:
                    System.out.print("trzy decyliardy ");
                    break;
                case 4:
                    System.out.print("cztery decyliardy ");
                    break;
                case 5:
                    System.out.print("pięć decyliardy ");
                    break;
                case 6:
                    System.out.print("sześć decyliardów ");
                    break;
                case 7:
                    System.out.print("siedem decyliardów ");
                    break;
                case 8:
                    System.out.print("osiem decyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć decyliardów ");
                    break;
            }
        }
    }
}



