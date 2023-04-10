public class tablica1 extends dzialanie {
    void tablica1() {
        switch (sseksdecyliard) {
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
        }if(dseksdecyliard==1&&seksdecyliard==0) {
            System.out.print("jeden gugol ");
        }else  if(dseksdecyliard==1&&seksdecyliard==1) {
            System.out.print("jedenaście seksdecyliardów ");
        } else if(dseksdecyliard==1&&seksdecyliard==2) {
            System.out.print("dwanaście seksdecyliardów ");
        } else if(dseksdecyliard==1&&seksdecyliard==3) {
            System.out.print("trzynaście seksdecyliardów ");
        } else if(dseksdecyliard==1&&seksdecyliard==4) {
            System.out.print("czternaście seksdecyliardów ");
        } else if(dseksdecyliard==1&&seksdecyliard==5) {
            System.out.print("piętnaście seksdecyliardów ");
        } else if(dseksdecyliard==1&&seksdecyliard==6) {
            System.out.print("szesnaście seksdecyliardów ");
        } else if(dseksdecyliard==1&&seksdecyliard==7) {
            System.out.print("siedemnaście seksdecyliardów ");
        } else if(dseksdecyliard==1&&seksdecyliard==8) {
            System.out.print("osiemmnaście seksdecyliardów ");
        } else if(dseksdecyliard==1&&seksdecyliard==9) {
            System.out.print("dziewiętnaście seksdecyliardów ");
        } else {
            switch (dseksdecyliard) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("jeden gugol ");
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
            switch (seksdecyliard) {
                case 0:
                    if(dseksdecyliard>0||sseksdecyliard>0) {
                        System.out.print("seksdecyliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sseksdecyliard>0||dseksdecyliard>0||seksdecyliard>1){
                        System.out.print("jeden seksdecyliardów  ");}
                    else {
                        System.out.print("seksdecyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa seksdecyliardy ");
                    break;
                case 3:
                    System.out.print("trzy seksdecyliardy ");
                    break;
                case 4:
                    System.out.print("cztery seksdecyliardy ");
                    break;
                case 5:
                    System.out.print("pięć seksdecyliardów ");
                    break;
                case 6:
                    System.out.print("sześć seksdecyliardów ");
                    break;
                case 7:
                    System.out.print("siedem seksdecyliardów ");
                    break;
                case 8:
                    System.out.print("osiem seksdecyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć seksdecyliardów ");
                    break;
            }
        }
    }
}



