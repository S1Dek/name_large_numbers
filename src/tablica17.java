public class tablica17 extends tablica16 {
    void tablica17() {
        switch (sokd) {
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
        if(dokd==1&&okd==1) {
            System.out.print("jedenaście oktyliardów ");
        } else if(dokd==1&&okd==2) {
            System.out.print("dwanaście oktyliardów ");
        } else if(dokd==1&&okd==3) {
            System.out.print("trzynaście oktyliardów ");
        } else if(dokd==1&&okd==4) {
            System.out.print("czternaście oktyliardów ");
        } else if(dokd==1&&okd==5) {
            System.out.print("piętnaście oktyliardów ");
        } else if(dokd==1&&okd==6) {
            System.out.print("szesnaście oktyliardów ");
        } else if(dokd==1&&okd==7) {
            System.out.print("siedemnaście oktyliardów ");
        } else if(dokd==1&&okd==8) {
            System.out.print("osiemmnaście oktyliardów ");
        } else if(dokd==1&&okd==9) {
            System.out.print("dziewiętnaście oktyliardów ");
        } else {
            switch (dokd) {
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
            switch (okd) {
                case 0:
                    if(dokd>0||sokd>0) {
                        System.out.print("oktyliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sokd>0||dokd>0||okd>1){
                        System.out.print("jeden oktyliardów ");}
                    else {
                        System.out.print("oktyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa oktyliardy ");
                    break;
                case 3:
                    System.out.print("trzy oktyliardy ");
                    break;
                case 4:
                    System.out.print("cztery oktyliardy ");
                    break;
                case 5:
                    System.out.print("pięć oktyliardów ");
                    break;
                case 6:
                    System.out.print("sześć oktyliardów ");
                    break;
                case 7:
                    System.out.print("siedem oktyliardów ");
                    break;
                case 8:
                    System.out.print("osiem oktyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć oktyliardów ");
                    break;
            }
        }
    }
}



