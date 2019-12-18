package pgdp.color;

import javax.naming.AuthenticationNotSupportedException;

public class RgbColor{
    private final int red;
    private final int green;
    private final int blue;
    private final int bitDepth;
    private final int validityMaxBit = Integer.MAX_VALUE;    //equals Math.pow(2, getBitDepth())-1
/*    private int max1Bit = IntMath.powerOfTwo(0);  //1
    private int max2Bit = IntMath.powerOfTwo(1) + max1Bit;  //3
    private int max3Bit = IntMath.powerOfTwo(2) + max2Bit;  //7
    private int max4Bit = IntMath.powerOfTwo(3) + max3Bit;  //15
    private int max5Bit = IntMath.powerOfTwo(4) + max4Bit;  //31
    private int max6Bit = IntMath.powerOfTwo(5) + max5Bit;  //63
    private int max7Bit = IntMath.powerOfTwo(6) + max6Bit;  //127
    private int max8Bit = IntMath.powerOfTwo(7) + max7Bit;  //255*/

    public RgbColor(int bitDepth, int red, int green, int blue){
        //check validity of bit-values here
        if(bitDepth < 1 || bitDepth > 31)
            throw new UnsupportedOperationException("The bit depth is not in reachable bounds");
        this.bitDepth = bitDepth;
        if(red < 0 || red > validityMaxBit)
            throw new UnsupportedOperationException("The color 'red' bit-value is not in reachable bounds");
        this.red = red;
        if(green < 0 || green > validityMaxBit)
            throw new UnsupportedOperationException("The color 'green' bit-value is not in reachable bounds");
        this.green = green;
        if(blue < 0 || blue > validityMaxBit)
            throw new UnsupportedOperationException("The color 'blue' bit-value is not in reachable bounds");
        this.blue = blue;
    }

    public RgbColor8Bit toRgbColor8Bit(){
        int redIn8bit = 0;
        int greenIn8bit = 0;
        int blueIn8bit = 0;
        int dif = bitDepth - 8; // difference between bitDepth and 8bit
        System.out.println(green);
        if(bitDepth == 8)
            //constructor
            return new RgbColor8Bit(red, green, blue);
        if(bitDepth > 8){
            int calculate8bitRed = (red / IntMath.powerOfTwo( dif - 1));// Division: denominator: 2 ^ dif - 1 ; numerator: color
            int calculate8bitRedLastBit = calculate8bitRed % 2;
            redIn8bit = (calculate8bitRed / 2) + calculate8bitRedLastBit;
                if(redIn8bit > 255)
                    redIn8bit = 255;
                if(redIn8bit < 0)
                    redIn8bit = 0;
            int calculate8bitGreen = (green / IntMath.powerOfTwo( dif - 1));
            int calculate8bitGreenLastBit = calculate8bitGreen % 2;
                    greenIn8bit = (calculate8bitGreen / 2) + calculate8bitGreenLastBit;
                if(greenIn8bit > 255)
                    greenIn8bit = 255;
                if(greenIn8bit < 0)
                    greenIn8bit = 0;
            int calculate8bitBlue = (blue / IntMath.powerOfTwo( dif - 1));
            int calculate8bitBlueLastBit = calculate8bitBlue % 2;
            blueIn8bit = (calculate8bitBlue / 2) + calculate8bitBlueLastBit;
                if(blueIn8bit > 255)
                    blueIn8bit = 255;
                if(blueIn8bit < 0)
                    blueIn8bit = 0;
                //constructor
            return new RgbColor8Bit(redIn8bit, greenIn8bit, blueIn8bit);
        }
        if(bitDepth < 8){ // convert to 8 bit cast binary with 0b
            dif = 8 - bitDepth;
            String str = Integer.toBinaryString(red);
            while(str.length() < bitDepth)
                str = "0" + str;
            System.out.println("To binary string red:" + str);
            redIn8bit = castToBinary(dif, str);
            str = Integer.toBinaryString(green);
            while(str.length() < bitDepth)
                str = "0" + str;
            //System.out.println("To binary string green:" + str); //TODO: when e.G. 011 converted with toBinaryString 11 comes out
            greenIn8bit = castToBinary(dif, str);
            str = Integer.toBinaryString(blue);
            while(str.length() < bitDepth)
                str = "0" + str;
            blueIn8bit = castToBinary(dif, str);
        }
        //constructor
        return new RgbColor8Bit(redIn8bit, greenIn8bit, blueIn8bit);
    }

    //binary numbers can be visualized by the power of two
    //max binary for 8bit is 0b11111111
   public int castToBinary(int dif, String str){
                if(str.length() == 1){
                    for(int i = 0; i < 8; i++){
                        str += str;
                    }
                    str = str.substring(0, Math.min(str.length(), 8)); //shortens the String to 8 digits
                    System.out.println("String after Conversion:" + str);
                    return Integer.parseInt(str, 2);
                }else if(str.length() == 2){
                    for(int i = 0; i < 4; i++){
                        str += str;
                    }
                    str = str.substring(0, Math.min(str.length(), 8)); //shortens the String to 8 digits
                    return Integer.parseInt(str, 2);
                }else if(str.length() == 3) {
                    for (int i = 0; i < 3; i++) {
                        str += str;
                    }
                    str = str.substring(0, Math.min(str.length(), 8)); //shortens the String to 8 digits
                    return Integer.parseInt(str, 2);
                }else if(str.length() == 4){
                    for (int i = 0; i < 2; i++) {
                    str += str;
                    }
                    str = str.substring(0, Math.min(str.length(), 8)); //shortens the String to 8 digits
                    return Integer.parseInt(str, 2);
                }else if(str.length() == 5) {
                    for (int i = 0; i < 2; i++) {
                        str += str;
                    }
                    str = str.substring(0, Math.min(str.length(), 8)); //shortens the String to 8 digits
                    return Integer.parseInt(str, 2);
                }else if(str.length() == 6) {
                    for (int i = 0; i < 2; i++) {
                        str += str;
                    }
                    str = str.substring(0, Math.min(str.length(), 8)); //shortens the String to 8 digits
                    return Integer.parseInt(str, 2);
                }else if(str.length() == 7) {
                    for (int i = 0; i < 2; i++) {
                        str += str;
                    }
                    str = str.substring(0, Math.min(str.length(), 8)); //shortens the String to 8 digits
                    return Integer.parseInt(str, 2);
                }
                    throw new UnsupportedOperationException("Error"); //throws Error if nothing is executed
    }

    public int getRed(){
        return red;
    }
    public int getGreen(){
        return green;
    }
    public int getBlue(){
        return blue;
    }
    public int getBitDepth(){
        return bitDepth;
    }
    public int getValidityMaxBit(){
        return validityMaxBit;
    }
}
