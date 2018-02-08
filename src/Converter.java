import java.util.HashMap;

public class Converter {

    private HashMap<Integer, Float> map = new HashMap<>();

    public Converter() {
        this.map.put(1980, 1.0f);
        this.map.put(1981, 1.10f);
        this.map.put(1982, 1.06f);
        this.map.put(1983, 1.03f);
        this.map.put(1984, 1.04f);
        this.map.put(1985, 1.04f);
        this.map.put(1986, 1.02f);
        this.map.put(1987, 1.04f);
        this.map.put(1988, 1.04f);
        this.map.put(1989, 1.05f);
        this.map.put(1990, 1.05f);
        this.map.put(1991, 1.04f);
        this.map.put(1992, 1.03f);
        this.map.put(1993, 1.03f);
        this.map.put(1994, 1.03f);
        this.map.put(1995, 1.03f);
        this.map.put(1996, 1.03f);
        this.map.put(1997, 1.02f);
        this.map.put(1998, 1.02f);
        this.map.put(1999, 1.02f);
        this.map.put(2000, 1.03f);
        this.map.put(2001, 1.03f);
        this.map.put(2002, 1.02f);
        this.map.put(2003, 1.02f);
        this.map.put(2004, 1.03f);
        this.map.put(2005, 1.03f);
        this.map.put(2006, 1.03f);
        this.map.put(2007, 1.03f);
        this.map.put(2008, 1.04f);
        this.map.put(2009, 1.00f);
        this.map.put(2010, 1.02f);
        this.map.put(2011, 1.03f);
        this.map.put(2012, 1.02f);
        this.map.put(2013, 1.01f);
        this.map.put(2014, 1.02f);
        this.map.put(2015, 1.00f);
        this.map.put(2016, 1.01f);
        this.map.put(2017, 1.02f);
        this.map.put(2018, 1.01f);
    }

    public Float convert(int volume, int startYear, int endYear) {
        Float result = 0f;
        Float coef = 1f;
        for (HashMap.Entry<Integer, Float> entry : map.entrySet()
                ) {
            if (entry.getKey() > startYear && entry.getKey() <= endYear) {
                coef = coef * entry.getValue();
            }
        }
        result = volume * coef;

        return result;
    }


}
