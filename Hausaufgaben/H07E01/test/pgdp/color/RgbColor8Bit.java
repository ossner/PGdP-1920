package pgdp.color;

public class RgbColor8Bit extends RgbColor{

    public RgbColor8Bit(int red, int green, int blue){
        super(8, red, green, blue);
    }

    public RgbColor8Bit toRgbColor8Bit(int redIn8bit, int greenIn8bit, int blueIn8bit){
        return new RgbColor8Bit(redIn8bit, greenIn8bit, blueIn8bit);
    }

}
