package cc.jml1024.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kaptcha")
public class KaptchaProperties {

    private String sessionKey;

    private String sessionDate;
    /**
     * value must be yes or no
     */
    private String border;

    private String borderColor;

    private String borderThickness;

    private String noiseColor;

    private String noiseImpl;

    private String obscurificatorImpl;

    private String producerImpl;

    private String textproducerImpl;

    private String textproducerCharString;

    private String textproducerCharLength;

    private String textproducerFontNames;

    private String textproducerFontColor;

    private String textproducerFontSize;

    private String textproducerCharSpace;

    private String wordImpl;

    private String backgroundImpl;

    private String backgroundClearFrom;

    private String backgroundClearTo;

    private String imageWidth;

    private String imageHeight;


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

}
