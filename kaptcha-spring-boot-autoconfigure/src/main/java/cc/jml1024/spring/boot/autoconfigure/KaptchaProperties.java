package cc.jml1024.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.Properties;
import java.util.StringJoiner;

@ConfigurationProperties(prefix = "spring.kaptcha")
public class KaptchaProperties {
    private Border border = new Border();
    private Noise noise = new Noise();
    private Obscurificator obscurificator = new Obscurificator();
    private Producer producer = new Producer();
    private TextProducer textProducer = new TextProducer();
    private Word word = new Word();
    private Background background = new Background();
    private Image image = new Image();

    public static class Border {
        private Boolean enabled = true;
        private String color = "0,0,0";
        private Integer thickness = 1;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Integer getThickness() {
            return thickness;
        }

        public void setThickness(Integer thickness) {
            this.thickness = thickness;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Border.class.getSimpleName() + "[", "]")
                    .add("enabled=" + enabled)
                    .add("color='" + color + "'")
                    .add("thickness=" + thickness)
                    .toString();
        }
    }

    public static class Noise {
        private String color = "0,0,0";
        private String impl = "cc.jml1024.kaptcha.impl.DefaultNoise";

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getImpl() {
            return impl;
        }

        public void setImpl(String impl) {
            this.impl = impl;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Noise.class.getSimpleName() + "[", "]")
                    .add("color='" + color + "'")
                    .add("impl='" + impl + "'")
                    .toString();
        }
    }

    public static class Obscurificator {
        private String impl = "cc.jml1024.kaptcha.impl.WaterRipple";

        public String getImpl() {
            return impl;
        }

        public void setImpl(String impl) {
            this.impl = impl;
        }
    }

    public static class Producer {
        private String impl = "cc.jml1024.kaptcha.impl.DefaultProducer";

        public String getImpl() {
            return impl;
        }

        public void setImpl(String impl) {
            this.impl = impl;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Producer.class.getSimpleName() + "[", "]")
                    .add("impl='" + impl + "'")
                    .toString();
        }
    }


    public static class TextProducer {
        private String impl = "cc.jml1024.kaptcha.text.impl.DefaultTextCreator";

        private Char character = new Char();

        private Font font = new Font();

        public static class Char {
            private String string = "abcde2345678gfynmnpwx";

            private Integer length = 5;

            private Integer space = 2;

            public String getString() {
                return string;
            }

            public void setString(String string) {
                this.string = string;
            }

            public Integer getLength() {
                return length;
            }

            public void setLength(Integer length) {
                this.length = length;
            }

            public Integer getSpace() {
                return space;
            }

            public void setSpace(Integer space) {
                this.space = space;
            }

            @Override
            public String toString() {
                return new StringJoiner(", ", Char.class.getSimpleName() + "[", "]")
                        .add("string='" + string + "'")
                        .add("length=" + length)
                        .add("space=" + space)
                        .toString();
            }
        }

        public static class Font {
            private String[] names = new String[]{"Arial", "Courier"};

            private String color = "0,0,0";

            private Integer size = 40;

            public String[] getNames() {
                return names;
            }

            public void setNames(String[] names) {
                this.names = names;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public Integer getSize() {
                return size;
            }

            public void setSize(Integer size) {
                this.size = size;
            }

            @Override
            public String toString() {
                return new StringJoiner(", ", Font.class.getSimpleName() + "[", "]")
                        .add("names=" + Arrays.toString(names))
                        .add("color='" + color + "'")
                        .add("size=" + size)
                        .toString();
            }
        }

        public String getImpl() {
            return impl;
        }

        public void setImpl(String impl) {
            this.impl = impl;
        }

        public Char getCharacter() {
            return character;
        }

        public void setCharacter(Char character) {
            this.character = character;
        }

        public Font getFont() {
            return font;
        }

        public void setFont(Font font) {
            this.font = font;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", TextProducer.class.getSimpleName() + "[", "]")
                    .add("impl='" + impl + "'")
                    .add("character=" + character)
                    .add("font=" + font)
                    .toString();
        }
    }

    public static class Word {
        private String impl = "cc.jml1024.kaptcha.text.impl.DefaultWordRenderer";

        public String getImpl() {
            return impl;
        }

        public void setImpl(String impl) {
            this.impl = impl;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Word.class.getSimpleName() + "[", "]")
                    .add("impl='" + impl + "'")
                    .toString();
        }
    }

    public static class Background {
        private String impl = "cc.jml1024.kaptcha.impl.DefaultBackground";
        private String clearFrom = "192,192,192";
        private String clearTo = "255,255,255";

        public String getImpl() {
            return impl;
        }

        public void setImpl(String impl) {
            this.impl = impl;
        }

        public String getClearFrom() {
            return clearFrom;
        }

        public void setClearFrom(String clearFrom) {
            this.clearFrom = clearFrom;
        }

        public String getClearTo() {
            return clearTo;
        }

        public void setClearTo(String clearTo) {
            this.clearTo = clearTo;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Background.class.getSimpleName() + "[", "]")
                    .add("impl='" + impl + "'")
                    .add("clearFrom='" + clearFrom + "'")
                    .add("clearTo='" + clearTo + "'")
                    .toString();
        }
    }

    public static class Image {
        private Integer width = 200;
        private Integer height = 50;
        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Image.class.getSimpleName() + "[", "]")
                    .add("width=" + width)
                    .add("height=" + height)
                    .toString();
        }
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public Noise getNoise() {
        return noise;
    }

    public void setNoise(Noise noise) {
        this.noise = noise;
    }

    public Obscurificator getObscurificator() {
        return obscurificator;
    }

    public void setObscurificator(Obscurificator obscurificator) {
        this.obscurificator = obscurificator;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public TextProducer getTextProducer() {
        return textProducer;
    }

    public void setTextProducer(TextProducer textProducer) {
        this.textProducer = textProducer;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
    public Properties toProperties() {
        Properties properties = new Properties();
        Boolean border = this.getBorder().getEnabled();
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_BORDER, (border == null ? "" : (Boolean.FALSE.equals(border) ? "no" : "yes")));
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_BORDER_COLOR, this.getBorder().getColor());
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_BORDER_THICKNESS, String.valueOf(this.getBorder().getThickness()));

        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_NOISE_COLOR, this.getNoise().getColor());
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_NOISE_IMPL, this.getNoise().getImpl());

        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_OBSCURIFICATOR_IMPL, this.getObscurificator().getImpl());

        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_PRODUCER_IMPL, this.getProducer().getImpl());

        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_TEXTPRODUCER_IMPL, this.getTextProducer().getImpl());
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_TEXTPRODUCER_CHAR_STRING, this.getTextProducer().getCharacter().getString());
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH, String.valueOf(this.getTextProducer().getCharacter().getLength()));
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_TEXTPRODUCER_CHAR_SPACE, String.valueOf(this.getTextProducer().getCharacter().getSpace()));
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_TEXTPRODUCER_FONT_NAMES, String.join(",", this.getTextProducer().getFont().getNames()));
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR, String.valueOf(this.getTextProducer().getFont().getColor()));
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_TEXTPRODUCER_FONT_SIZE, String.valueOf(this.getTextProducer().getFont().getSize()));

        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_WORDRENDERER_IMPL, this.getWord().getImpl());

        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_BACKGROUND_IMPL, this.getBackground().getImpl());
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_BACKGROUND_CLR_FROM, this.getBackground().getClearFrom());
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_BACKGROUND_CLR_TO, this.getBackground().getClearTo());

        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_IMAGE_WIDTH, String.valueOf(this.getImage().getWidth()));
        properties.setProperty(cc.jml1024.kaptcha.Constants.KAPTCHA_IMAGE_HEIGHT, String.valueOf(this.getImage().getHeight()));
        return properties;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", KaptchaProperties.class.getSimpleName() + "[", "]")
                .add("border=" + border)
                .add("noise=" + noise)
                .add("obscurificator=" + obscurificator)
                .add("producer=" + producer)
                .add("textProducer=" + textProducer)
                .add("word=" + word)
                .add("background=" + background)
                .add("image=" + image)
                .toString();
    }
}
