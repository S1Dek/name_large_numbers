public class tablica28 extends tablica27 {
    void tablica28() {
        switch (stryl) {
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
        if(dtryl==1&&tryl==1) {
            System.out.print("jedenaście trylionów ");
        } else if(dtryl==1&&tryl==2) {
            System.out.print("dwanaście trylionów ");
        } else if(dtryl==1&&tryl==3) {
            System.out.print("trzynaście trylionów ");
        } else if(dtryl==1&&tryl==4) {
            System.out.print("czternaście trylionów ");
        } else if(dtryl==1&&tryl==5) {
            System.out.print("piętnaście trylionów ");
        } else if(dtryl==1&&tryl==6) {
            System.out.print("szesnaście trylionów ");
        } else if(dtryl==1&&tryl==7) {
            System.out.print("siedemnaście trylionów ");
        } else if(dtryl==1&&tryl==8) {
            System.out.print("osiemmnaście trylionów ");
        } else if(dtryl==1&&tryl==9) {
            System.out.print("dziewiętnaście trylionów ");
        } else {
            switch (dtryl) {
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
            switch (tryl) {
                case 0:
                    if(dtryl>0||stryl>0) {
                        System.out.print("trylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(stryl>0||dtryl>0||tryl>1){
                        System.out.print("jeden trylionów ");}
                    else {
                        System.out.print("trylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa tryliony ");
                    break;
                case 3:
                    System.out.print("trzy tryliony ");
                    break;
                case 4:
                    System.out.print("cztery tryliony ");
                    break;
                case 5:
                    System.out.print("pięć trylionów ");
                    break;
                case 6:
                    System.out.print("sześć trylionów ");
                    break;
                case 7:
                    System.out.print("siedem trylionów ");
                    break;
                case 8:
                    System.out.print("osiem trylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć trylionów ");
                    break;
            }
        }
    }
}


