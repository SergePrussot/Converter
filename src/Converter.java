import java.util.HashMap;

public class Converter {

    private HashMap<Integer, Float> map = new HashMap<Integer, Float>();

    public Converter() {
        this.map.put(1980, 1.0f);
        this.map.put(1990, 1.59f);
        this.map.put(2000, 2.09f);
    }

    public Float convert(int volume, int startYear, int endYear) {
        Float result = 0f;
        Float koefStart = map.get(startYear);
        Float koefEnd = map.get(endYear);
        Float koef = koefEnd - koefStart + 1;
        result = volume * koef;

        return result;
    }


}
