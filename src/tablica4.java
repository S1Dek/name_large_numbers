public class tablica4 extends tablica3 {
    void tablica4()
    {
        switch (skwidecylion) {
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
        if(dkwidecylion==1&&kwidecylion==1) {
            System.out.print("jedenaście kwidecylionów ");
        } else if(dkwidecylion==1&&kwidecylion==2) {
            System.out.print("dwanaście kwidecylionów ");
        } else if(dkwidecylion==1&&kwidecylion==3) {
            System.out.print("trzynaście kwidecylionów ");
        } else if(dkwidecylion==1&&kwidecylion==4) {
            System.out.print("czternaście kwidecylionów ");
        } else if(dkwidecylion==1&&kwidecylion==5) {
            System.out.print("piętnaście kwidecylionów ");
        } else if(dkwidecylion==1&&kwidecylion==6) {
            System.out.print("szesnaście kwidecylionów ");
        } else if(dkwidecylion==1&&kwidecylion==7) {
            System.out.print("siedemnaście kwidecylionów ");
        } else if(dkwidecylion==1&&kwidecylion==8) {
            System.out.print("osiemmnaście kwidecylionów ");
        } else if(dkwidecylion==1&&kwidecylion==9) {
            System.out.print("dziewiętnaście kwidecylionów ");
        } else {
            switch (dkwidecylion) {
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
            switch (kwidecylion) {
                case 0:
                    if(dkwidecylion>0||skwidecylion>0) {
                        System.out.print("kwidecylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(skwidecylion>0||dkwidecylion>0||kwidecylion>1){
                        System.out.print("jeden kwidecylionów  ");}
                    else {
                        System.out.print("kwidecylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa kwidecyliony ");
                    break;
                case 3:
                    System.out.print("trzy kwidecyliony ");
                    break;
                case 4:
                    System.out.print("cztery kwidecyliony ");
                    break;
                case 5:
                    System.out.print("pięć kwidecylionów ");
                    break;
                case 6:
                    System.out.print("sześć kwidecylionów ");
                    break;
                case 7:
                    System.out.print("siedem kwidecylionów ");
                    break;
                case 8:
                    System.out.print("osiem kwidecylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć kwidecylionów ");
                    break;
            }
        }
    }
}



