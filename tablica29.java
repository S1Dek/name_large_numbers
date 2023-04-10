public class tablica29 extends tablica28 {
    void tablica29() {
        switch (sbild) {
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
        if(dbild==1&&bild==1) {
            System.out.print("jedenaście biliardów ");
        } else if(dbild==1&&bild==2) {
            System.out.print("dwanaście biliardów ");
        } else if(dbild==1&&bild==3) {
            System.out.print("trzynaście biliardów ");
        } else if(dbild==1&&bild==4) {
            System.out.print("czternaście biliardów ");
        } else if(dbild==1&&bild==5) {
            System.out.print("piętnaście biliardów ");
        } else if(dbild==1&&bild==6) {
            System.out.print("szesnaście biliardów ");
        } else if(dbild==1&&bild==7) {
            System.out.print("siedemnaście biliardów ");
        } else if(dbild==1&&bild==8) {
            System.out.print("osiemmnaście biliardów ");
        } else if(dbild==1&&bild==9) {
            System.out.print("dziewiętnaście biliardów ");
        } else {
            switch (dbild) {
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
            switch (bild) {
                case 0:
                    if(dbild>0||sbild>0) {
                        System.out.print("biliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sbild>0||dbild>0||bild>1){
                        System.out.print("jeden biliardów ");}
                    else {
                        System.out.print("biliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa biliardy ");
                    break;
                case 3:
                    System.out.print("trzy biliardy ");
                    break;
                case 4:
                    System.out.print("cztery biliardy ");
                    break;
                case 5:
                    System.out.print("pięć biliardów ");
                    break;
                case 6:
                    System.out.print("sześć biliardów ");
                    break;
                case 7:
                    System.out.print("siedem biliardów ");
                    break;
                case 8:
                    System.out.print("osiem biliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć biliardów ");
                    break;
            }
        }
    }
}

