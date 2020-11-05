package cc.jml1024.spring.boot.autoconfigure;

import cc.jml1024.kaptcha.impl.WaterRipple;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kaptcha")
public class KaptchaProperties {

    private String sessionKey = "KAPTCHA_SESSION_KEY";

    private String sessionDate = "KAPTCHA_SESSION_DATE";
    /**
     * value must be yes or no
     */
    private String border = "yes";

    private String borderColor = "black";

    private String borderThickness = "1";

    private String noiseColor = "black";

    private String noiseImpl = "cc.jml1024.kaptcha.impl.DefaultNoise";

    private String obscurificatorImpl = "cc.jml1024.kaptcha.impl.WaterRipple";

    private String producerImpl = "cc.jml1024.kaptcha.impl.DefaultKaptcha";

    private String textproducerImpl = "cc.jml1024.kaptcha.text.impl.DefaultTextCreator";

    private String textproducerCharString = "abcde2345678gfynmnpwx";

    private String textproducerCharLength = "5";

    private String textproducerFontNames = "Arial,Courier";

    private String textproducerFontColor = "black";

    private String textproducerFontSize = "40";

    private String textproducerCharSpace = "2";

    private String wordImpl = "cc.jml1024.kaptcha.text.impl.DefaultWordRenderer";

    private String backgroundImpl = "cc.jml1024.kaptcha.impl.DefaultBackground";

    private String backgroundClearFrom = "lightGray";

    private String backgroundClearTo = "white";

    private String imageWidth = "200";

    private String imageHeight = "50";


    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getBorderThickness() {
        return borderThickness;
    }

    public void setBorderThickness(String borderThickness) {
        this.borderThickness = borderThickness;
    }

    public String getNoiseColor() {
        return noiseColor;
    }

    public void setNoiseColor(String noiseColor) {
        this.noiseColor = noiseColor;
    }

    public String getNoiseImpl() {
        return noiseImpl;
    }

    public void setNoiseImpl(String noiseImpl) {
        this.noiseImpl = noiseImpl;
    }

    public String getObscurificatorImpl() {
        return obscurificatorImpl;
    }

    public void setObscurificatorImpl(String obscurificatorImpl) {
        this.obscurificatorImpl = obscurificatorImpl;
    }

    public String getProducerImpl() {
        return producerImpl;
    }

    public void setProducerImpl(String producerImpl) {
        this.producerImpl = producerImpl;
    }

    public String getTextproducerImpl() {
        return textproducerImpl;
    }

    public void setTextproducerImpl(String textproducerImpl) {
        this.textproducerImpl = textproducerImpl;
    }

    public String getTextproducerCharString() {
        return textproducerCharString;
    }

    public void setTextproducerCharString(String textproducerCharString) {
        this.textproducerCharString = textproducerCharString;
    }

    public String getTextproducerCharLength() {
        return textproducerCharLength;
    }

    public void setTextproducerCharLength(String textproducerCharLength) {
        this.textproducerCharLength = textproducerCharLength;
    }

    public String getTextproducerFontNames() {
        return textproducerFontNames;
    }

    public void setTextproducerFontNames(String textproducerFontNames) {
        this.textproducerFontNames = textproducerFontNames;
    }

    public String getTextproducerFontColor() {
        return textproducerFontColor;
    }

    public void setTextproducerFontColor(String textproducerFontColor) {
        this.textproducerFontColor = textproducerFontColor;
    }

    public String getTextproducerFontSize() {
        return textproducerFontSize;
    }

    public void setTextproducerFontSize(String textproducerFontSize) {
        this.textproducerFontSize = textproducerFontSize;
    }

    public String getTextproducerCharSpace() {
        return textproducerCharSpace;
    }

    public void setTextproducerCharSpace(String textproducerCharSpace) {
        this.textproducerCharSpace = textproducerCharSpace;
    }

    public String getWordImpl() {
        return wordImpl;
    }

    public void setWordImpl(String wordImpl) {
        this.wordImpl = wordImpl;
    }

    public String getBackgroundImpl() {
        return backgroundImpl;
    }

    public void setBackgroundImpl(String backgroundImpl) {
        this.backgroundImpl = backgroundImpl;
    }

    public String getBackgroundClearFrom() {
        return backgroundClearFrom;
    }

    public void setBackgroundClearFrom(String backgroundClearFrom) {
        this.backgroundClearFrom = backgroundClearFrom;
    }

    public String getBackgroundClearTo() {
        return backgroundClearTo;
    }

    public void setBackgroundClearTo(String backgroundClearTo) {
        this.backgroundClearTo = backgroundClearTo;
    }

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    @Override
    public String toString() {
        return "KaptchaProperties{" +
                "sessionKey='" + sessionKey + '\'' +
                ", sessionDate='" + sessionDate + '\'' +
                ", border='" + border + '\'' +
                ", borderColor='" + borderColor + '\'' +
                ", borderThickness='" + borderThickness + '\'' +
                ", noiseColor='" + noiseColor + '\'' +
                ", noiseImpl='" + noiseImpl + '\'' +
                ", obscurificatorImpl='" + obscurificatorImpl + '\'' +
                ", producerImpl='" + producerImpl + '\'' +
                ", textproducerImpl='" + textproducerImpl + '\'' +
                ", textproducerCharString='" + textproducerCharString + '\'' +
                ", textproducerCharLength='" + textproducerCharLength + '\'' +
                ", textproducerFontNames='" + textproducerFontNames + '\'' +
                ", textproducerFontColor='" + textproducerFontColor + '\'' +
                ", textproducerFontSize='" + textproducerFontSize + '\'' +
                ", textproducerCharSpace='" + textproducerCharSpace + '\'' +
                ", wordImpl='" + wordImpl + '\'' +
                ", backgroundImpl='" + backgroundImpl + '\'' +
                ", backgroundClearFrom='" + backgroundClearFrom + '\'' +
                ", backgroundClearTo='" + backgroundClearTo + '\'' +
                ", imageWidth='" + imageWidth + '\'' +
                ", imageHeight='" + imageHeight + '\'' +
                '}';
    }
}
