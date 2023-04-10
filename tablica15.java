public class tablica15 extends tablica14 {
    void tablica15() {
        switch (snod) {
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
        if(dnod==1&&nod==1) {
            System.out.print("jedenaście noniliardów ");
        } else if(dnod==1&&nod==2) {
            System.out.print("dwanaście noniliardów ");
        } else if(dnod==1&&nod==3) {
            System.out.print("trzynaście noniliardów ");
        } else if(dnod==1&&nod==4) {
            System.out.print("czternaście noniliardów ");
        } else if(dnod==1&&nod==5) {
            System.out.print("piętnaście noniliardów ");
        } else if(dnod==1&&nod==6) {
            System.out.print("szesnaście noniliardów ");
        } else if(dnod==1&&nod==7) {
            System.out.print("siedemnaście noniliardów ");
        } else if(dnod==1&&nod==8) {
            System.out.print("osiemmnaście noniliardów ");
        } else if(dnod==1&&nod==9) {
            System.out.print("dziewiętnaście noniliardów ");
        } else {
            switch (dnod) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("dziesięć");
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
            switch (nod) {
                case 0:
                    if(dnod>0||snod>0) {
                        System.out.print("noniliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(snod>0||dnod>0||nod>1){
                        System.out.print("jeden noniliardów ");}
                    else {
                        System.out.print("noniliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa noniliardy ");
                    break;
                case 3:
                    System.out.print("trzy noniliardy ");
                    break;
                case 4:
                    System.out.print("cztery noniliardy ");
                    break;
                case 5:
                    System.out.print("pięć noniliardów ");
                    break;
                case 6:
                    System.out.print("sześć noniliardów ");
                    break;
                case 7:
                    System.out.print("siedem noniliardów ");
                    break;
                case 8:
                    System.out.print("osiem noniliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć noniliardów ");
                    break;
            }
        }
    }
}



