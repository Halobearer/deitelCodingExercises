package ChapterEight;

public enum GeoPoliticalZones {
    SOUTH_SOUTH(new String[]{"Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_CENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nassawara", "Niger", "Plateau"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Oyo", "Ondo", "Ogun"}),
    NORTH_WEST(new String[]{"Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"});

    //"Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"
    private String[] stateName;

    GeoPoliticalZones(String[] stateName) {
        //this.geoName = geoName;
        this.stateName = stateName;
    }

    public String[] getStateName() {
        return stateName;
    }

    public void setStateName(String[] stateName) {
        this.stateName = stateName;
    }

/*
    public String getGeoName() {
        return geoName;
    }
    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }
  private String geoName;
*/


}
