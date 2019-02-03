
public class Hamming {

    public char [] leftStrand;
    public char [] rightStrand;
    public int diff;

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand.toCharArray();
        this.rightStrand = rightStrand.toCharArray();
        this.diff = 0;
    }

    public int getHammingDistance() {

        if(this.leftStrand.length <= 0){
            return 0;
        }

        if (this.leftStrand.length != this.rightStrand.length)
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");


        for(int i = 0; i < this.rightStrand.length; i++ ){
            if (!(this.rightStrand[i] == this.leftStrand[i])){
                this.diff = this.diff + 1;
            }
        }
        return this.diff;
    }


}


