package pgdp.color;

public class RgbaColor extends RgbColor{
    private final int alpha;

    public RgbaColor(int bitDepth, int red, int green, int blue, int alpha){
        super(bitDepth, red, green, blue);
        if(alpha < 0 || alpha > getValidityMaxBit())
            throw new UnsupportedOperationException("The color's 'alpha' is not in reachable bounds");
        this.alpha = alpha;
    }

    public RgbColor8Bit toRgbColor8Bit(int redIn8bit, int greenIn8bit, int blueIn8bit, int alpha){
        if(alpha != getValidityMaxBit())
            throw new UnsupportedOperationException("Alpha value is not 255");
        if(alpha == getValidityMaxBit())
            super.toRgbColor8Bit();
        return new RgbColor8Bit(redIn8bit, greenIn8bit, blueIn8bit);
    }

    public int getAlpha() {
        return alpha;
    }
}
