public class tablica26 extends tablica25 {
    void tablica26() {
        switch (skwad) {
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
        if(dkwad==1&&kwad==1) {
            System.out.print("jedenaście kwadrylionów ");
        } else if(dkwad==1&&kwad==2) {
            System.out.print("dwanaście kwadrylionów ");
        } else if(dkwad==1&&kwad==3) {
            System.out.print("trzynaście kwadrylionów ");
        } else if(dkwad==1&&kwad==4) {
            System.out.print("czternaście kwadrylionów ");
        } else if(dkwad==1&&kwad==5) {
            System.out.print("piętnaście kwadrylionów ");
        } else if(dkwad==1&&kwad==6) {
            System.out.print("szesnaście kwadrylionów ");
        } else if(dkwad==1&&kwad==7) {
            System.out.print("siedemnaście kwadrylionów ");
        } else if(dkwad==1&&kwad==8) {
            System.out.print("osiemmnaście kwadrylionów ");
        } else if(dkwad==1&&kwad==9) {
            System.out.print("dziewiętnaście kwadrylionów ");
        } else {
            switch (dkwad) {
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
            switch (kwad) {
                case 0:
                    if(dkwad>0||skwad>0) {
                        System.out.print("kwadrylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(skwad>0||dkwad>0||kwad>1){
                        System.out.print("jeden kwadrylionów ");}
                    else {
                        System.out.print("kwadrylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa kwadryliony ");
                    break;
                case 3:
                    System.out.print("trzy kwadryliony ");
                    break;
                case 4:
                    System.out.print("cztery kwadryliony ");
                    break;
                case 5:
                    System.out.print("pięć kwadrylionów ");
                    break;
                case 6:
                    System.out.print("sześć kwadrylionów ");
                    break;
                case 7:
                    System.out.print("siedem kwadrylionów ");
                    break;
                case 8:
                    System.out.print("osiem kwadrylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć kwadrylionów ");
                    break;
            }
        }
    }
}



