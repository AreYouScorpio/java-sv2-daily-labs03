package day02;

public class Prim {

    private boolean still_prim = true;
    private int prim=1;
    private int counter=0;

    public Prim (int prim){
       this.prim = prim;
    }


    public boolean checkPrim() {
        for (int i = 1 ; i <=prim ; i ++) {
            if (prim % i == 0) {
                counter++;
                if (counter > 2 && prim%i==0) {
                    still_prim = false;
                }
            }
            {
            }
        }
        // if (counter>2){still_prim = false;}
        return still_prim;
    }

}
