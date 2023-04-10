public class tablica2 extends tablica1 {
    void tablica2()
    {
        switch (sseksdecylion) {
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
        if(dseksdecylion==1&&seksdecylion==1) {
            System.out.print("jedenaście seksdecylionów ");
        } else if(dseksdecylion==1&&seksdecylion==2) {
            System.out.print("dwanaście seksdecylionów ");
        } else if(dseksdecylion==1&&seksdecylion==3) {
            System.out.print("trzynaście seksdecylionów ");
        } else if(dseksdecylion==1&&seksdecylion==4) {
            System.out.print("czternaście seksdecylionów ");
        } else if(dseksdecylion==1&&seksdecylion==5) {
            System.out.print("piętnaście seksdecylionów ");
        } else if(dseksdecylion==1&&seksdecylion==6) {
            System.out.print("szesnaście seksdecylionów ");
        } else if(dseksdecylion==1&&seksdecylion==7) {
            System.out.print("siedemnaście seksdecylionów ");
        } else if(dseksdecylion==1&&seksdecylion==8) {
            System.out.print("osiemmnaście seksdecylionów ");
        } else if(dseksdecylion==1&&seksdecylion==9) {
            System.out.print("dziewiętnaście seksdecylionów ");
        } else {
            switch (dseksdecylion) {
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
            switch (seksdecylion) {
                case 0:
                    if(dseksdecylion>0||sseksdecylion>0) {
                        System.out.print("seksdecylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sseksdecylion>0||dseksdecylion>0||seksdecylion>1){
                        System.out.print("jeden seksdecylionów  ");}
                    else {
                        System.out.print("seksdecylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa seksdecyliony ");
                    break;
                case 3:
                    System.out.print("trzy seksdecyliony ");
                    break;
                case 4:
                    System.out.print("cztery seksdecyliony ");
                    break;
                case 5:
                    System.out.print("pięć seksdecylionów ");
                    break;
                case 6:
                    System.out.print("sześć seksdecylionów ");
                    break;
                case 7:
                    System.out.print("siedem seksdecylionów ");
                    break;
                case 8:
                    System.out.print("osiem seksdecylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć seksdecylionów ");
                    break;
            }
        }
    }
}





