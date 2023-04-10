public class tablica16 extends tablica15 {
    void tablica16() {
        switch (sno) {
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
        if(dno==1&&no==1) {
            System.out.print("jedenaście nonilionów ");
        } else if(dno==1&&no==2) {
            System.out.print("dwanaście nonilionów ");
        } else if(dno==1&&no==3) {
            System.out.print("trzynaście nonilionów ");
        } else if(dno==1&&no==4) {
            System.out.print("czternaście nonilionów ");
        } else if(dno==1&&no==5) {
            System.out.print("piętnaście nonilionów ");
        } else if(dno==1&&no==6) {
            System.out.print("szesnaście nonilionów ");
        } else if(dno==1&&no==7) {
            System.out.print("siedemnaście nonilionów ");
        } else if(dno==1&&no==8) {
            System.out.print("osiemmnaście nonilionów ");
        } else if(dno==1&&no==9) {
            System.out.print("dziewiętnaście nonilionów ");
        } else {
            switch (dno) {
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
            switch (no) {
                case 0:
                    if(dno>0||sno>0) {
                        System.out.print("nonilionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sno>0||dno>0||no>1){
                        System.out.print("jeden nonilionów ");}
                    else {
                        System.out.print("nonilion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa noniliony ");
                    break;
                case 3:
                    System.out.print("trzy noniliony ");
                    break;
                case 4:
                    System.out.print("cztery noniliony ");
                    break;
                case 5:
                    System.out.print("pięć nonilionów ");
                    break;
                case 6:
                    System.out.print("sześć nonilionów ");
                    break;
                case 7:
                    System.out.print("siedem nonilionów ");
                    break;
                case 8:
                    System.out.print("osiem nonilionów ");
                    break;
                case 9:
                    System.out.print("dziewięć nonilionów ");
                    break;
            }
        }
    }
}



